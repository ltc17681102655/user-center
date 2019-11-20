package user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import user.dao.CustomerAddrMapper;
import user.entity.CustomerAddrEntity;
import user.service.ICustomerAddrService;

/**
 * <p>
 * 用户地址表 服务实现类
 * </p>
 *
 * @author ltc
 * @since 2019-11-20
 */
@Service
@Transactional
public class CustomerAddrServiceImpl extends ServiceImpl<CustomerAddrMapper, CustomerAddrEntity> implements ICustomerAddrService {

}
