package user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import user.mapper.CustomerInfMapper;
import user.entity.CustomerInfEntity;
import user.service.ICustomerInfService;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author ltc
 * @since 2019-11-20
 */
@Service
@Transactional
public class CustomerInfServiceImpl extends ServiceImpl<CustomerInfMapper, CustomerInfEntity> implements ICustomerInfService {

}
