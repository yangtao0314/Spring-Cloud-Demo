package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Provider3_8084 {
    public static void main(String[] args) {
        SpringApplication.run(Provider3_8084.class, args);
    }
}
