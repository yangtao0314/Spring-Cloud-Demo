package cn.demo.consumer0.feign;

import cn.demo.consumer0.config.FeignConfiguration;
import cn.demo.consumer0.pojo.Test;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

/*********************************
 *
 * @作者 67582
 * @项目名 Spring-Cloud-Demo
 * @时间 2018/11/12 14:27
 *
 *********************************/
@FeignClient(name = "provider0", configuration = FeignConfiguration.class)
public interface Provider2FeignClient {
    @RequestLine("GET /all/{demo_id}")
    public List<Test> findById(@Param("demo_id") Long demo_id);

    @RequestLine("POST /add")
    public Map<String, Object> addTest(@RequestBody Test test);

    @RequestLine("POST /del")
    public Map<String, Object> delTest(@RequestBody Test test);

    @RequestLine("POST /edit")
    public Map<String, Object> editTest(@RequestBody Test test);
}
