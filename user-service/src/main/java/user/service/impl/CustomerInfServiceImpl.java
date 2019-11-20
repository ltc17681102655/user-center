package user.service.impl;

import user.entity.CustomerInf;
import user.mapper.CustomerInfMapper;
import user.service.ICustomerInfService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author ltc
 * @since 2019-11-20
 */
@Service
public class CustomerInfServiceImpl extends ServiceImpl<CustomerInfMapper, CustomerInf> implements ICustomerInfService {

}
