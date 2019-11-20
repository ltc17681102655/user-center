package user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: ltc
 * @Date: 2019/11/18 19:24
 * @Description:
 */

@SpringBootApplication
@MapperScan(basePackages = {"user.mapper"})
public class UserCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserCenterApplication.class, args);
    }
}
