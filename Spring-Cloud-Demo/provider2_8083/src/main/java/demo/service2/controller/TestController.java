package demo.service2.controller;

import demo.service2.pojo.Test;
import demo.service2.services.TestService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/*********************************
 *
 * @作者 67582
 * @项目名 Spring-Cloud-Demo
 * @时间 2018/11/12 14:13
 *
 *********************************/
@RestController
@RequestMapping("/api")
public class TestController {
    @Resource
    private TestService testService;

    @GetMapping("/{id}")
    public Test findById(@PathVariable int id) {
        return testService.findById(id);
    }

    @GetMapping("/all/{demo_id}")
    public List<Test> findAll(@PathVariable Integer demo_id) {
        return testService.findAll(demo_id);
    }

    @PostMapping("/add")
    public Map<String, Object> addTest(@RequestBody Test test) {
        return testService.addTest(test);
    }

    @PostMapping("/del")
    public Map<String, Object> delTest(@RequestBody Test test) {
        return testService.delTest(test);
    }

    @PostMapping("/edit")
    public Map<String, Object> editTest(@RequestBody Test test) {
        return testService.editTest(test);
    }
}
