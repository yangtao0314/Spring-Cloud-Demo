package cn.demo.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/*********************************
 *
 * @作者 67582
 * @项目名 Spring-Cloud-Demo
 * @时间 2018/11/6 11:46
 *
 *********************************/
@SpringBootApplication
@EnableHystrixDashboard
public class Hystrix_9090 {
    public static void main(String[] args) {
        SpringApplication.run(Hystrix_9090.class, args);
    }
}
