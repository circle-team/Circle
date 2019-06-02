package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/register")
public class UserRrgisterServlet  extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String question1 = req.getParameter("q1");
        String Answer1=req.getParameter("a1");
        String question2 = req.getParameter("q2");
        String Answer2=req.getParameter("a2");
        UserEntityDao Userdao = new UserEntityDao();
        boolean x = true;
        long uid = 1;
        UsersEntity Usert =new UsersEntity((long) 1);
        while(Usert!=null) {
                uid = (long)Math.random() * 1000000;
                Usert = new UsersEntity(uid);
                try {
                    Usert = (UsersEntity) Userdao.query(Usert);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        UserInfoEntity UserInfo = new UserInfoEntity();
        UsersEntity User = new UsersEntity(uid,password,question1,Answer1,question2,Answer2);


        try {
           x= Userdao.insertData(User);
        } catch (SQLException e) {
            e.printStackTrace();
        }





        if(x) {
            HttpSession session = req.getSession();
            session.setAttribute("User",User);
            UserInfoEntity uiuser = new UserInfoEntity();
            uiuser.setUid(uid);
            uiuser.setUname(name);
            UserInfoDao uidao = new UserInfoDao();
            try {
               uidao.insertData(uiuser);
            } catch (SQLException e) {
                e.printStackTrace();
            }


            resp.sendRedirect("/UserInfo.jsp");
        }





        else
        {
            resp.sendRedirect("/Fail.jsp");
        }


    }
    }
