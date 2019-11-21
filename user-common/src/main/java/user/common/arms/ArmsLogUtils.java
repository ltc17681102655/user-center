package user.common.arms;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.ArrayList;
import java.util.List;


/**
 * @author: ltc
 * @Date: 2019/7/19 20:25
 * @Description: arms监控工具类(此类包路径不能动)
 */
@Slf4j
public class ArmsLogUtils {

    private static final String INTERFACE = "接口:";
    private static final String CLASS_NAME = "类名";
    private static final String METHOD_NAME = "方法名";
    private static final String METHOD_PARAMS = "方法参数";
    private static final String ERROR_MESSAGE = "异常";

    private static final String FORMAT = " | ";

    public static void loggerInfo(ArmsLog armsLog, long time) {
        //指标
        String index = armsLog.index().value();
        //耗时
        String timeIndex = ArmsLogPrefixEnum.TIME.value() + FORMAT + time;
        log.info(String.join(FORMAT, index, timeIndex));
    }

    public static void loggerError(ArmsLog armsLog, ProceedingJoinPoint point, Exception e, long time) {
        List<String> logs = new ArrayList<>();

        //指标
        logs.add(ArmsLogPrefixEnum.ERROR.value() + armsLog.index().value());
        //耗时
        logs.add(ArmsLogPrefixEnum.TIME.value() + FORMAT + time);
        //接口
        logs.add(INTERFACE + PointUtil.requestURI());
        //类名
        logs.add(CLASS_NAME + PointUtil.className(point));
        //方法
        logs.add(METHOD_NAME + PointUtil.methodName(point));
        //方法参数
        logs.add(METHOD_PARAMS + PointUtil.methodParams(point));
        //异常
        logs.add(ERROR_MESSAGE + e.getMessage());

        log.error(String.join(FORMAT, logs));
    }

}


