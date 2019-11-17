package demo.sysuser.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import demo.sysuser.entity.SysUser;
import demo.sysuser.mapper.SysUserMapper;
import demo.sysuser.service.ISysUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yangtao
 * @since 2018-11-22
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
