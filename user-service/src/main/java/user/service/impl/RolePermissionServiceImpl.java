package user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import user.dao.RolePermissionMapper;
import user.entity.RolePermissionEntity;
import user.service.IRolePermissionService;

/**
 * <p>
 * 角色权限表 服务实现类
 * </p>
 *
 * @author ltc
 * @since 2019-11-20
 */
@Service
public class RolePermissionServiceImpl extends ServiceImpl<RolePermissionMapper, RolePermissionEntity> implements IRolePermissionService {

}
