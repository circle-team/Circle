package com.servlet;

import com.Dao.UserInfoDao;
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

public class UNStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession();
        UserInfoEntity Useri = (UserInfoEntity) session.getAttribute("userinf");
        ArrayList<UserInfoEntity> Usersinf = new ArrayList<UserInfoEntity>();
        UserInfoDao UserIdao = new UserInfoDao();
        try {
            Usersinf=UserIdao.query(Useri,0,0);
        } catch (SQLException e) {
            e.printStackTrace();
        }



    }
}
