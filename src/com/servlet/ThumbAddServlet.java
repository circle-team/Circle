package com.servlet;

import com.Dao.ThumbsUpDao;
import com.entity.ThumbsUpEntity;
import com.entity.UserInfoEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
//import java.sql.Date;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

@WebServlet("/ThumbAddServlet")
public class ThumbAddServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入成功！");
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        HttpSession session = req.getSession();
        UserInfoEntity userinf =(UserInfoEntity)session.getAttribute("userinf");
        Long id = userinf.getUid();
        Long bid = Long.valueOf(req.getParameter("bid"));
        System.out.println("获得数据成功！");
        Timestamp time = new Timestamp(new Date().getTime());
        System.out.println(id);
        System.out.println(bid);
        System.out.println(time);
        ThumbsUpEntity thumb = new ThumbsUpEntity(bid,id,time);
        ThumbsUpDao thumbdao = new ThumbsUpDao();
        try {
            ThumbsUpEntity x = null;
            x=(ThumbsUpEntity)thumbdao.query(thumb);
//            System.out.println(x.getThbid());
//            System.out.println(thumb.getTuid());
//            System.out.println(thumb.getTdate());
            if (x==null)
            {
                System.out.println(thumbdao.insertData(thumb));
                System.out.println("servlet插入成功！");
            }
            else {
                System.out.println(thumbdao.deleteData(thumb));
                System.out.println("servlet删除成功！");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
