package com.servlet;

import com.Dao.FollowDao;
import com.Dao.UserInfoDao;
import com.entity.UserInfoEntity;
import net.sf.json.JSONArray;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AcquireFansServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        FollowDao fdao = new FollowDao();
        HttpSession session = req.getSession();
        UserInfoEntity Useri = (UserInfoEntity) session.getAttribute("userinf");
        ArrayList<Long> Userid = null;
        try {
            Userid =fdao.query2(Useri.getUid());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        UserInfoDao UserInfDao = new UserInfoDao();
        ArrayList<UserInfoEntity> Userinfs = new ArrayList<>();
        for (Long x:Userid) {
            UserInfoEntity Uinf = new UserInfoEntity(x);
            try {
                Userinfs.add((UserInfoEntity) UserInfDao.query(Uinf));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        List<UserInfoEntity> fansinf = Userinfs;
        JSONArray Fans = JSONArray.fromObject(fansinf);
        out.print(Fans);


    }
}