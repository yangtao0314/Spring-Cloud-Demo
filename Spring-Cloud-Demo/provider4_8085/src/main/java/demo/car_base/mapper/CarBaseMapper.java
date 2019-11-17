package demo.car_base.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import demo.car_base.entity.CarBase;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author yangtao
 * @since 2018-11-26
 */
@Mapper
public interface CarBaseMapper extends BaseMapper<CarBase> {

}
