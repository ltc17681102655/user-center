package user.service.impl;

import user.entity.CustomerRole;
import user.mapper.CustomerRoleMapper;
import user.service.ICustomerRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色表 服务实现类
 * </p>
 *
 * @author ltc
 * @since 2019-11-20
 */
@Service
public class CustomerRoleServiceImpl extends ServiceImpl<CustomerRoleMapper, CustomerRole> implements ICustomerRoleService {

}
