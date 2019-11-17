package demo.car_base.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import demo.car_base.entity.CarBase;
import demo.car_base.mapper.CarBaseMapper;
import demo.car_base.service.ICarBaseService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yangtao
 * @since 2018-11-26
 */
@Service
public class CarBaseServiceImpl extends ServiceImpl<CarBaseMapper, CarBase> implements ICarBaseService {

}
