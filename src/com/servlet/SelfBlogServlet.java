package com.servlet;

import com.Dao.BlogInfoDao;
import com.Dao.FollowDao;
import com.entity.BlogInfoEntity;
import com.entity.UserInfoEntity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

public class SelfBlogServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession();
        UserInfoEntity userinf1 = (UserInfoEntity) session.getAttribute("userinf");
        int SelfBolgnumber=0;
        BlogInfoDao Blogdao = new BlogInfoDao();
        try {
           SelfBolgnumber =Blogdao.queryDataNum(userinf1.getUid());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        int fans = 0;
        int bfans= 0;
        FollowDao fdao = new FollowDao();
        try {
            bfans=fdao.queryDataNum1(userinf1.getUid(),1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            fans=fdao.queryDataNum1(userinf1.getUid(),0);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        req.setAttribute("fans",fans);
        req.setAttribute("bfans",bfans);
        req.setAttribute("bnumber",SelfBolgnumber);

      ArrayList<BlogInfoEntity> BlogE= new ArrayList<BlogInfoEntity>();
      ArrayList<Long> ID =null;
        try {
            ID = fdao.query1(userinf1.getUid());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (Long x:ID) {
            try {
                BlogE=Blogdao.query1(x,BlogE);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }






    }
}
