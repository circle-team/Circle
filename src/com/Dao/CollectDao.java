package com.Dao;

import com.entity.CollectEntity;
import com.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CollectDao implements CommonDao {
    @Override
    public boolean insertData(Object o) throws SQLException {
        CollectEntity ce = (CollectEntity)o;
        Connection conn = DBUtil.getConnection();
        String sql = "insert into Collect values(?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1,ce.getCbid());
        pstmt.setLong(2,ce.getCuid());
        pstmt.setTimestamp(3,ce.getCtime());
        if (pstmt.executeUpdate()>0)
        {
            conn.close();
            return true;

        }
        else
            conn.close();
        return false;
    }

    @Override
    public boolean deleteData(Object o) throws SQLException {
        CollectEntity fe = (CollectEntity) o;
        Connection conn = DBUtil.getConnection();
        String sql = "delete from Follow where Cbid=? and Cuid=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1,fe.getCbid());
        pstmt.setLong(2,fe.getCuid());
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
        CollectEntity ce = (CollectEntity)o;
        Connection conn = DBUtil.getConnection();
        String sql = "select * from Collect where Cbid=? and Cuid=? ";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1,ce.getCbid());
        pstmt.setLong(2,ce.getCuid());
         CollectEntity c = null;
        ResultSet rs = pstmt.executeQuery();
         if(rs.next())
         {
             c = new CollectEntity(rs.getLong("Cbid"),rs.getLong("cuid"),
                     rs.getTimestamp("datetime"));
         }


        return c;
    }
}
