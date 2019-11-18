package user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import user.service.CustomerLoginService;

/**
 * @Auther: ltc
 * @Date: 2019/11/18 22:31
 * @Description:
 */
@RestController
public class CustomerLoginController {
    @Autowired
    private CustomerLoginService customerLoginService;

}
