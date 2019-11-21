package user.controller.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import user.entity.CustomerLoginEntity;
import user.service.CustomerLoginService;

/**
 * @Auther: ltc
 * @Date: 2019/11/18 22:32
 * @Description:
 */
@RestController
public class MybatisPlusApiController {

    @Autowired
    private CustomerLoginService customerLoginService;

    @GetMapping("test")
    public CustomerLoginEntity test() {
        CustomerLoginEntity byId = customerLoginService.getById(1);
        System.out.println(byId);
        return byId;
    }
}
