package com.Dao;

import com.util.DBUtil;
import com.entity.BlogInfoEntity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class BlogInfoDao implements CommonDao {

    @Override
    public void insertData(Object o) throws SQLException {
        BlogInfoEntity BlogInfo = (BlogInfoEntity) o;
        Connection conn = DBUtil.getConnection();
        String sql = "insert into BlogInfo (bid, buid, btext, bdate, bimage,btitle) values (?,?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1, BlogInfo.getBid());
        pstmt.setLong(2, BlogInfo.getBuid());
        pstmt.setString(3, BlogInfo.getBtext());
        pstmt.setTimestamp(4, BlogInfo.getBdate());
        pstmt.setString(5, BlogInfo.getBimage());
        pstmt.setString(5, BlogInfo.getBtitle());

        pstmt.executeUpdate();
        pstmt.close();
    }

    @Override
    public void deleteData(Object o) throws SQLException {

    }

    @Override
    public void updateData(Object o) throws SQLException {

    }

    @Override
    public int queryDataNum() throws SQLException {
        return 0;
    }

    @Override
    public ArrayList query(int start, int length) throws SQLException {
        return null;
    }

    @Override
    public Object query(Object o) throws SQLException {
        return null;
    }
}