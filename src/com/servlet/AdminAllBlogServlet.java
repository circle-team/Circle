package com.servlet;

import com.Dao.BlogInfoDao;
import com.Dao.CommentDao;
import com.Dao.ThumbsUpDao;
import com.Dao.UserInfoDao;
import com.entity.BlogInfoEntity;
import com.entity.ShowblogEntity;
import com.entity.ThumbsUpEntity;
import com.entity.UserInfoEntity;
import net.sf.json.JSONArray;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AdminAllBlogServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        resp.setContentType("application/x-json;charset=utf-8");
        PrintWriter out = resp.getWriter();
        ArrayList<BlogInfoEntity> Blist = new ArrayList<>();
        BlogInfoDao Bdao = new BlogInfoDao();
        try {
            Blist= Bdao.queryall();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Comparator<BlogInfoEntity> comparator = new Comparator<BlogInfoEntity>() {
            @Override
            public int compare(BlogInfoEntity o1, BlogInfoEntity o2) {
                Long sqlLastTime = o2.getBdate().getTime();
                long sqlLastTime2 = o1.getBdate().getTime();

                return (int) (sqlLastTime - sqlLastTime2);

            }
        };
        Collections.sort(Blist, comparator);

        System.out.println(Blist.toString());
        UserInfoDao Userdao = new UserInfoDao();
        ArrayList<ShowblogEntity> Sblog = new ArrayList<>();


        Long ifthumb = null;

        for (BlogInfoEntity x : Blist) {
            try {
                UserInfoEntity User = new UserInfoEntity (x.getBuid());
                User = (UserInfoEntity) Userdao.query(User);
                System.out.println(x.getBuid());
                ThumbsUpDao thumbs = new ThumbsUpDao();
                CommentDao comments = new CommentDao();
                Long thumbnum = (Long) thumbs.Search(x.getBid());
                System.out.println("thumbs"+thumbnum);
                Long comment = (Long) comments.Search(x.getBid());
                System.out.println("comment"+comment);
                ThumbsUpEntity T = new ThumbsUpEntity(x.getBid(),User.getUid(),null);
                if (thumbs.query(T)==null)
                {
                    ifthumb=0l;
                }
                else {
                    ifthumb=1l;
                }
//                System.out.println("Bid:"+x.getBid());
//                System.out.println("Buid:"+x.getBuid());
//                System.out.println(User.getUid());
//                System.out.println(User.getUname());
//                System.out.println(User.getUimage());
//                System.out.println(x.getBtext());
//                System.out.println(x.getBdate());
//                System.out.println(x.getBtitle());
//                System.out.println(thumbnum);
//                System.out.println(comment);
                //ifthumb==0说明没有关注界面是灰心==1说明有关注界面是红心
                ShowblogEntity a = new ShowblogEntity(x.getBid(),User.getUid(),User.getUname(),x.getBimage(),x.getBtext(),x.getBdate(),x.getBtitle(),thumbnum,comment,User.getUimage(),ifthumb);
                Sblog.add(a);
//                System.out.println(a.getDate()+a.getText()+a.getCommentnumber());
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }


        List<ShowblogEntity> beans = Sblog;
        System.out.println(beans);
        JSONArray array = JSONArray.fromObject(beans);
        System.out.println(array.toString());
        out.print(array);
//        resp.getWriter().println(array.toString());

    }
}
