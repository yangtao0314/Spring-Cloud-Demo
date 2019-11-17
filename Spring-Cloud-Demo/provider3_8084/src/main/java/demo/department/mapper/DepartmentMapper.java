package demo.department.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import demo.department.entity.Department;
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
public interface DepartmentMapper extends BaseMapper<Department> {

}
