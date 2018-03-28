package com.dd.util;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class UserFilter implements Filter {
    protected final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String username = (String) httpServletRequest.getSession().getAttribute("user");
        logger.info("get username: " + username);
        if (!"access_denied".equals(username) && null != username) {
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }
        String qstr = httpServletRequest.getQueryString();
        logger.info(qstr);
        String token = qstr == null ? null : qstr.substring(qstr.indexOf("=") + 1);
        logger.info(token);

        username = UserFilterUtil.getUsername(httpServletRequest, token);
        if (!"access_denied".equals(username) && null != username) {
            httpServletRequest.getSession().setAttribute("user", username);
            logger.info("set username: " + username);
        } else {
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
