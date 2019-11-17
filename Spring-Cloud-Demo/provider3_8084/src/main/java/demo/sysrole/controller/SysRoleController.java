package demo.sysrole.controller;


import demo.sysrole.entity.SysRole;
import demo.sysrole.service.impl.SysRoleServiceImpl;
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
public class SysRoleController {
    @Resource
    private SysRoleServiceImpl sysRoleService;

    /**
     * 通过id查询角色
     *
     * @param id
     * @return
     */
    @GetMapping("/sysrole/{id}")
    public Object findById(@PathVariable String id) {
        return sysRoleService.getById(id);
    }

    /**
     * 查询全部角色
     *
     * @return
     */
    @GetMapping("/sysrole/all")
    public Object findAll() {
        return sysRoleService.list(null);
    }

    /**
     * 添加角色
     *
     * @param sysRole
     * @return
     */
    @PostMapping("/sysrole/add")
    public Object addSysRole(@RequestBody SysRole sysRole) {
        Map<String, Object> map = new HashMap<>();
        if (sysRoleService.save(sysRole)) {
            map.put("code", 2000);
            map.put("msg", "添加角色成功!");
        } else {
            map.put("code", 4000);
            map.put("msg", "添加角色失败!");
        }
        return map;
    }

    /**
     * 删除角色
     *
     * @param sysRole
     * @return
     */
    @PostMapping("/sysrole/del")
    public Object delSysRole(@RequestBody SysRole sysRole) {
        Map<String, Object> map = new HashMap<>();
        if (sysRoleService.removeById(sysRole.getId())) {
            map.put("code", 2000);
            map.put("msg", "删除角色成功!");
        } else {
            map.put("code", 4000);
            map.put("msg", "删除角色失败!");
        }
        return map;
    }

    /**
     * 修改角色
     *
     * @param sysRole
     * @return
     */
    @PostMapping("/sysrole/edit")
    public Object editSysRole(@RequestBody SysRole sysRole) {
        Map<String, Object> map = new HashMap<>();
        if (sysRoleService.updateById(sysRole)) {
            map.put("code", 2000);
            map.put("msg", "修改角色成功!");
        } else {
            map.put("code", 4000);
            map.put("msg", "修改角色失败!");
        }
        return map;
    }
}
