package cn.demo.service1.services;

import cn.demo.service1.mapper.DemoMapper;
import cn.demo.service1.pojo.Demo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/*********************************
 *
 * @作者 67582
 * @项目名 Spring-Cloud-Demo
 * @时间 2018/11/2 15:38
 *
 *********************************/
@Service
public class DemoService {

    @Resource
    private DemoMapper demoMapper;

    public Demo findById(BigDecimal id) {
        return demoMapper.selectByPrimaryKey(id);
    }

    public Map<String, Object> addDemo(Demo demo) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (demoMapper.insert(demo) > 0) {
            map.put("code", 2000);
            map.put("msg", "新增成功");
            return map;
        } else {
            map.put("code", 4000);
            map.put("msg", "新增失败");
            return map;
        }
    }

    public Map<String, Object> delDemo(BigDecimal id) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (demoMapper.deleteByPrimaryKey(id) > 0) {
            map.put("code", 2000);
            map.put("msg", "删除成功");
            return map;
        } else {
            map.put("code", 4000);
            map.put("msg", "删除失败");
            return map;
        }
    }

    public Map<String, Object> editDemo(Demo demo) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (demoMapper.updateByPrimaryKey(demo) > 0) {
            map.put("code", 2000);
            map.put("msg", "修改成功");
            return map;
        } else {
            map.put("code", 4000);
            map.put("msg", "修改失败");
            return map;
        }
    }
}
