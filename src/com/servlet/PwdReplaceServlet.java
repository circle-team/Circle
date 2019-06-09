package com.servlet;

import com.Dao.UserEntityDao;
import com.entity.UsersEntity;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
@WebServlet("/PwdReplaceServlet")
public class PwdReplaceServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        resp.setContentType("application/x-json;charset=utf-8");
        PrintWriter out = resp.getWriter();
//        System.out.println(req.getParameter("id"));
        Long id = Long.valueOf(req.getParameter("id"));
        UsersEntity User = new UsersEntity(id);
        UserEntityDao Udao = new UserEntityDao();
        try {
      User=(UsersEntity) Udao.query(User);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JSONObject obj = new JSONObject();
        System.out.println(User.getUquestion1());

        if (User!=null)
        {
            obj.put("que",User.getUquestion1());
            obj.put("puton","1");

        }
        else {
            obj.put("puton","0");
        }

        resp.getWriter().println(obj.toString());
    }

}
