package com.servlet;

import com.Dao.BlogInfoDao;
import com.Dao.CommentDao;
import com.Dao.ThumbsUpDao;
import com.entity.BlogInfoEntity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class DeleteBlogServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        resp.setContentType("application/x-json;charset=utf-8");
        PrintWriter out = resp.getWriter();
        //删除blog信息
        Long Bid = Long.valueOf(req.getParameter("Bid"));
        BlogInfoEntity Blog = new BlogInfoEntity();
        Blog.setBid(Bid);
        BlogInfoDao Bdao = new BlogInfoDao();
        try {
            Bdao.deleteData(Blog);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //删除关于blog的评论
        CommentDao commentDao = new CommentDao();
        try {
            commentDao.deleteData(Bid);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ThumbsUpDao thumbsUpDao = new ThumbsUpDao();
        try {
            thumbsUpDao.deleteData(Bid);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
