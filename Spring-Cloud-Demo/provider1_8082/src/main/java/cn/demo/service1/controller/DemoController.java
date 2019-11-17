package cn.demo.service1.controller;

import cn.demo.service1.pojo.Demo;
import cn.demo.service1.services.DemoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Map;

/*********************************
 *
 * @作者 67582
 * @项目名 Spring-Cloud-Demo
 * @时间 2018/11/2 15:46
 *
 *********************************/
@RestController
public class DemoController {
    @Resource
    private DemoService demoService;

    @GetMapping("/{id}")
    public Demo findById(@PathVariable BigDecimal id) {
        return demoService.findById(id);
    }

    @PostMapping("/add")
    public Map<String, Object> addDemo(@RequestBody Demo demo) {
        return demoService.addDemo(demo);
    }

    @PostMapping("/del")
    public Map<String, Object> delDemo(@RequestBody Demo demo) {
        return demoService.delDemo(demo.getId());
    }

    @PostMapping("/edit")
    public Map<String, Object> editDemo(@RequestBody Demo demo) {
        return demoService.editDemo(demo);
    }
}
