package com.pinpinduo.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/*********************************
 * @作者 67582
 * @项目名 Spring-Cloud-Demo
 * @时间 2019/3/26 0:54
 * @Version 1.0
 *********************************/
@Service
public class RedisUtils {

    @Autowired
    private StringRedisTemplate redisTemplate;

    /**
     *
     * @return
     */
    public String getUserTime() {
        return redisTemplate.opsForValue().get("aaa");
    }

    /**
     * 获取通知信息
     *
     * @return
     */
    public String getNotice() {
        return redisTemplate.opsForValue().get("notice");
    }
}
