package user.common.arms;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: ltc
 * @Date: 2019/7/20 10:43
 * @Description:
 */
@Slf4j
public class PointUtil {

    private static final String METHOD_PARAMS = "方法参数:";
    private static final String METHOD_PARAMS_EMPTY = "方法参数为空 ";

    /**
     * 获取请求
     *
     * @return
     */
    public static HttpServletRequest request() {
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes sra = (ServletRequestAttributes) ra;
        return sra.getRequest();
    }

    /**
     * 获取IP地址
     *
     * @return
     */
    public static String ip() {
        HttpServletRequest request = request();
        String ip = request.getHeader("X-Forwarded-For");
        if (StringUtils.isNotEmpty(ip) && !"unKnow".equalsIgnoreCase(ip)) {
            //多次反向代理后会有多个ip值，第一个ip才是真实ip
            String[] ipList = ip.split(",");
            ip = ipList[0];
        } else {
            ip = request.getHeader("X-Real-IP");
            if (StringUtils.isEmpty(ip) || "unKnown".equalsIgnoreCase(ip)) {
                ip = request.getRemoteAddr();
            }
        }
        return ip;
    }

    /**
     * 接口:请求路径
     *
     * @return
     */
    public static String requestURI() {
        return request().getRequestURI();
    }

    /**
     * 类名
     *
     * @param point
     * @return
     */
    public static String className(ProceedingJoinPoint point) {
        return point.getTarget().getClass().getName();
    }

    /**
     * 方法名
     *
     * @param point
     * @return
     */
    public static String methodName(ProceedingJoinPoint point) {
        return point.getSignature().getName();
    }

    /**
     * 方法参数
     *
     * @return
     */
    public static String methodParams(ProceedingJoinPoint point) {
        Signature signature = point.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        String[] parameterNames = methodSignature.getParameterNames();
        Object[] args = point.getArgs();
        if (parameterNames != null && parameterNames.length > 0 && args != null && parameterNames.length == args.length) {
            List<String> argms = new ArrayList<>(parameterNames.length);
            for (int i = 0; i < parameterNames.length; i++) {
                try {
                    //为了性能,使用的toString,接口参数包含的类需实现toString
                    argms.add(parameterNames[i] + "=" + (args[i] == null ? null : args[i].toString()));
                } catch (Exception ex) {
                    log.warn(ex.getMessage(), ex);
                }
            }
            return METHOD_PARAMS + "{" + String.join(", ", argms) + "} ";
        }

        return METHOD_PARAMS_EMPTY;
    }
}
