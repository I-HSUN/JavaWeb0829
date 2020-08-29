package com.web.study.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LottoServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        Random r = new Random();
        Set<Integer>nums = new LinkedHashSet<>();
        while(nums.size()<10){
        nums.add(r.nextInt(50)+1);
                }
        PrintWriter out = resp.getWriter();
        out.print(nums);
    
    
    }
   
}
