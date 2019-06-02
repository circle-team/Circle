package com.Dao;

import com.entity.FollowEntity;
import com.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FollowDao implements CommonDao {
    @Override
    public boolean insertData(Object o) throws SQLException {
        FollowEntity fe = (FollowEntity)o;
        Connection conn = DBUtil.getConnection();
        String sql = "insert into Follow values(?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1,fe.getFhuid());
        pstmt.setLong(2,fe.getFuid());
        pstmt.setTimestamp(3,fe.getFtime());
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
        FollowEntity fe = (FollowEntity)o;
        Connection conn = DBUtil.getConnection();
        String sql = "delete from Follow where Fhuid=? and Fuid=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1,fe.getFhuid());
        pstmt.setLong(2,fe.getFuid());
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

    @Override
    public Object query(Object o) throws SQLException {
        FollowEntity fe = (FollowEntity)o;
        Connection conn = DBUtil.getConnection();
        String sql = "select * from follow where fhuid=? and fuid=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        FollowEntity f = null;
        if(rs.next())
        {
            f = new FollowEntity(rs.getLong("fhuid"),rs.getLong("fuid"),
                    rs.getTimestamp("datetime"));
        }

        return f;
    }
}
