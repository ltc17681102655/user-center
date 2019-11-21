package user.common.arms;


import java.lang.annotation.*;

/**
 * @Auther: ltc
 * @Date: 2019/7/19 20:23
 * @Description:
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ArmsLog {
    /**
     * 指标
     *
     * @return
     */
    ArmsLogIndexEnum index();
}
