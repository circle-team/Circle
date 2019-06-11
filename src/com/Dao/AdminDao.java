package com.Dao;

import com.entity.AdminEntity;
import com.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AdminDao implements CommonDao {

    @Override
    public boolean insertData(Object o) throws SQLException {
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

    @Override
    public ArrayList query(Object o, int start, int length) throws SQLException {
        return null;
    }

    @Override
    public Object query(Object o) throws SQLException {
        AdminEntity admin = (AdminEntity)o;
        Connection conn = DBUtil.getConnection();
        String sql = "select * from Admin where id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1,admin.getId());
        ResultSet rs = pstmt.executeQuery();
        AdminEntity admin1 = null;
        if (rs.next())
        {
            admin = new AdminEntity(rs.getLong(1),rs.getString(2));

        }
            conn.close();
        pstmt.close();
        rs.close();
        return admin;
    }
}
