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
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/register")
public class UserRrgisterServlet  extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  IOException {

        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        System.out.println("111");
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String question1 = req.getParameter("q1");
        String Answer1=req.getParameter("a1");
        String question2 = req.getParameter("q2");
        String Answer2=req.getParameter("a2");
        System.out.println(question1);
        UserEntityDao Userdao = new UserEntityDao();
//        UsersEntity e = new UsersEntity((long) 11,"1","1","1","1","1");
//        try {
//            Userdao.insertData(e);
//        } catch (SQLException ex) {
//            System.out.println("输入失败");
//            ex.printStackTrace();
//        }
        boolean x = true;
        long uid = 1;
        UsersEntity Usert =new UsersEntity((long) 1);
//        try {
//            if (Userdao.deleteData(Usert))
//            {
//                System.out.println("删除成功");
//            }
//
//        } catch (SQLException e) {
//            System.out.println("删除失败");
//            e.printStackTrace();
//        }
        while(Usert!=null) {
                uid = (long)(Math.random() * 1000000);
                Usert.setUserid(uid);
                try {
                    Usert = (UsersEntity) Userdao.query(Usert);
                } catch (SQLException ew) {
                    System.out.println("shibai!");
                    ew.printStackTrace();
                }
            }
//        UserInfoEntity UserInfo = new UserInfoEntity();
        UsersEntity User = new UsersEntity(uid,password,question1,Answer1,question2,Answer2);


        try {
           x= Userdao.insertData(User);
        } catch (SQLException ee) {
            ee.printStackTrace();
        }





        if(x) {
//            HttpSession session = req.getSession();
//            session.setAttribute("User",User);
            UserInfoEntity uiuser = new UserInfoEntity(uid,null,0,null,name,null,null,null,null,null);

            UserInfoDao uidao = new UserInfoDao();
            try {
               uidao.insertData(uiuser);
            } catch (SQLException eq) {
                eq.printStackTrace();
            }


            resp.sendRedirect("login.html");
        }





        else
        {
            resp.sendRedirect("/Fail.jsp");
        }


    }
    }
