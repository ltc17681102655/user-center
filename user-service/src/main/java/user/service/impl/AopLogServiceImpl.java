package user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import user.entity.AopLogEntity;
import user.mapper.AopLogMapper;
import user.service.IAopLogService;

/**
 * <p>
 * aop调用日志表 服务实现类
 * </p>
 *
 * @author ltc
 * @since 2019-11-26
 */
@Service
@Transactional
public class AopLogServiceImpl extends ServiceImpl<AopLogMapper, AopLogEntity> implements IAopLogService {

}
