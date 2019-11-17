package cn.demo.service0.services;

import cn.demo.service0.mapper.MenuMapper;
import cn.demo.service0.pojo.Menu;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/*********************************
 *
 * @作者 67582
 * @项目名 Spring-Cloud-Demo
 * @时间 2018/11/2 11:46
 *
 *********************************/
@Service
public class MenuService {
    @Resource
    private MenuMapper menuMapper;

    public Menu findById(int id) {
        return menuMapper.selectByPrimaryKey(id);
    }

    public Map<String, Object> addMenu(Menu menu) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (menuMapper.insert(menu) > 0) {
            map.put("code", 2000);
            map.put("msg", "添加成功");
            return map;
        } else {
            map.put("code", 4000);
            map.put("msg", "添加失败");
            return map;
        }
    }

    public Map<String, Object> delMenu(int id) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (menuMapper.deleteByPrimaryKey(id) <= 0) {
            map.put("code", 4000);
            map.put("msg", "删除失败");
            return map;
        } else {
            map.put("code", 2000);
            map.put("msg", "删除成功");
            return map;
        }
    }

    public Map<String, Object> editMenu(Menu menu) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (menuMapper.updateByPrimaryKey(menu) <= 0) {
            map.put("code", 4000);
            map.put("msg", "修改失败");
            return map;
        } else {
            map.put("code", 2000);
            map.put("msg", "修改成功");
            return map;
        }
    }
}
