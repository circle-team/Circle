package com.servlet;

import com.Dao.UserEntityDao;
import com.entity.UsersEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/")
public class UserRrgisterServlet  extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String question1 = req.getParameter("question1");
        String Answer1=req.getParameter("answer1");
        String question2 = req.getParameter("question2");
        String Answer2=req.getParameter("answer2");

        UsersEntity User = new UsersEntity(password,question1,Answer1,question2,Answer2);
        UserEntityDao Userdao = new UserEntityDao();
        Boolean x = true;
        try {
           x= Userdao.insertData(User);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(x) {
            HttpSession session = req.getSession();
            session.setAttribute("User",User);


            resp.sendRedirect("/UserInfo.jsp");
        }
        else
        {
            resp.sendRedirect("/Fail.jsp");
        }


    }
    }
