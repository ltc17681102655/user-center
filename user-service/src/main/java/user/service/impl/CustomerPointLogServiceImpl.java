package user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import user.dao.CustomerPointLogMapper;
import user.entity.CustomerPointLogEntity;
import user.service.ICustomerPointLogService;

/**
 * <p>
 * 用户积分日志表 服务实现类
 * </p>
 *
 * @author ltc
 * @since 2019-11-20
 */
@Service
public class CustomerPointLogServiceImpl extends ServiceImpl<CustomerPointLogMapper, CustomerPointLogEntity> implements ICustomerPointLogService {

}
