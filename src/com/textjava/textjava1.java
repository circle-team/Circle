package com.textjava;


import com.Dao.BlogInfoDao;
import com.Dao.UserEntityDao;
import com.entity.BlogInfoEntity;
import com.entity.UsersEntity;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

public class textjava1 {
    public static void main(String[] args) throws SQLException {
        Timestamp a= new Timestamp(new Date().getTime());
//        a.getTime();
        UsersEntity b = new UsersEntity((long) 8,"q","1" ,"q","q","q");
        UserEntityDao c = new UserEntityDao();
       if (c.insertData(b))
           System.out.println("qq");
//        c.deleteData(b);


    }
}
