package com.servlet;

import javax.naming.Context;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class loginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       req.setCharacterEncoding("utf-8");
        String id = req.getParameter("name");
        String pwd = req.getParameter("password");

        Cookie ck1 = new Cookie("id",id);
        Cookie ck2= new Cookie("password",pwd);

        if (req.getParameter("remember")!=null){
            ck1.setMaxAge(2*24*60*60);
            ck2.setMaxAge(2*24*60*60);
        }
        else
        {
            ck1.setMaxAge(0);
            ck2.setMaxAge(0);
        }

        resp.addCookie(ck1);
        resp.addCookie(ck2);




    }
}
