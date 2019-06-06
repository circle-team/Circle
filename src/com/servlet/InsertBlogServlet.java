package com.servlet;

import com.Dao.BlogInfoDao;
import com.entity.BlogInfoEntity;
import com.entity.UserInfoEntity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

public class InsertBlogServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        HttpSession session = req.getSession();
        UserInfoEntity userinf =(UserInfoEntity)session.getAttribute("userinf");
        Long id = userinf.getUid();
        BlogInfoDao BlogDao = new BlogInfoDao();

        BlogInfoEntity Blog=null;
        Long Bid = (long)(Math.random()*10000);
        try {
            Blog = (BlogInfoEntity) BlogDao.query(Bid);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        while (Blog!=null) {
            try {
                 Bid = (long)(Math.random()*10000);
                Blog = (BlogInfoEntity) BlogDao.query(Bid);
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }


        Timestamp date= new Timestamp(new Date().getTime());
        Blog = new BlogInfoEntity(Bid,id,req.getParameter("text"),date,null,req.getParameter("title"));
        try {
            BlogDao.insertData(Blog);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
