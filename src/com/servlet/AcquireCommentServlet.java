package com.servlet;

import com.Dao.CommentDao;
import com.Dao.UserInfoDao;
import com.entity.CommentsEntity;
import com.entity.ShowCommentsEntity;
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
@WebServlet("/AcquireCommentServlet")
public class AcquireCommentServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("调用评论数据！");
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
//        HttpSession session = req.getSession();
        PrintWriter out = resp.getWriter();
        Long bid = Long.valueOf(req.getParameter("bid"));
        System.out.println("博客id："+bid);
        CommentDao commentDao = new CommentDao();
        ArrayList<CommentsEntity> commlist = null;
        ArrayList<ShowCommentsEntity> Scommlist = new ArrayList<>();
        try {
            commlist=commentDao.query1(bid);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("获取评论成功！");
//        System.out.println(commlist.toString());
//        Long uid = null;
//        UserInfoEntity userinf = null;
        UserInfoDao udao = new UserInfoDao();
        for (CommentsEntity x:commlist) {
            System.out.println("评论者id："+x.getCuid());
            UserInfoEntity u = new UserInfoEntity();
            u.setUid(x.getCuid());
            try {
                u = (UserInfoEntity)udao.query(u);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("信息者id:"+u.getUid());
            ShowCommentsEntity comms = new ShowCommentsEntity(x.getCid(),x.getCfid(),x.getCuid(),u.getUname(),u.getUimage(),x.getCtext(),x.getCtime());
            Scommlist.add(comms);
            System.out.println("插入一条数据成功！   ");


        }

        List<ShowCommentsEntity> list = Scommlist;
        JSONArray array = JSONArray.fromObject(list);
        System.out.println(array.toString());
        out.print(array);




    }
}
