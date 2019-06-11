package com.servlet;

import com.Dao.BlogInfoDao;
import com.entity.BlogInfoEntity;
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

@WebServlet("/InsertBlogServlet")
public class InsertBlogServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入成功！111");
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        HttpSession session = req.getSession();
        UserInfoEntity userinf =(UserInfoEntity)session.getAttribute("userinf");
        Long id = userinf.getUid();
        BlogInfoDao BlogDao = new BlogInfoDao();

        BlogInfoEntity Blog= new BlogInfoEntity();
        Long Bid = (long)(Math.random()*10000);
        Blog.setBid(Bid);
        BlogInfoEntity Blog1 = null;
        try {
            Blog1 = (BlogInfoEntity) BlogDao.query(Blog);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        while (Blog1!=null) {
            try {

                 Bid = (long)(Math.random()*10000);
                Blog.setBid(Bid);
                Blog1 = (BlogInfoEntity) BlogDao.query(Blog);
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println("查询分配随机数成功！");

        Timestamp date= new Timestamp(new Date().getTime());
        Blog = new BlogInfoEntity(Bid,id,req.getParameter("text"),date,"images/69.jpeg",null);
        try {
            BlogDao.insertData(Blog);
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        resp.sendRedirect("action.jsp");
    }
}
