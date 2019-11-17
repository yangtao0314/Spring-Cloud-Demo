package demo.cardriver.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import demo.cardriver.entity.CarDriver;
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
public interface CarDriverMapper extends BaseMapper<CarDriver> {

}
