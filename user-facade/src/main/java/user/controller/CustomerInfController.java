package user.controller;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
@RestController
@RequestMapping("/customerInf")
public class CustomerInfController {
    @Autowired
    private ICustomerInfService customerInfService;

    @GetMapping("info")
    public CustomerInfEntity userInfo() {
        CustomerInfEntity byId = customerInfService.getById(1);
        System.out.println(byId);
        return byId;
    }

}

