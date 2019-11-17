package cn.demo.consumer0.controller;

import cn.demo.consumer0.feign.ConsumerFeignClient;
import cn.demo.consumer0.feign.Provider2FeignClient;
import cn.demo.consumer0.pojo.Consumer;
import cn.demo.consumer0.pojo.Test;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.exception.CommandActionExecutionException;
import com.netflix.hystrix.contrib.javanica.exception.FallbackDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*********************************
 *
 * @作者 67582
 * @项目名 Spring-Cloud-Demo
 * @时间 2018/10/31 15:06
 *
 *********************************/
@DefaultProperties(defaultFallback = "consumerFallback")
@RestController
public class ConsumerController {
    @Autowired
    private ConsumerFeignClient consumerFeignClient;
    @Autowired
    private Provider2FeignClient client;

    @HystrixCommand
    @GetMapping("/all/{id}")
    public Object findAll(@PathVariable Long id) throws CommandActionExecutionException {
        Consumer consumer = this.consumerFeignClient.findById(id);
        List<Test> test = this.client.findById(id);
        List<Object> objects = new ArrayList<Object>();
        objects.add(consumer);
        objects.add(test);
        return objects;
    }

    @HystrixCommand
    @GetMapping("/consumer/{id}")
    public Object findById(@PathVariable Long id) throws CommandActionExecutionException {
        return this.consumerFeignClient.findById(id);
    }

    @HystrixCommand
    @PostMapping("/add")
    public Object addMenu(@RequestBody Consumer consumer) throws CommandActionExecutionException {
        return this.consumerFeignClient.addMenu(consumer);
    }

    @HystrixCommand
    @PostMapping("/del")
    public Object delMenu(@RequestBody Consumer consumer) throws CommandActionExecutionException {
        return this.consumerFeignClient.delMenu(consumer);
    }

    @HystrixCommand
    @PostMapping("/edit")
    public Object editMenu(@RequestBody Consumer consumer) throws CommandActionExecutionException {
        return this.consumerFeignClient.editMenu(consumer);
    }

    public Object consumerFallback() throws FallbackDefinitionException {
        Map<String, Object> map = new HashMap<>();
        map.put("code", -4000);
        map.put("msg", "网络延迟!");
        return map;
    }
}
