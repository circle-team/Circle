package com.servlet;

import com.Dao.UserEntityDao;
import com.entity.UsersEntity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class PwdSubmitServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        resp.setContentType("application/x-json;charset=utf-8");
        PrintWriter out = resp.getWriter();
        Long id  = Long.valueOf(req.getParameter("id"));
        UsersEntity User = new UsersEntity(id);
        UserEntityDao UserDao = new UserEntityDao();
        try {
            User=(UsersEntity) UserDao.query(User);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (User.getuAnswer1()==req.getParameter("answer"))
        {
            User.setUpassword(req.getParameter("password"));
        }
    }
}
