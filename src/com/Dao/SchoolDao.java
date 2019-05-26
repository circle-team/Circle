package com.Dao;

import com.entity.SchoolEntity;
import com.entity.UserInfoEntity;
import com.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SchoolDao implements CommonDao {

    @Override
    public boolean insertData(Object o) throws SQLException {
        SchoolEntity sUser = (SchoolEntity)o;
        Connection conn = DBUtil.getConnection();
        String sql = "insert into School values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1,sUser.getSuid());
        pstmt.setString(2,sUser.getSpschool());
        pstmt.setLong(3,sUser.getSpgrade());
        pstmt.setString(4,sUser.getSmschool());
        pstmt.setLong(5,sUser.getSmgrade());
        pstmt.setString(6,sUser.getShschool());
        pstmt.setLong(7,sUser.getShgrade());
        pstmt.setString(8,sUser.getSuschool());
        pstmt.setLong(9,sUser.getSugrade());
        if (pstmt.executeUpdate()>0)
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
        SchoolEntity sUser = (SchoolEntity)o;
        Connection conn = DBUtil.getConnection();
        String sql = "update School Spschool=?,Spgrade=?,Smschool=?,Smgrade=?,Shschool=?,Shgrade=?,Suschool=?,Sugrade=? where Suid=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,sUser.getSpschool());
        pstmt.setLong(2,sUser.getSpgrade());
        pstmt.setString(3,sUser.getSmschool());
        pstmt.setLong(4,sUser.getSmgrade());
        pstmt.setString(5,sUser.getShschool());
        pstmt.setLong(6,sUser.getShgrade());
        pstmt.setString(7,sUser.getSuschool());
        pstmt.setLong(8,sUser.getSugrade());
        pstmt.setLong(9,sUser.getSuid());
        if (pstmt.executeUpdate()>0)
        {
            conn.close();
            return true;
        }
        conn.close();
        return false;
    }

    @Override
    public int queryDataNum(Object o) throws SQLException {
        return 0;
    }

    @Override
    public ArrayList query(Object o, int start, int length) throws SQLException {
        ArrayList<UserInfoEntity> se = new ArrayList<UserInfoEntity>();
        SchoolEntity sUser = (SchoolEntity) o;
        Connection conn = DBUtil.getConnection();
        String sql=null;
        switch (start) {
            case 1: {
                sql = "select Suid from School where Spschool=? and Spgrade=?";
                  SchoolEntity a= new SchoolEntity();

                  conn.prepareStatement(sql).setString(1,sUser.getSpschool());
                conn.prepareStatement(sql).setLong(2,sUser.getSpgrade());

                break;
                  }

            case 2:{
                sql = "select Suid from School where Smschool=? and Smgrade=?";
                SchoolEntity a= new SchoolEntity();
                PreparedStatement pstmt = conn.prepareStatement(sql);
//                pstmt.setString(1,sUser.getSmschool());
//                pstmt.setLong(2,sUser.getSmgrade());



                break;

            }
            case 3:{
                 sql = "select Suid from School where Shschool=? and Shgrade=?";
                SchoolEntity a= new SchoolEntity();
                PreparedStatement pstmt = conn.prepareStatement(sql);
//                pstmt.setString(1,sUser.getShschool());
//                pstmt.setLong(2,sUser.getShgrade());
//
                break;

            }
            case 4:{
               sql = "select Suid from School where Suschool=? and Sugrade=?";
                SchoolEntity a= new SchoolEntity();
                PreparedStatement pstmt = conn.prepareStatement(sql);
//                pstmt.setString(1,sUser.getSuschool());
//                pstmt.setLong(2,sUser.getSugrade());

                break;
            }

        }
        while(conn.prepareStatement(sql).executeQuery().next()) {
            Long x = conn.prepareStatement(sql).executeQuery().getLong("Suid");
            UserInfoDao uidao = new UserInfoDao();
            UserInfoEntity u = new UserInfoEntity(x);
            UserInfoEntity t= new UserInfoEntity();
            t=(UserInfoEntity) uidao.query(u);
            if(t==null)
            {
                System.out.println("该用户信息不存在");
            }
            else
            {
                se.add(t);
            }

        }

        return se;
    }

    @Override
    public Object query(Object o) throws SQLException {
        return null;
    }
}
