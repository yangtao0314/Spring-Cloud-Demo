package demo.cardriver.controller;


import demo.cardriver.entity.CarDriver;
import demo.cardriver.service.impl.CarDriverServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yangtao
 * @since 2018-11-23
 */
@RestController
public class CarDriverController {
    @Resource
    private CarDriverServiceImpl carDriverService;

    /**
     * 通过id查询司勤
     *
     * @param id
     * @return
     */
    @GetMapping("/cardriver/{id}")
    public Object findById(@PathVariable String id) {
        return carDriverService.getById(id);
    }

    /**
     * 查询全部司勤
     *
     * @return
     */
    @GetMapping("/cardriver/all")
    public Object findAll() {
        return carDriverService.list(null);
    }

    /**
     * 添加司勤
     *
     * @param carDriver
     * @return
     */
    @PostMapping("/cardriver/add")
    public Object addCarDriver(@RequestBody CarDriver carDriver) {
        Map<String, Object> map = new HashMap<>();
        if (carDriverService.save(carDriver)) {
            map.put("code", 2000);
            map.put("msg", "添加司勤成功!");
        } else {
            map.put("code", 4000);
            map.put("msg", "添加司勤失败!");
        }
        return map;
    }

    /**
     * 删除司勤
     *
     * @param carDriver
     * @return
     */
    @PostMapping("/cardriver/del")
    public Object delCarDriver(@RequestBody CarDriver carDriver) {
        Map<String, Object> map = new HashMap<>();
        if (carDriverService.removeById(carDriver.getId())) {
            map.put("code", 2000);
            map.put("msg", "删除司勤成功!");
        } else {
            map.put("code", 4000);
            map.put("msg", "删除司勤失败!");
        }
        return map;
    }

    /**
     * 修改司勤
     *
     * @param carDriver
     * @return
     */
    @PostMapping("/cardriver/edit")
    public Object editCarDriver(@RequestBody CarDriver carDriver) {
        Map<String, Object> map = new HashMap<>();
        if (carDriverService.updateById(carDriver)) {
            map.put("code", 2000);
            map.put("msg", "修改司勤成功!");
        } else {
            map.put("code", 4000);
            map.put("msg", "修改司勤失败!");
        }
        return map;
    }
}
