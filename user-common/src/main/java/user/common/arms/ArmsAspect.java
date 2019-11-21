package user.common.arms;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import static java.lang.System.currentTimeMillis;

/**
 * @Auther: ltc
 * @Date: 2019/7/19 20:47
 * @Description: Arms监控
 */
@Aspect
@Component
@Slf4j
public class ArmsAspect {

    @Around("@annotation(armsLog)")
    public Object around(ProceedingJoinPoint point, ArmsLog armsLog) throws Throwable {
        long startTime = currentTimeMillis();
        try {
            Object proceed = point.proceed();
            //info
            ArmsLogUtils.loggerInfo(armsLog, currentTimeMillis() - startTime);
            return proceed;
        } catch (Exception e) {
            //error
            ArmsLogUtils.loggerError(armsLog, point, e, currentTimeMillis() - startTime);
            //保存日志
            throw e;
        }
    }
}