package com.servlet;

import com.Dao.FollowDao;
import com.entity.FollowEntity;
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

public class AcquireBFansNumServlet extends HttpServlet {
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
            Userid =fdao.query1(Useri.getUid());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        ArrayList<Boolean> Follows = new ArrayList<>();
        FollowDao followDao = new FollowDao();
        for (Long id: Userid) {
            FollowEntity follow = new FollowEntity();
            follow.setFhuid(Useri.getUid());
            follow.setFuid(id);
            try {
                if ((FollowEntity)followDao.query(follow)!=null)
                {
                    Follows.add(false);
                }
                else {
                    Follows.add(true);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }


        List<Boolean> F = Follows;
        JSONArray F2 = JSONArray.fromObject(F);
        out.print(F2);

    }
}
