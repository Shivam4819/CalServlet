package com.Cal;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AddServlet", urlPatterns = {"/add"})
public class AddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      //  response.setContentType("text");
        PrintWriter out= response.getWriter();
        int value1 =Integer.parseInt(request.getParameter("num1"));
        int value2= Integer.parseInt(request.getParameter("num2"));
        int z= value1+value2;
        out.println("result is- "+z);
        String n="String.valueOf(z)";

        // adding cookie

        Cookie cookie=new Cookie("uname",n);
        response.addCookie(cookie);
        response.sendRedirect("http://localhost:8080/CalculatorServlet/response/?z="+z);
    }
}
