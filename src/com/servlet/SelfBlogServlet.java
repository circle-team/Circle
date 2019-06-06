package com.servlet;

import com.Dao.BlogInfoDao;
import com.Dao.FollowDao;
import com.entity.BlogInfoEntity;
import com.entity.UserInfoEntity;
import netscape.javascript.JSObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import net.sf.json.JSONObject;
import java.util.Date;

public class SelfBlogServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession();
        UserInfoEntity userinf1 = (UserInfoEntity) session.getAttribute("userinf");
        int SelfBolgnumber=0;
        BlogInfoDao Blogdao = new BlogInfoDao();
        try {
           SelfBolgnumber =Blogdao.queryDataNum(userinf1.getUid());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        int fans = 0;
        int bfans= 0;
        FollowDao fdao = new FollowDao();
        try {
            bfans=fdao.queryDataNum1(userinf1.getUid(),1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            fans=fdao.queryDataNum1(userinf1.getUid(),0);
        } catch (SQLException e) {
            e.printStackTrace();
        }

      ArrayList<BlogInfoEntity> BlogE= new ArrayList<BlogInfoEntity>();
      ArrayList<Long> ID =null;
        try {
            ID = fdao.query1(userinf1.getUid());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (Long x:ID) {
            try {
                BlogE=Blogdao.query1(x,BlogE);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        Comparator<BlogInfoEntity> comparator = new Comparator<BlogInfoEntity>() {
            @Override
            public int compare(BlogInfoEntity o1, BlogInfoEntity o2) {
                Long sqlLastTime = o1.getBdate().getTime();
                long sqlLastTime2 = o2.getBdate().getTime();

                return (int) (sqlLastTime - sqlLastTime2);

            }
        };
          Collections.sort(BlogE, comparator);

        ArrayList<BlogInfoEntity> allSites = new SitesCollection().getAllSites();
        JSONArray allSitesJson = new JSONArray(allSites);
        return allSitesJson.toString();
    }
}
