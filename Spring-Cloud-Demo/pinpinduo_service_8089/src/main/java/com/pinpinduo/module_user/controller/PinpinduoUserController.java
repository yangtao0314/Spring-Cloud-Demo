package com.pinpinduo.module_user.controller;


import com.alibaba.fastjson.JSON;
import com.pinpinduo.module_user.pojo.PinpinduoUser;
import com.pinpinduo.module_user.services.IPinpinduoUserService;
import com.pinpinduo.utils.Base64Utils;
import com.pinpinduo.utils.EncryptUtils;
import com.pinpinduo.utils.LoggerUtil;
import com.pinpinduo.utils.RedisUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yangtao
 * @since 2019-03-21
 */
@RestController
public class PinpinduoUserController extends BaseController {

    @Resource
    private IPinpinduoUserService service;
    @Resource
    private RedisUtils redisUtils;

    /**
     * 获取菜单信息
     *
     * @return
     */
    @PostMapping("/pinpinduo/getNotice")
    public BaseController.respJson getNotice() {
        BaseController.respJson json;
        try {
            json = new respJson(200, "请求成功！", redisUtils.getNotice(), getTimestamp(), 1);
        } catch (Exception e) {
            json = new respJson(500, "请求成功！", null, getTimestamp(), -1);
            LoggerUtil.LGO.error(e.toString());
        }
        return json;
    }

    /**
     * 登录操作
     *
     * @param user
     * @return
     */
    @PostMapping("/User/GetUser")
    public String getPinpinduoUser(@RequestBody PinpinduoUser user) {
        String data;
        String encode = EncryptUtils.SHA1Encode(JSON.toJSONString(user), getTimestamp().toString());
        if (user.getLoginname() == null || "".equals(user.getLoginname().trim())) {
            data = JSON.toJSONString(new respJson(300, "请求成功!", "请出入账号！", getTimestamp(), 0));
        } else {
            try {
                PinpinduoUser result = service.getUserByLoginName(user.getLoginname());
                if (result != null) {
                    data = JSON.toJSONString(new respJson(200, "请求成功!", result, getTimestamp(), 1));
                } else {
                    data = JSON.toJSONString(new respJson(400, "请求成功!", result, getTimestamp(), 0));
                }
            } catch (Exception e) {
                data = JSON.toJSONString(new respJson(300, "请求失败！", "操作有误！", getTimestamp(), -1));
            }
        }
        return getResult(data, encode);
    }

    /**
     * 通过id查询用户
     *
     * @param user
     * @return
     */
    @PostMapping("/User/GetUserById")
    public String getUserById(@RequestBody PinpinduoUser user) {
        String data;
        String encode = EncryptUtils.SHA1Encode(JSON.toJSONString(user), getTimestamp().toString());
        try {
            PinpinduoUser result = service.getById(user);
            if (result != null) {
                data = JSON.toJSONString(new respJson(200, "请求成功！", result, getTimestamp(), 1));
            } else {
                data = JSON.toJSONString(new respJson(400, "请求成功！", result, getTimestamp(), 0));
            }
        } catch (Exception e) {
            LoggerUtil.LGO.error(e.toString());
            data = JSON.toJSONString(new respJson(500, "请求成功！", null, getTimestamp(), -1));
        }
        return getResult(data, encode);
    }


    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    @PostMapping("/User/AddUser")
    public String addUser(@RequestBody PinpinduoUser user) {
        String data;
        String encode = EncryptUtils.SHA1Encode(JSON.toJSONString(user), getTimestamp().toString());
        if (user.getLoginname() == null || user.getLoginname() == "") {
            data = JSON.toJSONString(new respJson(400, "请求成功!", "请输入用户信息！", getTimestamp(), 1));
        } else {
            try {
                user.setAddTime(LocalDateTime.now());
                user.setEditTime(LocalDateTime.now());
                boolean result = service.save(user);
                if (result) {
                    data = JSON.toJSONString(new respJson(200, "请求成功！", result, getTimestamp(), 1));
                } else {
                    data = JSON.toJSONString(new respJson(400, "请求成功!", result, getTimestamp(), 1));
                }
            } catch (Exception e) {
                System.out.println(e);
                data = JSON.toJSONString(new respJson(400, "请求成功!", "请输入用户信息！", getTimestamp(), 1));
            }
        }
        return getResult(data, encode);
    }

    /**
     * 删除用户
     *
     * @param user
     * @return
     */
    @PostMapping("/User/DelUser")
    public String delUser(@RequestBody PinpinduoUser user) {
        String data;
        String encode = EncryptUtils.SHA1Encode(JSON.toJSONString(user), getTimestamp().toString());
        if (!"".equals(user.getId().trim()) || user.getId() != null) {
            try {
                user.setDelete(true);
                user.setEditTime(LocalDateTime.now());
                if (service.updateById(user)) {
                    data = JSON.toJSONString(new respJson(200, "请求成功！", "删除用户成功！", getTimestamp(), 1));
                } else {
                    data = JSON.toJSONString(new respJson(400, "请求成功！", "删除用户失败！", getTimestamp(), 0));
                }
            } catch (Exception e) {
                data = JSON.toJSONString(new respJson(500, "请求成功！", null, getTimestamp(), -1));
                LoggerUtil.LGO.error(e.toString());
            }
        } else {
            data = JSON.toJSONString(new respJson(300, "请求成功！", "操作失败！", getTimestamp(), -1));
            LoggerUtil.LGO.error("[id,不能为空,删除用户失败]");
        }
        return getResult(data, encode);
    }

    /**
     * 修改用户
     *
     * @param user
     * @return
     */
    @PostMapping("/User/EditUser")
    public String editUser(@RequestBody PinpinduoUser user) {
        String data;
        String encode = EncryptUtils.SHA1Encode(JSON.toJSONString(user), getTimestamp().toString());
        if (!"".equals(user.getId()) || user.getId() != null) {
            try {
                user.setEditTime(LocalDateTime.now());
                if (service.updateById(user)) {
                    data = JSON.toJSONString(new respJson(200, "请求成功！", "修改用户成功！", getTimestamp(), 1));
                } else {
                    data = JSON.toJSONString(new respJson(400, "请求成功！", "修改用户失败！", getTimestamp(), 0));
                }
            } catch (Exception e) {
                data = JSON.toJSONString(new respJson(500, "请求成功！", null, getTimestamp(), -1));
                LoggerUtil.LGO.error(e.toString());
            }
        } else {
            data = JSON.toJSONString(new respJson(300, "请求成功！", "操作失败！", getTimestamp(), -1));
            LoggerUtil.LGO.error("[id,不能为空,修改用户失败]");
        }
        return getResult(data, encode);
    }
}
