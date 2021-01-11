package com.Cal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ResponseServlet" , urlPatterns = {"/response/*"})
public class ResponseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter= response.getWriter();
        int value1 =Integer.parseInt(request.getParameter("z"));
        Cookie ck[]=request.getCookies();
        //this is cookie
        printWriter.println("heelo"+ck[0].getValue());
        //thiss is response
        printWriter.println("your result is-"+value1);



    }
}
