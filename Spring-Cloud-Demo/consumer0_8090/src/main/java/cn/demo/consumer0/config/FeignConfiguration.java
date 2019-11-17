package cn.demo.consumer0.config;

import feign.Contract;
import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*********************************
 *
 * @作者 67582
 * @项目名 Spring-Cloud-Demo
 * @时间 2018/10/31 15:17
 *
 *********************************/
@Configuration
public class FeignConfiguration {

    @Value("${provider.username}")
    private String username;

    @Value("${provider.password}")
    private String password;

    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }

    /**
     * 设置访问请求头
     *
     * @return 请求头内容
     */
    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor(this.username, this.password);
    }

    /**
     * 设置Feign访问日志
     *
     * @return 访问日志
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
