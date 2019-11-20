package user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import user.dao.CustomerBalanceLogMapper;
import user.entity.CustomerBalanceLogEntity;
import user.service.ICustomerBalanceLogService;

/**
 * <p>
 * 用户余额变动表 服务实现类
 * </p>
 *
 * @author ltc
 * @since 2019-11-20
 */
@Service
public class CustomerBalanceLogServiceImpl extends ServiceImpl<CustomerBalanceLogMapper, CustomerBalanceLogEntity> implements ICustomerBalanceLogService {

}
