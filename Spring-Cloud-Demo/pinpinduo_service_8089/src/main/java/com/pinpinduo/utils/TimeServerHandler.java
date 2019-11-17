package com.pinpinduo.utils;

import com.alibaba.fastjson.JSON;
import com.pinpinduo.module_user.pojo.PinpinduoUser;
import com.pinpinduo.module_user.services.IPinpinduoUserService;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import io.netty.util.ReferenceCountUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.nio.charset.Charset;

/*********************************
 * @作者 67582
 * @项目名 Spring-Cloud-Demo
 * @时间 2019/3/30 22:48
 * @Version 1.0
 *********************************/
public class TimeServerHandler extends ChannelInboundHandlerAdapter {

    private final Logger log = LoggerFactory.getLogger(TimeServerHandler.class);

    @Resource
    private IPinpinduoUserService service;

    /**
     * 读取客户端数据
     *
     * @param ctx
     * @param msg
     * @throws Exception
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        if (msg instanceof ByteBuf) {
            String name = ((ByteBuf) msg).toString(Charset.defaultCharset());
            PinpinduoUser user = service.getUserByLoginName(name);
            System.out.println(name);
            ctx.channel().writeAndFlush(JSON.toJSONString(user));
        } else {
            ctx.channel().writeAndFlush("暂不支持其他编码发送");
            System.out.println("暂不支持其他编码发送");
        }
    }

    /**
     * 发生异常时调用
     *
     * @param ctx
     * @param cause
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) { // (4)
        log.error("发生异常:{}", cause.getMessage());
        cause.printStackTrace();
    }

    /**
     * 连接时调用
     *
     * @param ctx
     * @throws Exception
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        log.debug("终端连接:{}", ctx.channel());
    }

    /**
     * 断开连接时调用
     *
     * @param ctx
     * @param evt
     * @throws Exception
     */
    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (IdleStateEvent.class.isAssignableFrom(evt.getClass())) {
            IdleStateEvent event = (IdleStateEvent) evt;
            if (event.state() == IdleState.READER_IDLE) {
                log.error("服务器主动断开连接:{}", "userEventTriggered");
                ctx.close();
            }
        }
    }

    private void release(Object msg) {
        try {
            ReferenceCountUtil.release(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
