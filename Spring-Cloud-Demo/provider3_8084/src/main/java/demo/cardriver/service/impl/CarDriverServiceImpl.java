package demo.cardriver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import demo.cardriver.entity.CarDriver;
import demo.cardriver.mapper.CarDriverMapper;
import demo.cardriver.service.ICarDriverService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yangtao
 * @since 2018-11-23
 */
@Service
public class CarDriverServiceImpl extends ServiceImpl<CarDriverMapper, CarDriver> implements ICarDriverService {

}
