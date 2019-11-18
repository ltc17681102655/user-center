package user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import user.entity.CustomerLoginEntity;
import user.service.CustomerLoginService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserCenterApplicationTest {

    @Autowired
    private CustomerLoginService customerLoginService;

    @Test
    public void demo() {
        CustomerLoginEntity byId = customerLoginService.getById(1);
        System.out.println(byId);
    }
}
