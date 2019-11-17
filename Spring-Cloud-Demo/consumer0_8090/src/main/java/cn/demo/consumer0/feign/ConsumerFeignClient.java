package cn.demo.consumer0.feign;

import cn.demo.consumer0.config.FeignConfiguration;
import cn.demo.consumer0.pojo.Consumer;
import com.netflix.hystrix.HystrixObservableCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import feign.Param;
import feign.RequestLine;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Map;

/*********************************
 *
 * @作者 67582
 * @项目名 Spring-Cloud-Demo
 * @时间 2018/10/31 15:07
 *
 *********************************/
@FeignClient(name = "provider", configuration = FeignConfiguration.class, fallbackFactory = ConsumerFeignClient.FeignClientFallbackFactory.class)
public interface ConsumerFeignClient {

    @RequestLine("GET /{id}")
    public Consumer findById(@Param("id") Long id);

    @RequestLine("POST /add")
    public Map<String, Object> addMenu(@RequestBody Consumer consumer);

    @RequestLine("POST /del")
    public Map<String, Object> delMenu(@RequestBody Consumer consumer);

    @RequestLine("POST /edit")
    public Map<String, Object> editMenu(@RequestBody Consumer consumer);

    @Component
    class FeignClientFallbackFactory implements FallbackFactory<ConsumerFeignClient> {

        private static final Logger LOGGER = LoggerFactory.getLogger(FeignClientFallbackFactory.class);

        @Override
        public ConsumerFeignClient create(Throwable cause) {
            return new ConsumerFeignClient() {
                @Override
                @HystrixCommand(defaultFallback = "findById")
                public Consumer findById(Long id) {
                    Consumer consumer = new Consumer();
                    FeignClientFallbackFactory.LOGGER.info("fallback;findById was:", cause);
                    consumer.setId(-2L);
                    consumer.setContext("访问人数过多,请稍候再访问!");
                    return consumer;
                }

                public Map<String, Object> addMenu(Consumer consumer) {
                    FeignClientFallbackFactory.LOGGER.info("fallback;addMenu was:", cause);
                    Map<String, Object> map = new HashMap<>();
                    map.put("code", 4000);
                    map.put("msg", "访问超时!");
                    return null;
                }

                @Override
                public Map<String, Object> delMenu(Consumer consumer) {
                    FeignClientFallbackFactory.LOGGER.info("fallback;delMenu was:", cause);
                    Map<String, Object> map = new HashMap<>();
                    map.put("code", 4000);
                    map.put("msg", "访问超时!");
                    return map;
                }

                @Override
                public Map<String, Object> editMenu(Consumer consumer) {
                    FeignClientFallbackFactory.LOGGER.info("fallback;editMenu was:", cause);
                    Map<String, Object> map = new HashMap<>();
                    map.put("code", 4000);
                    map.put("msg", "访问超时!");
                    return map;
                }
            };
        }
    }
}
