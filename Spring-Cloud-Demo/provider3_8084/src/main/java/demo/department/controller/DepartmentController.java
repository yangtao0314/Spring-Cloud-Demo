package demo.department.controller;


import demo.department.entity.Department;
import demo.department.service.impl.DepartmentServiceImpl;
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
 * @since 2018-11-22
 */
@RestController
public class DepartmentController {
    @Resource
    private DepartmentServiceImpl departmentService;

    /**
     * 通过id查询单位
     *
     * @param id
     * @return
     */
    @GetMapping("/department/{id}")
    public Object findById(@PathVariable String id) {
        return departmentService.getById(id);
    }

    /**
     * 查询所有单位
     *
     * @return
     */
    @GetMapping("/department/all")
    public Object findAll() {
        return departmentService.list(null);
    }

    /**
     * 添加单位
     *
     * @param department
     * @return
     */
    @PostMapping("/department/add")
    public Object addDepartment(@RequestBody Department department) {
        Map<String, Object> map = new HashMap<>();
        if (departmentService.save(department)) {
            map.put("code", 2000);
            map.put("msg", "添加单位成功!");
        } else {
            map.put("code", 4000);
            map.put("msg", "添加单位失败!");
        }
        return map;
    }

    /**
     * 删除单位
     *
     * @param department
     * @return
     */
    @PostMapping("/department/del")
    public Object delDepartment(@RequestBody Department department) {
        Map<String, Object> map = new HashMap<>();
        if (departmentService.removeById(department.getId())) {
            map.put("code", 2000);
            map.put("msg", "删除单位成功!");
        } else {
            map.put("code", 4000);
            map.put("msg", "删除单位失败!");
        }
        return map;
    }

    /**
     * 修改单位
     *
     * @param department
     * @return
     */
    @PostMapping("/department/edit")
    public Object editDepartment(@RequestBody Department department) {
        Map<String, Object> map = new HashMap<>();
        if (departmentService.updateById(department)) {
            map.put("code", 2000);
            map.put("msg", "修改单位成功!");
        } else {
            map.put("code", 4000);
            map.put("msg", "修改单位失败!");
        }
        return map;
    }
}
