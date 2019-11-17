package com.pinpinduo.config;

import com.pinpinduo.utils.Base64Utils;
import com.pinpinduo.utils.EncryptUtils;
import com.pinpinduo.utils.RedisUtils;
import com.pinpinduo.utils.IpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


/*********************************
 * @作者 67582
 * @项目名 Spring-Cloud-Demo
 * @时间 2019/3/26 0:59
 * @Version 1.0
 *********************************/
public class HeadlerFilter implements Filter {

    private Logger LOG = LoggerFactory.getLogger(HeadlerFilter.class);

    @Autowired
    private RedisUtils redisUtils;

    @Override
    public void init(javax.servlet.FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if (servletRequest instanceof HttpServletRequest) {
            HttpServletRequest req = (HttpServletRequest) servletRequest;
            String userSign = req.getHeader("UserSign");
            String userTime = Base64Utils.getTimeSS(10000, 0).toString();
            String drop = Base64Utils.strSort(userTime, "rise").toString();
            String encrypSign = EncryptUtils.SHA1Encode(drop, userTime);
            if (userSign != null && !"".equals(userSign.trim())) {
                if (userSign.equals(encrypSign))
                    filterChain.doFilter(servletRequest, servletResponse);
                else {
                    LOG.error("[" + IpUtils.getIpaddr(req) + ",filter,没通过]");
                    return;
                }
            } else {
                LOG.error("没通过");
                return;
            }
        }
    }

    @Override
    public void destroy() {
    }
}
