package demo.service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/*********************************
 *
 * @作者 67582
 * @项目名 Spring-Cloud-Demo
 * @时间 2018/11/12 14:01
 *
 *********************************/
@SpringBootApplication
@EnableEurekaClient
public class Provider_8083 {
    public static void main(String[] args) {
        SpringApplication.run(Provider_8083.class, args);
    }
}
