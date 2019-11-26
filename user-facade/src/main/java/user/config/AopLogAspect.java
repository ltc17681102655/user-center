package user.config;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.hamcrest.core.Is;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sun.security.jgss.GSSCaller;
import user.common.arms.PointUtil;
import user.common.enums.AopLogTypeEnum;
import user.entity.AopLogEntity;
import user.mapper.AopLogMapper;

import static java.lang.System.currentTimeMillis;

/**
 * @Auther: ltc
 * @Date: 2019/11/26 15:24
 * @Description: AOP日志记录
 */
@Aspect
@Component
@Slf4j
public class AopLogAspect {

    private static final Gson gson = new Gson();

    private static final String USER = "USER";

    @Autowired
    private AopLogMapper aopLogMapper;

    @Pointcut(value = "within(user.*)")
    public void aopLog() {
    }

    @Around("aopLog()")
    public Object aopLog(ProceedingJoinPoint point) throws Throwable {
        long startTime = currentTimeMillis();
        try {
            Object proceed = point.proceed();
            AopLogEntity convert = convert(point, AopLogTypeEnum.SUCCESS, startTime, null);
            int insert = aopLogMapper.insert(convert);
            if (insert == 0) {
                log.error("aop保存数据异常:参数:{}", gson.toJson(convert));
            }
            return proceed;
        } catch (Exception e) {
            AopLogEntity convert = convert(point, AopLogTypeEnum.SUCCESS, startTime, e.getMessage());
            int insert = aopLogMapper.insert(convert);
            if (insert == 0) {
                log.error("aop保存数据异常:参数:{}", gson.toJson(convert));
            }
            throw e;
        }
    }

    private AopLogEntity convert(ProceedingJoinPoint point, AopLogTypeEnum aopLogTypeEnum, long startTime, String errorMessage) {
        AopLogEntity aopLogEntity = new AopLogEntity();
        aopLogEntity.setSource(USER);
        aopLogEntity.setIp(PointUtil.ip());
        aopLogEntity.setUrl(PointUtil.requestURI());
        aopLogEntity.setRequest(PointUtil.methodParams(point));
        aopLogEntity.setResponse(errorMessage);
        aopLogEntity.setIsSuccess(aopLogTypeEnum.value());
        int time = (int) (currentTimeMillis() - startTime);
        aopLogEntity.setTime(time);
        return aopLogEntity;
    }
}
