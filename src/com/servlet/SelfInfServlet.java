package com.servlet;

import com.Dao.BlogInfoDao;
import com.Dao.FollowDao;
import com.entity.UserInfoEntity;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class SelfInfServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        System.out.println("success我！");
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession();
        UserInfoEntity userinf1 = (UserInfoEntity) session.getAttribute("userinf");
//        System.out.println("多少微博!");
//        System.out.println(userinf1.getUschool());
//        System.out.println("qqqq");
        int SelfBolgnumber=0;
        BlogInfoDao Blogdao = new BlogInfoDao();
        Long id = userinf1.getUid();
        try {
            SelfBolgnumber =Blogdao.queryDataNum(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        System.out.println(SelfBolgnumber);
        System.out.println("多少微博!");
//        System.out.println(id);
        int fans = 0;
        int bfans= 0;

        FollowDao fdao = new FollowDao();
        try {
            bfans=fdao.queryDataNum1(id,1l);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            fans=fdao.queryDataNum1(id,0l);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("fansbigbang");
        System.out.println(fans);
        System.out.println(bfans);
        System.out.println("fanbigbang ");
        JSONObject obj = new JSONObject();
        obj.put("fans",fans);
        obj.put("bfans",bfans);
        obj.put("BlogNumber",SelfBolgnumber);
        System.out.println("粉丝数："+fans+"关注数"+bfans+"微博数"+SelfBolgnumber);
        resp.getWriter().println(obj);
    }
}
