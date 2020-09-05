package com.web.study.servlet.employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "addservlet", urlPatterns = "/servlet/employee/add")
public class AddServlet extends  HttpServlet{
private static List<Map<String,String>> emps = new ArrayList<>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//          resp.setContentType("text/plain;charset=utf-8");
//          resp.getWriter().print("此網頁不提供此方法");
//          重新導向(外向)網址
//            resp.sendRedirect("/JavaWeb0829/forns/employee_form.jsp");
 RequestDispatcher rd = getServletContext().getRequestDispatcher("/forns/employee_form.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      resp.setContentType("text/plain;charset=utf-8");
        String empName = req.getParameter("empName");
      String empSalay = req.getParameter("empSalay");
      String empSex = req.getParameter("empSex");
      String empType = req.getParameter("empType");
      Map<String,String> emp = new LinkedHashMap<>();
      emp.put("empName",empName);
      emp.put("empSalay",empSalay);
      emp.put("empSex",empSex);
      emp.put("empType",empType);
      
      emps.add(emp);
     //3.預備資料將資料存放在request物件中
     req.setAttribute("emps", emps);
     
     //重新導向(內部)employee_form.jsp
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/forns/employee_form.jsp");
        rd.forward(req, resp);
    }

    
}
