package com.pinpinduo.module_user.mapper;

import com.pinpinduo.module_user.pojo.PinpinduoUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author yangtao
 * @since 2019-03-21
 */
@Mapper
public interface PinpinduoUserMapper extends BaseMapper<PinpinduoUser> {
    PinpinduoUser FindByLoginName(String loginname);
}
