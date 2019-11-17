package com.pinpinduo.module_user.services;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pinpinduo.module_user.pojo.PinpinduoUser;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author yangtao
 * @since 2019-03-21
 */
public interface IPinpinduoUserService extends IService<PinpinduoUser> {
    PinpinduoUser getUserByLoginName(String loginname);
}
