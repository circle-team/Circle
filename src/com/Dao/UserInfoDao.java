package com.Dao;

import com.entity.UserInfoEntity;
import com.entity.UsersEntity;
import com.servlet.UserInfoServlet;
import com.util.DBUtil;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserInfoDao implements CommonDao{

    @Override
    public boolean insertData(Object o) throws SQLException {
        UserInfoEntity Useri = (UserInfoEntity)o;
        Connection conn = DBUtil.getConnection();
        String sql = "insert into UserInfo value(?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1,Useri.getUid());
        pstmt.setString(2,Useri.getUgender());
        pstmt.setInt(3,Useri.getUage());
        pstmt.setString(4,Useri.getUcontact());
        pstmt.setString(5,Useri.getUname());
        pstmt.setString(6,Useri.getUaddress());
        pstmt.setString(7,Useri.getUemail());
        pstmt.setString(8,Useri.getUidentityNumber());
        pstmt.setString(9,Useri.getUimage());
        pstmt.setString(10,Useri.getUhobby());
        pstmt.setString(11,Useri.getUschool());
        pstmt.setString(12,Useri.getUgrade());
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
        UserInfoEntity Useri = (UserInfoEntity)o;
        Connection conn = DBUtil.getConnection();
        String sql = "update UserInfo set Ugender=?,Uage=?,Ucontact=?,Uname=?,Uaddress=?,Uemail=?,UidentityNumber=?,Uimage=?,Uhobby=?,Uschool=?,Ugrade=? where Uid=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,Useri.getUgender());
        pstmt.setInt(2,Useri.getUage());
        pstmt.setString(3,Useri.getUcontact());
        pstmt.setString(4,Useri.getUname());
        pstmt.setString(5,Useri.getUaddress());
        pstmt.setString(6,Useri.getUemail());
        pstmt.setString(7,Useri.getUidentityNumber());
        pstmt.setString(8,Useri.getUimage());
        pstmt.setString(9,Useri.getUhobby());
        pstmt.setString(10,Useri.getUschool());
        pstmt.setString(11,Useri.getUgrade());
        pstmt.setLong(12,Useri.getUid());

        if(pstmt.executeUpdate()>0){
            conn.close();
            return true;

        }
        conn.close();
        return false;
    }

//    @Override
//    public Object searchData(Object o) throws SQLException {
//        return null;
//    }

    @Override
    public int queryDataNum(Object o) throws SQLException {
        return 0;
    }

    @Override
    public ArrayList<UserInfoEntity> query(Object o, int start, int length) throws SQLException {
        ArrayList<UserInfoEntity> se = new ArrayList<UserInfoEntity>();
        UserInfoEntity sUser = (UserInfoEntity) o;
        Connection conn = DBUtil.getConnection();
        PreparedStatement pstmt=null;
        String sql=null;
        sql = "select Uid from School where Uschool=? and Ugrade=?";
                         pstmt=conn.prepareStatement(sql);
                pstmt.setString(1,sUser.getUschool());
                pstmt.setString(2,sUser.getUgrade());
        ResultSet rs = pstmt.executeQuery();

        while(rs.next()) {
            Long x = rs.getLong("Suid");
            UserInfoDao uidao = new UserInfoDao();
            UserInfoEntity u = new UserInfoEntity(x);
            UserInfoEntity t= null;
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
        UserInfoEntity Useri = (UserInfoEntity)o;
        Connection conn = DBUtil.getConnection();
        String sql = "select * from UserInfo where Uid = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1,Useri.getUid());
        UserInfoEntity Useri1= null;
        ResultSet result = pstmt.executeQuery();
        if (result.next()) {
            Useri1 = new UserInfoEntity();
            Useri1.setUid(result.getLong("Uid"));
            Useri1.setUgender(result.getString("Ugender"));
            Useri.setUage(result.getInt("Uage"));
            Useri1.setUcontact(result.getString("Ucontact"));
            Useri1.setUname(result.getString("Uname"));
            Useri1.setUaddress(result.getString("Uaddress"));
            Useri1.setUemail(result.getString("Uemail"));
            Useri1.setUidentityNumber(result.getString("UidentityNumber"));
            Useri1.setUimage(result.getString("Uimage"));
            Useri1.setUhobby(result.getString("Uhobby"));
            Useri1.setUschool(result.getString("Uschool"));
            Useri1.setUgrade(result.getString("Ugrade"));
        }
        conn.close();
        result.close();
        pstmt.close();
        return Useri1;
    }
}
