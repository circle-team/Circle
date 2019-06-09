package com.Dao;

import com.entity.UsersEntity;
import com.util.DBUtil;

import java.net.ConnectException;
import java.sql.*;
import java.util.ArrayList;

public class UserEntityDao implements CommonDao {

    @Override
    public boolean insertData(Object o) throws SQLException {
        UsersEntity User = (UsersEntity)o;
        Connection coon = DBUtil.getConnection();
        String sql = "insert into Users values(?,?,?,?,?,?)";
        PreparedStatement pstmt = coon.prepareStatement(sql);
        pstmt.setLong(1,User.getUserid());
        pstmt.setString(2,User.getUpassword());
        pstmt.setString(3,User.getUquestion1());
        pstmt.setString(4,User.getuAnswer1());
        pstmt.setString(5,User.getuquestion2());
        pstmt.setString(6,User.getuAnswer2());

        System.out.println(User.getUquestion1());
    if(pstmt.executeUpdate()>0){
        coon.close();
        return true;
    }
    coon.close();
    return false;
    }

    @Override
    public boolean updateData(Object o) throws SQLException {
        UsersEntity User=(UsersEntity)o;
        Connection coon=DBUtil.getConnection();
        System.out.println("进入成功");
        String sql="update Users set Upassword=? where Userid=?";
        PreparedStatement pstmt = coon.prepareStatement(sql);
        pstmt.setString(1,User.getUpassword());
        pstmt.setLong(2,User.getUserid());
        if (pstmt.executeUpdate()>0)
        {
            System.out.println("测试更新成功！");
            coon.close();
            return true;
        }
        coon.close();

             return false;
    }
//    public Object searchData(Object o) throws SQLException{
////           UsersEntity User=(UsersEntity) o;
////           Connection coon = DBUtil.getConnection();
////           String sql="select * from Users where id=?";
////           PreparedStatement pstmt = coon.prepareStatement(sql);
////           pstmt.setLong(1,User.getUserid());
////           UsersEntity nUser = new UsersEntity();
////            nUser.setUserid(pstmt.executeQuery().getInt("id"));
////            nUser.setUpassword(pstmt.executeQuery().getString("password"));
////            nUser.setUquestion1(pstmt.executeQuery().getString("Uquestion1"));
////            nUser.setuAnswer1(pstmt.executeQuery().getString("Answer1"));
////        nUser.setuquestion2(pstmt.executeQuery().getString("UQuestion2"));
////        nUser.setuAnswer2(pstmt.executeQuery().getString("Answer2"));
////        return nUser;
//return o;
//
//    }

    public int Login(Object o) throws SQLException{
           UsersEntity User=new UsersEntity();
           UsersEntity nUser = (UsersEntity)o;
//           UserEntityDao UserDao = new UserEntityDao();
                   User=(UsersEntity) query(o);
   if(User==null)
   {
       return 0;
   }
      if (User.getUpassword().equals(nUser.getUpassword())) {
      return 1;

      }
      else
          return 2;

    }

    @Override
    public boolean deleteData(Object o) throws SQLException {
        UsersEntity User=(UsersEntity)o;
        Connection coon = DBUtil.getConnection();
        String sql="delete from Users where Userid = ?";
        PreparedStatement pstmt = coon.prepareStatement(sql);
        pstmt.setLong(1,User.getUserid());
        if (pstmt.executeUpdate()>0){
            coon.close();
            return true;
        }
        coon.close();
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
        UsersEntity User=(UsersEntity) o;
        Connection coon = DBUtil.getConnection();
        String sql="select * from Users where Userid=?";
        PreparedStatement pstmt = coon.prepareStatement(sql);
        pstmt.setLong(1,User.getUserid());
//        ResultSet rs = pstmt.executeQuery();
        UsersEntity nUser = null;
      ResultSet rs = pstmt.executeQuery();
        if(rs.next()) {
//            System.out.println("查找成功");
            nUser = new UsersEntity();
            nUser.setUserid(rs.getLong("Userid"));
            nUser.setUpassword(rs.getString("Upassword"));
            nUser.setUquestion1(rs.getString("Uquestion1"));
            nUser.setuAnswer1(rs.getString("UAnswer1"));
            nUser.setuquestion2(rs.getString("UQuestion2"));
            nUser.setuAnswer2(rs.getString("UAnswer2"));
        }
        coon.close();
        return nUser;

    }
}
