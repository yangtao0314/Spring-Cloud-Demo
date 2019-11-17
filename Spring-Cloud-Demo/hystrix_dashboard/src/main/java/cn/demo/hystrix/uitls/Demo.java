package cn.demo.hystrix.uitls;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

/*********************************
 *
 * @作者 67582
 * @项目名 Spring-Cloud-Demo
 * @时间 2018/11/13 13:40
 *
 *********************************/
public class Demo {

    public static void main(String[] args) {
        String val_json = "[{\"id\":2,\"context\":\"发动过啊\"},[{\"id\":1,\"demoId\":2,\"demoContext\":\"aaaaaa\"},{\"id\":3,\"demoId\":2,\"demoContext\":\"asdasda\"},{\"id\":4,\"demoId\":2,\"demoContext\":\"xxxxxxxxx\"},{\"id\":5,\"demoId\":2,\"demoContext\":\"xxxxxxxxx\"},{\"id\":6,\"demoId\":2,\"demoContext\":\"asdasdsada\"}]]\n";
        List jsonArray = JSON.parseArray(val_json);
        System.out.println(jsonArray.get(1));
    }
}
