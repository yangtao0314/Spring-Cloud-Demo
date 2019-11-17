package demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.pinpinduo.PinPinDuo_8089;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/*********************************
 * @作者 67582
 * @项目名 Spring-Cloud-Demo
 * @时间 2019/3/20 2:59
 * @Version 1.0
 *********************************/
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringJUnitConfig(PinPinDuo_8089.class)
public class TestRedis {

    //    @Autowired
//    private StringRedisTemplate stringRedisTemplate;
//
//    @Autowired
//    private RedisTemplate redisTemplate;
//
//    @Test
//    public void test() throws Exception {
//        stringRedisTemplate.opsForValue().set("aaa", "111");
//        Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
//        String demo = stringRedisTemplate.opsForValue().get("name");
//        System.out.println(demo);
//    }

}
