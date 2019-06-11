package com.servlet;

import com.Dao.FollowDao;
import com.entity.FollowEntity;
import com.entity.UserInfoEntity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class AddIDFollowServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        resp.setContentType("application/x-json;charset=utf-8");
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession();
        UserInfoEntity userinf = (UserInfoEntity)session.getAttribute("userinf");
        FollowDao fdao = new FollowDao();
        Long id = Long.valueOf(req.getParameter("id"));
        FollowEntity followEntity = new FollowEntity(id,userinf.getUid());
        try {
            fdao.insertData(followEntity);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
