package user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import user.mapper.CustomerLoginLogMapper;
import user.entity.CustomerLoginLogEntity;
import user.service.ICustomerLoginLogService;

/**
 * <p>
 * 用户登录日志表 服务实现类
 * </p>
 *
 * @author ltc
 * @since 2019-11-20
 */
@Service
public class CustomerLoginLogServiceImpl extends ServiceImpl<CustomerLoginLogMapper, CustomerLoginLogEntity> implements ICustomerLoginLogService {

}
