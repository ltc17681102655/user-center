package user.service.impl;

import user.entity.CustomerPointLog;
import user.mapper.CustomerPointLogMapper;
import user.service.ICustomerPointLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户积分日志表 服务实现类
 * </p>
 *
 * @author ltc
 * @since 2019-11-20
 */
@Service
public class CustomerPointLogServiceImpl extends ServiceImpl<CustomerPointLogMapper, CustomerPointLog> implements ICustomerPointLogService {

}
