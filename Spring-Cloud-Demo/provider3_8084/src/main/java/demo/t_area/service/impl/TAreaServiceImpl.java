package demo.t_area.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import demo.t_area.entity.TArea;
import demo.t_area.mapper.TAreaMapper;
import demo.t_area.service.ITAreaService;
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
public class TAreaServiceImpl extends ServiceImpl<TAreaMapper, TArea> implements ITAreaService {

}
