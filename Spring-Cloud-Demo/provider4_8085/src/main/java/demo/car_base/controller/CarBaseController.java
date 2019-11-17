package demo.car_base.controller;


import demo.car_base.entity.CarBase;
import demo.car_base.service.impl.CarBaseServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yangtao
 * @since 2018-11-26
 */
@RestController
public class CarBaseController {

    @Resource
    private CarBaseServiceImpl carBaseService;

    @GetMapping("/carbase/{id}")
    public List<CarBase> getAll(@PathVariable("id") String id) {
        List<CarBase> list = carBaseService.list(null);
        list = list.stream().filter(s -> s.getCarPlateNum().equals(id)).collect(Collectors.toList());
        return list;
    }

    @GetMapping("/{name}")
    public String demo(@PathVariable String name) {
        return name;
    }

    @GetMapping("/hash_map")
    public Object getMap() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put(null, "xxx");
        return map;
    }
}
