package demo.sysuser.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import demo.sysuser.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author yangtao
 * @since 2018-11-22
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

}
