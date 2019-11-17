package com.pinpinduo.utils;


import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.util.concurrent.Future;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/*********************************
 * @作者 67582
 * @项目名 Spring-Cloud-Demo
 * @时间 2019/3/22 18:06
 * @Version 1.0,
 *********************************/
public class TCPServer {

    private Logger log = LoggerFactory.getLogger(TCPServer.class);
    private volatile boolean isRunning = false;
    private EventLoopGroup bossGroup = null;
    private EventLoopGroup workGrop = null;
    private int port;

    public TCPServer() {
    }

    public TCPServer(int port) {
        this();
        this.port = port;
    }

    private void bind() throws Exception {
        // 配置服务端的nio线程组
        this.bossGroup = new NioEventLoopGroup(); //主线程
        this.workGrop = new NioEventLoopGroup(); //工作线程
        try {
            ServerBootstrap b = new ServerBootstrap();
            b.group(bossGroup, workGrop); //装入线程
            //制定Nio传输
            b.channel(NioServerSocketChannel.class).option(ChannelOption.SO_BACKLOG, 1024).childOption(ChannelOption.SO_KEEPALIVE, true)
                    .childHandler(new ChildChannelHandler());//添加到子channel的ChannelPipeline里面
            this.log.error("TCP服务启动完毕,port={}", this.port);
            // 绑定端口，同步等待成功
            ChannelFuture f = b.bind(port).sync(); //绑定端口
            // 等等服务器端监听端口关闭
            f.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally { //关闭线程
            bossGroup.shutdownGracefully();
            workGrop.shutdownGracefully();
        }
    }

    private class ChildChannelHandler extends ChannelInitializer<SocketChannel> {

        @Override
        protected void initChannel(SocketChannel socketChannel) throws Exception {
            //获得连接
            ChannelPipeline cp = socketChannel.pipeline();
            cp.addLast("handler", new TimeServerHandler());
            cp.addLast(new StringEncoder());

        }
    }

    public synchronized void startServer() {
        if (this.isRunning) {
            throw new IllegalStateException(this.getName() + " is already started .");
        }
        this.isRunning = true;
        new Thread(() -> {
            try {
                this.bind();
            } catch (Exception e) {
                this.log.error("TCP服务启动出错:{}", e.getMessage());
                e.printStackTrace();
            }
        }, this.getName()).start();
    }

    public synchronized void stopServer() {
        if (!this.isRunning) {
            throw new IllegalStateException(this.getName() + " is not yet started .");
        }
        this.isRunning = false;
        try {
            Future<?> future = this.workGrop.shutdownGracefully().await();
            if (!future.isSuccess()) {
                log.error("workerGroup 无法正常停止:{}", future.cause());
            }

            future = this.bossGroup.shutdownGracefully().await();
            if (!future.isSuccess()) {
                log.error("bossGroup 无法正常停止:{}", future.cause());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.log.error("TCP服务已经停止...");
    }

    private String getName() {
        return "TCP-Server";
    }

    // TODO: 2019/3/31 测试启动
    public static void main(String[] args) {
        TCPServer server = new TCPServer(10086);
        server.startServer();
    }
}
