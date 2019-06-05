package com.servlet;

import com.Dao.UserEntityDao;
import com.Dao.UserInfoDao;
import com.entity.UserInfoEntity;
import com.entity.UsersEntity;

import javax.naming.Context;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/login")
public class loginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        int test = 100;

        Long id = Long.valueOf(req.getParameter("name"));
        String pwd = req.getParameter("password");
       String ids = String.valueOf(id);
        Cookie ck1 = new Cookie("id",ids);
        Cookie ck2= new Cookie("password",pwd);

        if (req.getParameter("remember")!=null){
            ck1.setMaxAge(2*24*60*60);
            ck2.setMaxAge(2*24*60*60);
        }
        else
        {
            ck1.setMaxAge(0);
            ck2.setMaxAge(0);
        }

        resp.addCookie(ck1);
        resp.addCookie(ck2);

        UsersEntity x = new UsersEntity(id,pwd,null,null,null,null);

        UserEntityDao uedao = new UserEntityDao();
        try {
            test=uedao.Login(x);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(test);
        if (test==1)
        {

            HttpSession session = req.getSession();

            UserInfoEntity uif = new UserInfoEntity();
            uif.setUid(id);
            UserInfoDao uifdao = new UserInfoDao();
            try {
                uif=(UserInfoEntity) uifdao.query(uif);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            session.setAttribute("userinf",uif);
//
//            ArrayList<UserInfoServlet> Uilist = new ArrayList<UserInfoServlet>();

//            req.setAttribute();
            resp.sendRedirect("UserInfo.jsp");
//req.getRequestDispatcher()
        }
        else if(test==2)
        {
            out.write("false");

        }


    }
}
