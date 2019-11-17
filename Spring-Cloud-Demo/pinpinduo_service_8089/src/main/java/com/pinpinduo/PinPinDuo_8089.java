package com.pinpinduo;

import com.pinpinduo.utils.TCPServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Hello world!
 */
@SpringBootApplication
//@EnableScheduling
//@EnableCaching
public class PinPinDuo_8089 {
    public static void main(String[] args) {
        SpringApplication.run(PinPinDuo_8089.class, args);
//        TCPServer server = new TCPServer(10086);
//        server.startServer();
    }
}
