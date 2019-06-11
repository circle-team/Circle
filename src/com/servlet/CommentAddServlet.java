package com.servlet;

import com.Dao.CommentDao;
import com.entity.CommentsEntity;
import com.entity.UserInfoEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Random;
@WebServlet("/CommentAddServlet")
public class CommentAddServlet  extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        HttpSession session = req.getSession();
        UserInfoEntity userinf =(UserInfoEntity)session.getAttribute("userinf");
        Long id = userinf.getUid();
        Long cid = (long)(Math.random()*10000);
        CommentDao Cdao = new CommentDao();
        CommentsEntity comment =null;
        try {
            comment = (CommentsEntity) Cdao.query(cid);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        while (comment!=null)
        {
            cid=(long)(Math.random()*10000);
            try {
                comment=(CommentsEntity)Cdao.query(cid);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        Timestamp time = new Timestamp(new Date().getTime());
        comment = new CommentsEntity(cid,Long.valueOf(req.getParameter("fid")),Long.valueOf(userinf.getUid()),req.getParameter("ctext"),time);
        try {
            Cdao.insertData(comment);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
