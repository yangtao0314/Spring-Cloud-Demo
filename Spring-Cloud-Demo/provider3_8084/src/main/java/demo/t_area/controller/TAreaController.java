package demo.t_area.controller;


import demo.t_area.entity.TArea;
import demo.t_area.service.impl.TAreaServiceImpl;
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
public class TAreaController {
    @Resource
    private TAreaServiceImpl tAreaService;

    /**
     * 通过id查询地区
     *
     * @param id
     * @return
     */
    @GetMapping("/tarea/{id}")
    public Object findById(@PathVariable String id) {
        return tAreaService.getById(id);
    }

    /**
     * 查询全部地区
     *
     * @return
     */
    @GetMapping("/tarea/all")
    public Object findAll() {
        return tAreaService.list(null);
    }

    /**
     * 添加地区
     *
     * @param tArea
     * @return
     */
    @PostMapping("/tarea/add")
    public Object addTArea(@RequestBody TArea tArea) {
        Map<String, Object> map = new HashMap<>();
        if (tAreaService.save(tArea)) {
            map.put("code", 2000);
            map.put("msg", "添加地区成功!");
        } else {
            map.put("code", 4000);
            map.put("msg", "添加地区失败!");
        }
        return map;
    }

    /**
     * 删除地区
     *
     * @param tArea
     * @return
     */
    @PostMapping("/tarea/del")
    public Object delTArea(@RequestBody TArea tArea) {
        Map<String, Object> map = new HashMap<>();
        if (tAreaService.removeById(tArea.getAreaId())) {
            map.put("code", 2000);
            map.put("msg", "删除地区成功!");
        } else {
            map.put("code", 4000);
            map.put("msg", "删除地区失败!");
        }
        return map;
    }

    /**
     * 修改地区
     *
     * @param tArea
     * @return
     */
    @PostMapping("/tarea/edit")
    public Object editTAre(@RequestBody TArea tArea) {
        Map<String, Object> map = new HashMap<>();
        if (tAreaService.updateById(tArea)) {
            map.put("code", 2000);
            map.put("msg", "修改地区成功!");
        } else {
            map.put("code", 4000);
            map.put("msg", "修改地区失败!");
        }
        return map;
    }
}
