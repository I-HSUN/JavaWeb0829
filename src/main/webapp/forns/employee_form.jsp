<%-- 
    Document   : student_form
    Created on : 2020/9/5, 上午 10:20:16
    Author     : MB-study
--%>

<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Page</title>
        <link rel="stylesheet" href="https://unpkg.com/purecss@2.0.3/build/pure-min.css" integrity="sha384-cg6SkqEOCV1NbJoCu11+bm0NvBRc8IYLRGXkmNrqUBfTjmMYwNKPWBTIKyw9mHNJ" crossorigin="anonymous">
    </head>
    <body style="padding: 20px">
        <form class="pure-form pure-form-stacked" method="post" action="/JavaWeb0829/servlet/employee/add">
            <fieldset>
                <legend>Employee Form</legend>
                員工:<select id="empName" name="empName" >
                    <option value="Jhon">Jhon喬治</option>
                    <option value="Mary">Mary瑪莉</option>
                    <option value="Mark">Mark馬克</option>
                </select>
                <p/>
                薪資:<input type="number" id="empSalay"  name="empSalay" placeholder="請輸入薪資" />
                <p />
                性別: <input type="radio" id="empSex"  name="empSex" value="1" />&nbsp;男
                     <input type="radio" id="empSex"  name="empSex" value="2" />&nbsp;女
                <p/>
               主管: <input type="checkbox" id="empType"  name="empType" value="true" />是
                <p />
                <button type="submit" class="pure-button pure-button-primary">Add</button>
            </fieldset>
        </form>
        <%
            List<Map<String,String>>emps = null;
            if(request.getAttribute("emps")!= null){
                emps = (List<Map<String,String>>)request.getAttribute("emps");
       } 
        %>
        <table class="pure-table">
    <thead>
        <tr>
            <th>員工</th>
            <th>薪資</th>
            <th>性別</th>
            <th>主管</th>
        </tr>
    </thead>
    <%if(emps !=null){%>
    <tbody>
        <%for(Map<String,String>emp:emps){%>
        <tr>
            <td><%=emp.get("empName") %></td>
            <td><%=emp.get("empSalary") %></td>
            <td><%=emp.get("empSex") %></td>
            <td><%=emp.get("empType") %></td>                                                                 
        </tr>
        <%}%>
    </tbody>
    <%}%>
</table>
    </body>
</html>
