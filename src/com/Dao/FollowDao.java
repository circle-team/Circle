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
        Connection conn = DBUtil.getConnection();
        Integer id = (Integer)o;

        return 0;


    }
    public int queryDataNum1(Object o,Object x) throws SQLException{




        Connection conn = DBUtil.getConnection();

        Long id = (long)o;
        Long choose = (long)x;

        String sql = null;
        if(choose==(long)1) {

             sql = "select count(*) from Follow where Fuid=?";
        }
        else{

            sql = "select count(*) from Follow where Fhuid=?";
        }
        PreparedStatement pstmt =conn.prepareStatement(sql);

        pstmt.setLong(1,id);

        ResultSet rs = pstmt.executeQuery();

//        System.out.println(id);

        int num = 0;

        if (rs.next())
        {
             num = rs.getInt(1);
        }

        conn.close();
           return num;

    }


    @Override
    public ArrayList query(Object o, int start, int length) throws SQLException {
        return null;
    }

    public ArrayList<Long> query1(Object o) throws SQLException{
        Long uid = (Long)o;
        ArrayList<Long> idlist = new ArrayList<Long>();
        Connection conn = DBUtil.getConnection();
        String sql = "select Fhuid from follow where Fuid=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1,uid);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next())
        {
            uid=rs.getLong("Fhuid");
            idlist.add(uid);

        }

        return idlist;
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
