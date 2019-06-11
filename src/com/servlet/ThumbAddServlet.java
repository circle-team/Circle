package com.servlet;

import com.Dao.ThumbsUpDao;
import com.entity.ThumbsUpEntity;
import com.entity.UserInfoEntity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
//import java.sql.Date;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

public class ThumbAddServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        HttpSession session = req.getSession();
        UserInfoEntity userinf =(UserInfoEntity)session.getAttribute("userinf");
        Long id = userinf.getUid();
        Long bid = Long.valueOf(req.getParameter("bid"));
        Timestamp time = new Timestamp(new Date().getTime());
        ThumbsUpEntity thumb = new ThumbsUpEntity(bid,id,time);
        ThumbsUpDao thumbdao = new ThumbsUpDao();
        try {
            thumb=(ThumbsUpEntity) thumbdao.query(thumb);
            if (thumb==null)
            {
                System.out.println(thumbdao.insertData(thumb));
            }
            else {
                System.out.println(thumbdao.deleteData(thumb));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
