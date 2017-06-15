package edu.ubbcluj.webprog.web.filter;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by kincso on 14.06.2017.
 */
public class AdminInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {

        Boolean auth = false;
        int role = 0;

        if(request.getSession().getAttribute("authenticated") != null &&
                request.getSession().getAttribute("role") != null) {
            auth = (Boolean)request.getSession().getAttribute("authenticated");
            role = (int)request.getSession().getAttribute("role");
        }
        if(!auth || role != 1) {
            response.sendRedirect("/login");
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
