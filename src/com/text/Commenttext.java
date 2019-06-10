package com.text;

import com.Dao.CommentDao;
import com.Dao.UserInfoDao;
import com.entity.CommentsEntity;
import com.entity.ShowCommentsEntity;
import com.entity.UserInfoEntity;
import net.sf.json.JSONArray;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Commenttext {
    public static void main(String[] args) {

        Long bid=2l;
        CommentDao commentDao = new CommentDao();
        ArrayList<CommentsEntity> commlist = null;
        ArrayList<ShowCommentsEntity> Scommlist = new ArrayList<>();
        try {
            commlist=commentDao.query1(bid);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(commlist);

        Long uid = null;
        UserInfoEntity userinf = new UserInfoEntity();;
        UserInfoDao udao =new UserInfoDao();
        for (CommentsEntity x:commlist) {
         UserInfoEntity u = new UserInfoEntity();
            userinf.setUid(x.getCuid());
            System.out.println("评论者id："+x.getCuid());
            try {
                u = (UserInfoEntity)udao.query(userinf);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            ShowCommentsEntity comms = new ShowCommentsEntity(x.getCid(),x.getCfid(),x.getCuid(),u.getUname(),u.getUimage(),x.getCtext(),x.getCtime());
            Scommlist.add(comms);

        }

        List<ShowCommentsEntity> list = Scommlist;
        JSONArray array = JSONArray.fromObject(list);
        System.out.println(array.toString());
//        out.print(array);



    }
}
