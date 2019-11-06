package com.tom.ssm.interceptor.admin;

import com.tom.ssm.entity.UserEntity;
import com.tom.ssm.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.Arrays;

/**
 * ClassName: AdminInterceptor
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/12 0:53
 */
@Component
public class AdminInterceptor implements HandlerInterceptor {
    @Autowired
    private AdminService adminService;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("AdminInterceptor执行=========>");
        HttpSession session = request.getSession();
        String adminLogin = (String)session.getAttribute("loginAdmin");
        System.out.println(adminLogin);
        if(adminLogin == null){
            response.sendRedirect(request.getContextPath()+"/login.jsp");
            return false;
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
