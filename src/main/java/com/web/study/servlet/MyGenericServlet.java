package com.web.study.servlet;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyGenericServlet extends GenericServlet{

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("init MyGenericServlet.");
    }

    
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
          System.out.println("service MyGenericServlet.");
        res.getWriter().print("service MyGenericServlet.");
    }
    @Override
    public void destroy() {
         System.out.println("destroy MyGenericServlet.");
    }  
}
