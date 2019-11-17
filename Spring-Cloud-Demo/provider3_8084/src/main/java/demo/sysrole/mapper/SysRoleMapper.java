package demo.sysrole.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import demo.department.Demo;
import demo.sysrole.entity.SysRole;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author yangtao
 * @since 2018-11-23
 */
@Mapper
public interface SysRoleMapper extends BaseMapper<SysRole> {

}
