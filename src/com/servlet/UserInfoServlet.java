package com.servlet;

import com.Dao.UserInfoDao;
import com.entity.UserInfoEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
@WebServlet("/userinf")
public class UserInfoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession();
        UserInfoEntity kuaile = null;
         kuaile = (UserInfoEntity) session.getAttribute("userinf");
        Long id = kuaile.getUid();
        String name = req.getParameter("name");
        String gender = req.getParameter("gender");
        String contact = req.getParameter("contact");
        String email = req.getParameter("email");
//        String age = req.getParameter("age");
        Integer age = Integer.valueOf(req.getParameter("age"));
        String idnumber = req.getParameter("identityNumber");
        String hobby = req.getParameter("hobby");
        String address = req.getParameter("address");
        String uschool = req.getParameter("uschool");
        String ugrade = req.getParameter("ugrade");


        boolean update=false;
        UserInfoEntity x = new UserInfoEntity(id,gender,age,contact,name,address,email,idnumber,null,hobby,uschool,ugrade);

        UserInfoDao xdao = new UserInfoDao();
        try {
            if (xdao.updateData(x))
            {

                session.setAttribute("userinf",x);
                req.getRequestDispatcher("UserInfo.jsp").forward(req,resp);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
