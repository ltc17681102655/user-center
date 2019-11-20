package user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import user.dao.CustomerLevalInfMapper;
import user.entity.CustomerLevalInfEntity;
import user.service.ICustomerLevalInfService;

/**
 * <p>
 * 用户级别信息表 服务实现类
 * </p>
 *
 * @author ltc
 * @since 2019-11-20
 */
@Service
public class CustomerLevalInfServiceImpl extends ServiceImpl<CustomerLevalInfMapper, CustomerLevalInfEntity> implements ICustomerLevalInfService {

}
