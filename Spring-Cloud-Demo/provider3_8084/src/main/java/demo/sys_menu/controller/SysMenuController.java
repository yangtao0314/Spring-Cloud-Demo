package demo.sys_menu.controller;


import demo.sys_menu.entity.SysMenu;
import demo.sys_menu.service.impl.SysMenuServiceImpl;
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
public class SysMenuController {
    @Resource
    private SysMenuServiceImpl sysMenuService;

    /**
     * 通过id查询菜单
     *
     * @param id
     * @return
     */
    @GetMapping("/sysmenu/{id}")
    public Object findById(@PathVariable String id) {
        return sysMenuService.getById(id);
    }

    /**
     * 查询全部菜单
     *
     * @return
     */
    @GetMapping("/sysmenu/all")
    public Object findAll() {
        return sysMenuService.list(null);
    }

    /**
     * 添加菜单
     *
     * @param sysMenu
     * @return
     */
    @PostMapping("/sysmenu/add")
    public Object addSysMenu(@RequestBody SysMenu sysMenu) {
        Map<String, Object> map = new HashMap<>();
        if (sysMenuService.save(sysMenu)) {
            map.put("code", 2000);
            map.put("msg", "添加菜单成功!");
        } else {
            map.put("code", 4000);
            map.put("msg", "添加菜单失败!");
        }
        return map;
    }

    /**
     * 删除菜单
     *
     * @param sysMenu
     * @return
     */
    @PostMapping("/sysmenu/del")
    public Object delSysMenu(@RequestBody SysMenu sysMenu) {
        Map<String, Object> map = new HashMap<>();
        if (sysMenuService.removeById(sysMenu.getId())) {
            map.put("code", 2000);
            map.put("msg", "删除菜单成功!");
        } else {
            map.put("code", 4000);
            map.put("msg", "删除菜单失败!");
        }
        return map;
    }

    /**
     * 修改菜单
     *
     * @param sysMenu
     * @return
     */
    @PostMapping("/sysmenu/edit")
    public Object editSysMenu(@RequestBody SysMenu sysMenu) {
        Map<String, Object> map = new HashMap<>();
        if (sysMenuService.updateById(sysMenu)) {
            map.put("code", 2000);
            map.put("msg", "修改菜单成功!");
        } else {
            map.put("code", 4000);
            map.put("msg", "修改菜单失败!");
        }
        return map;
    }
}
