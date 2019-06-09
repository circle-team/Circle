package com.servlet;

import com.Dao.BlogInfoDao;
import com.Dao.FollowDao;
import com.entity.BlogInfoEntity;
import com.entity.UserInfoEntity;
import net.sf.json.JSONArray;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@WebServlet("/SelfBlogServlet")
public class SelfBlogServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
        System.out.println(SelfBolgnumber);
        System.out.println("多少微博!");
        System.out.println(id);
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

      ArrayList<BlogInfoEntity> BlogE= new ArrayList<BlogInfoEntity>();
      ArrayList<Long> ID =null;
        try {
            ID = fdao.query1(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (Long x:
                ID
             ) {
            System.out.println(x);

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
        System.out.println(BlogE.toString());
        List<BlogInfoEntity> beans = BlogE;
        System.out.println(beans);
        JSONArray array = JSONArray.fromObject(beans);
        System.out.println(array.toString());
        out.println(array);

    }
}
