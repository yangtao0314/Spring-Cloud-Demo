package demo.department.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import demo.department.entity.Department;
import demo.department.mapper.DepartmentMapper;
import demo.department.service.IDepartmentService;
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
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}
