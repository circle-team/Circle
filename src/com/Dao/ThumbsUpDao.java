package com.Dao;

import com.entity.ThumbsUpEntity;
import com.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ThumbsUpDao implements CommonDao{
    @Override
    public boolean insertData(Object o) throws SQLException {
        ThumbsUpEntity te = (ThumbsUpEntity)o;
        Connection conn = DBUtil.getConnection();
        String sql = "insert into Thumbs_up values(?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1,te.getThbid());
        pstmt.setLong(2,te.getTuid());
        pstmt.setTimestamp(3,te.getTdate());
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
        ThumbsUpEntity te = (ThumbsUpEntity)o;
        Connection conn = DBUtil.getConnection();
        String sql = "delete from Thumbs_up where Thbid=? and Tuid=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1,te.getThbid());
        pstmt.setLong(2,te.getTuid());
        if(pstmt.executeUpdate()>0)
        {
            conn.close();
            return true;
        }
        conn.close();
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

    @Override
    public ArrayList query(Object o, int start, int length) throws SQLException {
        return null;
    }

    public Long Search(Object o)throws SQLException{
        ThumbsUpEntity fe = (ThumbsUpEntity) o;
        Connection conn = DBUtil.getConnection();
        String sql = "select count(Tuid) where Thbid=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1,fe.getThbid());
        ResultSet rs = pstmt.executeQuery();
        Long x;
        x=rs.getLong("count(Tuid)");

        return x;

    }

    @Override
    public Object query(Object o) throws SQLException {
        ThumbsUpEntity fe = (ThumbsUpEntity) o;
        Connection conn = DBUtil.getConnection();
        String sql = "select * from follow where Thbid=? and Tuid=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        ThumbsUpEntity f = null;
        if(rs.next())
        {
            f = new ThumbsUpEntity(rs.getLong("Thbid"),rs.getLong(" Tuid"),
                    rs.getTimestamp("datetime"));
        }

        return f;
    }
}