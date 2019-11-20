package user.service.impl;

import user.entity.CustomerLoginLog;
import user.mapper.CustomerLoginLogMapper;
import user.service.ICustomerLoginLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户登录日志表 服务实现类
 * </p>
 *
 * @author ltc
 * @since 2019-11-20
 */
@Service
public class CustomerLoginLogServiceImpl extends ServiceImpl<CustomerLoginLogMapper, CustomerLoginLog> implements ICustomerLoginLogService {

}
