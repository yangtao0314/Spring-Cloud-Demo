package com.pinpinduo.module_user.services.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pinpinduo.module_user.mapper.PinpinduoUserMapper;
import com.pinpinduo.module_user.pojo.PinpinduoUser;
import com.pinpinduo.module_user.services.IPinpinduoUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yangtao
 * @since 2019-03-21
 */
@Service
public class PinpinduoUserServiceImpl extends ServiceImpl<PinpinduoUserMapper, PinpinduoUser> implements IPinpinduoUserService {
    @Resource
    private PinpinduoUserMapper mapper;

    public PinpinduoUser getUserByLoginName(String loginname) {
        return mapper.FindByLoginName(loginname);
    }
}
