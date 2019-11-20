package user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import user.entity.CustomerInfEntity;
import user.service.ICustomerInfService;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author ltc
 * @since 2019-11-20
 */
@Controller
@RequestMapping("/customerInf")
public class CustomerInfController {
    @Autowired
    private ICustomerInfService customerInfService;

    @GetMapping("test")
    public String test() {
        CustomerInfEntity byId = customerInfService.getById(1);
        System.out.println(byId);
        return "SUCCESS";
    }
}

