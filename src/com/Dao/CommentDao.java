package com.Dao;

import java.sql.SQLException;
import java.util.ArrayList;

public class CommentDao  implements CommonDao {
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
        return null;
    }
}
