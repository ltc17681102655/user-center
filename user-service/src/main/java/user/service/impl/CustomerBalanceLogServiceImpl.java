package user.service.impl;

import user.entity.CustomerBalanceLog;
import user.mapper.CustomerBalanceLogMapper;
import user.service.ICustomerBalanceLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户余额变动表 服务实现类
 * </p>
 *
 * @author ltc
 * @since 2019-11-20
 */
@Service
public class CustomerBalanceLogServiceImpl extends ServiceImpl<CustomerBalanceLogMapper, CustomerBalanceLog> implements ICustomerBalanceLogService {

}
