package demo.service2.services;

import demo.service2.mapper.TestMapper;
import demo.service2.pojo.Test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*********************************
 *
 * @作者 67582
 * @项目名 Spring-Cloud-Demo
 * @时间 2018/11/12 14:04
 *
 *********************************/
@Service
public class TestService {
    @Resource
    private TestMapper testMapper;

    public Test findById(Integer id) {
        return testMapper.selectByPrimaryKey(id);
    }

    public List<Test> findAll(Integer demo_id) {
        return testMapper.selectAll(demo_id);
    }

    public Map<String, Object> addTest(Test test) {
        Map<String, Object> map = new HashMap<>();
        if (testMapper.insert(test) > 0) {
            map.put("code", 2000);
            map.put("msg", "添加成功!");
        } else {
            map.put("code", 4000);
            map.put("msg", "添加失败!");
        }
        return map;
    }

    public Map<String, Object> delTest(Test test) {
        Map<String, Object> map = new HashMap<>();
        if (testMapper.deleteByPrimaryKey(test.getId()) > 0) {
            map.put("code", 2000);
            map.put("msg", "删除成功!");
        } else {
            map.put("code", 4000);
            map.put("msg", "删除失败!");
        }
        return map;
    }

    public Map<String, Object> editTest(Test test) {
        Map<String, Object> map = new HashMap<>();
        if (testMapper.updateByPrimaryKey(test) > 0) {
            map.put("code", 2000);
            map.put("msg", "修改成功!");
        } else {
            map.put("code", 4000);
            map.put("msg", "修改失败!");
        }
        return map;
    }
}
