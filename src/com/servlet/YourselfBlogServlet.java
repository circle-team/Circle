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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/YourselfBlogServlet")
public class YourselfBlogServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        resp.setContentType("application/x-json;charset=utf-8");
//        System.out.println("success我！");
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession();
        UserInfoEntity userinf = (UserInfoEntity)session.getAttribute("userinf");
        ArrayList<BlogInfoEntity> bloglist = new ArrayList<>();
        BlogInfoDao Bdao = new BlogInfoDao();
        try {
            bloglist=Bdao.query1(userinf.getUid(),bloglist);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        UserInfoDao Userdao = new UserInfoDao();
            ArrayList<ShowblogEntity> Sblog = new ArrayList<>();
        Long ifthumb=null;
        for (BlogInfoEntity x:bloglist) {
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
                ThumbsUpEntity T = new ThumbsUpEntity(x.getBid(),userinf.getUid(),null);
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
    }
}
