package demo.sysuser.controller;


import demo.sysuser.entity.SysUser;
import demo.sysuser.service.impl.SysUserServiceImpl;
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
public class SysUserController {

    @Resource
    private SysUserServiceImpl sysUserService;

    /**
     * 通过id查询用户
     *
     * @param id
     * @return
     */
    @GetMapping("/sysuser/{id}")
    public Object findById(@PathVariable String id) {
        return sysUserService.getById(id);
    }

    /**
     * 查询全部用户
     *
     * @return
     */
    @GetMapping("/sysuser/all")
    public Object findAll() {
        return sysUserService.list(null);
    }

    /**
     * 添加用户信息
     *
     * @param sysUser
     * @return
     */
    @PostMapping("/sysuser/add")
    public Object addSysUser(@RequestBody SysUser sysUser) {
        Map<String, Object> map = new HashMap<>();
        if (sysUserService.save(sysUser)) {
            map.put("code", 2000);
            map.put("msg", "添加用户成功!");
        } else {
            map.put("code", 4000);
            map.put("msg", "添加用户失败!");
        }
        return map;
    }

    /**
     * 删除用户信息
     *
     * @param sysUser
     * @return
     */
    @PostMapping("/sysuser/del")
    public Object delSysUser(@RequestBody SysUser sysUser) {
        Map<String, Object> map = new HashMap<>();
        if (sysUserService.removeById(sysUser.getId())) {
            map.put("code", 2000);
            map.put("msg", "删除用户成功!");
        } else {
            map.put("code", 2000);
            map.put("msg", "删除用户失败!");
        }
        return map;
    }

    /**
     * 修改用户信息
     *
     * @param sysUser
     * @return
     */
    @PostMapping("/sysuser/edit")
    public Object editSysUser(@RequestBody SysUser sysUser) {
        Map<String, Object> map = new HashMap<>();
        if (sysUserService.updateById(sysUser)) {
            map.put("code", 2000);
            map.put("msg", "修改用户成功!");
        } else {
            map.put("code", 4000);
            map.put("msg", "修改用户失败!");
        }
        return map;
    }
}
