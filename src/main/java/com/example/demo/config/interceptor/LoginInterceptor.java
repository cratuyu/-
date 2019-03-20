package com.example.demo.config.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: ljy
 * @Date: 2019/1/16 10:24
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

    private static final String LOGIN = "/login";

    private static final String USERNAME = "username";

    private static final String LOGINSUBMIT = "/loginSubmit";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession httpSession = request.getSession();
        String url = request.getRequestURL().toString();
        Long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);
        if(!LOGIN.equals(url.substring(url.length() - 6, url.length()))) {
            if (LOGINSUBMIT.equals(url.substring(url.length() - 12, url.length()))){
                return true;
            }
            else if (httpSession.getAttribute(USERNAME) == null) {
                response.sendRedirect(request.getContextPath() + LOGIN);
                return false;
            } else {
                String username = (String) httpSession.getAttribute(USERNAME);
                if (USERNAME.equals(username)) {
                    request.getSession().setAttribute(USERNAME, username);
                    return true;
                }
            }
        }else if (LOGIN.equals(url.substring(url.length() - 6, url.length()))){
            return true;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        long startTime = (Long) request.getAttribute("startTime");
        request.removeAttribute("startTime");;
        long endTime = System.currentTimeMillis();
        System.out.println("本次请求处理时间为:" + new Long(endTime-startTime)+ "ms");
    }

}

