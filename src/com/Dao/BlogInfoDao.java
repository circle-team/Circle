package com.Dao;

import com.util.DBUtil;
import com.entity.BlogInfoEntity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BlogInfoDao implements CommonDao {

    @Override
    public boolean insertData(Object o) throws SQLException {
        BlogInfoEntity BlogInfo = (BlogInfoEntity) o;
        Connection conn = DBUtil.getConnection();
        String sql = "insert into BlogInfo (buid, btext, bdate, bimage,btitle) values (?,?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1, BlogInfo.getBuid());
        pstmt.setString(2, BlogInfo.getBtext());
        pstmt.setTimestamp(3, BlogInfo.getBdate());
        pstmt.setString(4, BlogInfo.getBimage());
        pstmt.setString(5, BlogInfo.getBtitle());
        System.out.println("插入成功！");
        if(pstmt.executeUpdate()>0){
            pstmt.close();
            return true;
        }
        pstmt.close();
        return false;
    }


//  @Override
//    public Object searchData(Object o) throws SQLException{
//
//
//      return o;
//
//
//
//
//}

    @Override

    public boolean deleteData(Object o) throws SQLException {
        BlogInfoEntity BlogInfo = (BlogInfoEntity) o;

        Connection conn = DBUtil.getConnection();

        String sql = "DELETE FROM BlogInfo WHERE Bid = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1, BlogInfo.getBid());

        pstmt.executeUpdate();
        pstmt.close();
        return true;
    }

    @Override
    public boolean updateData(Object o) throws SQLException {
                   return true;
    }

    @Override
    public int queryDataNum(Object o) throws SQLException {
        Connection conn = DBUtil.getConnection();
        BlogInfoEntity BlogInfo = (BlogInfoEntity) o;

        String sql = "select count(*) from BlogInfo WHERE Buid = ?;";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1, BlogInfo.getBid());
        ResultSet rs = pstmt.executeQuery();

        int num;
        if (rs.next()) num = rs.getInt("count(*)");
        else num = 0;

        rs.close();
        pstmt.close();

        return num;
    }

    @Override
    public ArrayList<BlogInfoEntity> query(Object o,int start, int length) throws SQLException {
        Connection conn = DBUtil.getConnection();
        BlogInfoEntity BlogInfo = (BlogInfoEntity) o;

        String sql = "select * from BlogInfo where Buid = ?  limit ?, ?;";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1, BlogInfo.getBuid());
        pstmt.setInt(2, start - 1);
        pstmt.setInt(3, length);
        ResultSet rs = pstmt.executeQuery();

        ArrayList<BlogInfoEntity> list = new ArrayList<>();
        BlogInfoEntity newBlogInfo;

        while (rs.next()) {
            newBlogInfo = new BlogInfoEntity(rs.getLong(1), rs.getLong(2), rs.getString(3)
                    , rs.getTimestamp(4), rs.getString(5), rs.getString(6));
            list.add(newBlogInfo);
        }

        rs.close();
        pstmt.close();

        return list;
    }

    @Override
    public Object query(Object o) throws SQLException {
        BlogInfoEntity BlogInfo = (BlogInfoEntity) o;

        Connection conn = DBUtil.getConnection();

        String sql = "SELECT * FROM BlogInfo WHERE Bid = ?";

        PreparedStatement pstmt = conn.prepareStatement(sql);
       pstmt.setLong(1, BlogInfo.getBid());
        ResultSet rs = pstmt.executeQuery();

        BlogInfoEntity newBlogInfo = null;
        while (rs.next()) {
            newBlogInfo = new BlogInfoEntity(rs.getLong(1), rs.getLong(2), rs.getString(3)
                    , rs.getTimestamp(4), rs.getString(5), rs.getString(6));
        }

        if (newBlogInfo == null)
            newBlogInfo = new BlogInfoEntity();
        return newBlogInfo;
    }
}
