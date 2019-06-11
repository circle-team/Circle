package com.servlet;

import com.Dao.FollowDao;
import com.entity.FollowEntity;
import com.entity.UserInfoEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.sql.Timestamp;
@WebServlet("/FollowAddServlet")
public class FollowAddServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        HttpSession session = req.getSession();
        UserInfoEntity userinf =(UserInfoEntity)session.getAttribute("userinf");
        Long uid = userinf.getUid();
        Long huid = Long.valueOf(req.getParameter("uid"));
        Timestamp time = new Timestamp(new Date().getTime());
        FollowEntity follow = new FollowEntity(huid,uid,time);
        FollowDao fdao = new FollowDao();
        try {
            if (fdao.query(follow)==null)
            {
                System.out.println(fdao.insertData(follow));
            }
            else {
                System.out.println(fdao.deleteData(follow));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
