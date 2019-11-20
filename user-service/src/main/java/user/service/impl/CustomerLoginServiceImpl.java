package user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import user.dao.CustomerLoginMapper;
import user.entity.CustomerLoginEntity;
import user.service.CustomerLoginService;

/**
 * @Auther: ltc
 * @Date: 2019/11/18 19:40
 * @Description:
 */
@Service
@Transactional
public class CustomerLoginServiceImpl extends ServiceImpl<CustomerLoginMapper, CustomerLoginEntity> implements CustomerLoginService {

}
