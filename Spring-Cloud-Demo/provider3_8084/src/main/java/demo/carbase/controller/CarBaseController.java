package demo.carbase.controller;

import demo.carbase.pojo.CarBase;
import demo.carbase.services.impl.CarBaseServiceImpl;
import demo.utils.BaseController;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yangtao
 * @since 2018-11-22
 */
@RestController
public class CarBaseController extends BaseController {
    @Resource
    private CarBaseServiceImpl carBaseService;

    /**
     * 通过id查找车辆
     *
     * @param id
     * @return
     */
    @GetMapping("/carbase/{id}")
    public Object findbyId(@PathVariable String id) {
        try {
            Long time = System.currentTimeMillis();
            CarBase carBase = carBaseService.getById(id);
            if (carBase == null) return new RequestJson(500, "请求失败", null, time, 0);
            else return new RequestJson(200, "请求成功", carBase, time, 1);
        } catch (Exception e) {
            return e;
        }
    }

    /**
     * 查找全部车辆
     *
     * @return
     */
    @GetMapping("/carbase/all")
    public Object findAll() {
        try {
            Long time = System.currentTimeMillis();
            List<CarBase> result = carBaseService.list(null);
            if (result == null || result.size() == 0) return new RequestJson(500, "请求失败", null, time, 0);
            else return new RequestJson(200, "请求成功", result, time, result.size());
        } catch (Exception e) {
            return e;
        }
    }

    /**
     * 新增车辆
     *
     * @param carBase
     * @return
     */
    @PostMapping("/carbase/add")
    public Object addCarBase(@RequestBody CarBase carBase) {
        try {
            Long time = System.currentTimeMillis();
            Map<String, Object> map = new HashMap<>();
            boolean result = carBaseService.save(carBase);
            if (result) {
                map.put("bool", result);
                map.put("msg", "添加车辆成功!");
                return new RequestJson(200, "请求成功", map, time, 1);
            } else {
                map.put("bool", result);
                map.put("msg", "添加车辆失败!");
                return new RequestJson(500, "请求失败", map, time, 0);
            }
        } catch (Exception e) {
            return e;
        }
    }

    /**
     * 删除车辆
     *
     * @param carBase
     * @return
     */
    @PostMapping("/carbase/del")
    public Object delCarBase(@RequestBody CarBase carBase) {
        try {
            Long time = System.currentTimeMillis();
            Map<String, Object> map = new HashMap<>();
            boolean result = carBaseService.removeById(carBase.getId());
            if (result) {
                map.put("bool", result);
                map.put("msg", "删除车辆成功!");
                return new RequestJson(200, "请求成功", map, time, 1);
            } else {
                map.put("bool", result);
                map.put("msg", "删除车辆失败!");
                return new RequestJson(500, "请求失败", map, time, 0);
            }
        } catch (Exception e) {
            return e;
        }
    }

    /**
     * 修改车辆
     *
     * @param carBase
     * @return
     */
    @PostMapping("/carbase/edit")
    public Object editCarBase(@RequestBody CarBase carBase) {
        try {
            Long time = System.currentTimeMillis();
            Map<String, Object> map = new HashMap<>();
            boolean result = carBaseService.updateById(carBase);
            if (result) {
                map.put("bool", result);
                map.put("msg", "修改车辆成功!");
                return new RequestJson(200, "请求成功", map, time, 1);
            } else {
                map.put("bool", result);
                map.put("msg", "修改车辆失败!");
                return new RequestJson(500, "请求失败", map, time, 0);
            }
        } catch (Exception e) {
            return e;
        }
    }
}
