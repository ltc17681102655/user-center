package user.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: ltc
 * @Date: 2019/11/26 11:40
 * @Description:
 */
@RestController
public class TestController {

    /**
     * 获取请求ip
     *
     * @return
     */
    @GetMapping("http-request")
    public String http() {
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes sra = (ServletRequestAttributes) ra;
        HttpServletRequest request = sra.getRequest();

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

        return "SUCCESS";
    }

}
