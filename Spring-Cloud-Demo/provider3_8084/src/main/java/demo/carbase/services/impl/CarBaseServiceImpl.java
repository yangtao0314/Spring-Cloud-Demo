package demo.carbase.services.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import demo.carbase.mapper.CarBaseMapper;
import demo.carbase.pojo.CarBase;
import demo.carbase.services.ICarBaseService;
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
public class CarBaseServiceImpl extends ServiceImpl<CarBaseMapper, CarBase> implements ICarBaseService {

}
