package user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import user.mapper.CustomerRoleMapper;
import user.entity.CustomerRoleEntity;
import user.service.ICustomerRoleService;

/**
 * <p>
 * 用户角色表 服务实现类
 * </p>
 *
 * @author ltc
 * @since 2019-11-20
 */
@Service
public class CustomerRoleServiceImpl extends ServiceImpl<CustomerRoleMapper, CustomerRoleEntity> implements ICustomerRoleService {

}
