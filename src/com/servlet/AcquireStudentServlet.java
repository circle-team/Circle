package com.servlet;

import com.Dao.FollowDao;
import com.Dao.UserInfoDao;
import com.entity.FollowEntity;
import com.entity.UserInfoEntity;
import com.entity.UserInfoShowEntity;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

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

public class AcquireStudentServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession();
        UserInfoEntity Useri = (UserInfoEntity) session.getAttribute("userinf");
//        UserInfoEntity Useri = (UserInfoEntity) session.getAttribute("userinf");

//        UserInfoEntity Useri = new UserInfoEntity();
//        Useri.setUid(77682l);
//        try {
//            Useri = (UserInfoEntity) UserIdao.query(Useri);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
                UserInfoDao UserIdao = new UserInfoDao();
        ArrayList<UserInfoEntity> Usersinf = new ArrayList<UserInfoEntity>();

        try {
            Usersinf=UserIdao.query(Useri,0,0);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ArrayList<UserInfoShowEntity> Usershowlist = new ArrayList<>();
        FollowEntity follow = new FollowEntity();
        FollowDao fdao = new FollowDao();
        Long ifthumb = null;
        for (UserInfoEntity x:Usersinf) {
            follow.setFhuid(x.getUid());
            follow.setFuid(Useri.getUid());
            try {
                if (fdao.query(follow)==null)
                {
                    ifthumb=0l;

                }
                else {
                    ifthumb=1l;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            UserInfoShowEntity y = new UserInfoShowEntity(x.getUid(),x.getUgender(),x.getUage(),x.getUcontact(),x.getUname(),x.getUaddress(),x.getUemail(),x.getUidentityNumber(),x.getUimage(),x.getUhobby(),x.getUschool(),x.getUgrade(),ifthumb);
            Usershowlist.add(y);
        }

        List<UserInfoShowEntity> Users = Usershowlist;
        JSONArray student = JSONArray.fromObject(Users);
        System.out.println(student);
        out.print(student);
    }
}
