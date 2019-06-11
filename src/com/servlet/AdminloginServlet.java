package com.servlet;

import com.Dao.AdminDao;
import com.entity.AdminEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
@WebServlet("/AdminloginServlet")
public class AdminloginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("qqq!");
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        Long id = Long.valueOf(req.getParameter("name"));
        Long test = 0l;
        String password = req.getParameter("password");
        AdminDao admindao = new AdminDao();
        AdminEntity admin = new AdminEntity(id,null);
        AdminEntity admin1 = null;
        try {
            admin1=(AdminEntity) admindao.query(admin);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (admin1==null) {
            test = 1l;
            out.write("test");
        }
        else {
            if(admin1.getPassword().equals(password))
            {
                resp.sendRedirect("AdminCirle.jsp");
            }
            out.write("test");
        }

        }
}
