package com.servlet;

import com.Dao.UserEntityDao;
import com.Dao.UserInfoDao;
import com.entity.UserInfoEntity;
import com.entity.UsersEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
@WebServlet("/deleteuser")
public class DeleteUserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入成功！");
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        resp.setContentType("application/x-json;charset=utf-8");
        PrintWriter out = resp.getWriter();
        Long id = Long.valueOf(req.getParameter("uid"));
        UserInfoDao userInfoDao = new UserInfoDao();
        UserInfoEntity userInfoEntity = new UserInfoEntity();
        UserEntityDao userEntityDao = new UserEntityDao();
        UsersEntity usersEntity = new UsersEntity();
        usersEntity.setUserid(id);
        try {
            userEntityDao.deleteData(usersEntity);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
