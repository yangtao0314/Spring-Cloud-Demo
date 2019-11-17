package cn.demo.service0.controller;

import cn.demo.service0.pojo.Menu;
import cn.demo.service0.services.MenuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/*********************************
 *
 * @作者 67582
 * @项目名 Spring-Cloud-Demo
 * @时间 2018/10/30 14:16
 *
 *********************************/
@RestController
public class MenuController {

    @Resource
    private MenuService menuService;

    @GetMapping("/{id}")
    public Menu findById(@PathVariable int id) {
        return menuService.findById(id);
    }

    @PostMapping("/add")
    public Map<String, Object> addMenu(@RequestBody Menu menu) {
        return menuService.addMenu(menu);
    }

    @PostMapping("/del")
    public Map<String, Object> delMenu(@RequestBody Menu menu) {
        return menuService.delMenu(menu.getId());
    }

    @PostMapping("/edit")
    public Map<String, Object> editMenu(@RequestBody Menu menu) {
        return menuService.editMenu(menu);
    }

}
