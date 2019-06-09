package com.Dao;

import com.entity.CommentsEntity;
import com.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CommentDao  implements CommonDao {
    @Override
    public boolean insertData(Object o) throws SQLException {
        CommentsEntity te = (CommentsEntity) o;
        Connection conn = DBUtil.getConnection();
        String sql = "insert into Comments values(?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1,te.getCid());
        pstmt.setLong(2,te.getCfid());
        pstmt.setLong(3,te.getCuid());
        pstmt.setString(4,te.getCtext());
        pstmt.setTimestamp(5,te.getCtime());
        if(pstmt.executeUpdate()>0)
        {
            conn.close();
            return true;
        }
        conn.close();
        return false;
    }

    @Override
    public boolean deleteData(Object o) throws SQLException {
        return false;
    }

    @Override
    public boolean updateData(Object o) throws SQLException {
        return false;
    }

    @Override
    public int queryDataNum(Object o) throws SQLException {
        return 0;
    }


    public Long Search(Object o)throws SQLException{
        Long f = (Long)o;
        Connection conn = DBUtil.getConnection();
        String sql = "select count(Cuid) from Comments where Cfid=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1,f);
        ResultSet rs = pstmt.executeQuery();
        Long x = 0l;
        if (rs.next())
        x=rs.getLong("count(Cuid)");

        conn.close();
        rs.close();
        pstmt.close();
        return x;

    }



    @Override
    public ArrayList query(Object o, int start, int length) throws SQLException {
        return null;
    }

    @Override
    public Object query(Object o) throws SQLException {
        return null;
    }
}
