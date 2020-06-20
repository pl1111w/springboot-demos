package com.pl1111w.servletfilter.config;

import javax.servlet.*;
import java.io.IOException;

public class FilterConfig implements Filter {


    @Override
    public void init(javax.servlet.FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String username = request.getParameter("username");
        if("jordan".equals(username)){
            chain.doFilter(request,response);
        }
//        String path = ((HttpServletRequest) request).getRequestURI();
//        if (path.startsWith("/pl1111w/servlet")) {
//            filterChain.doFilter(request, response); // 排除的url
//        }


    }

    @Override
    public void destroy() {

    }
}
