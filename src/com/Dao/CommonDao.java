package com.Dao;

import java.sql.SQLException;
import java.util.ArrayList;

    /**
     * 本文件是一个公共的DAO接口，相同Dao的调用关系集合。
     * 在此之前已经完成Login、floorInfo、authInfo，如果有时间，就改造他们的函数。
     * 1.增 添加单条数据
     * 2.删 根据XXX删单条数据
     * 3.改 根据XXX改单条数据
     * 4.查 查表长度
     * 5.查 根据XXX查单条数据 ---> 在service层抽出查重函数
     * 6.查 查所有数据 ---> 根据数据起始位置和长度返回ArrayList
     */
    public interface CommonDao {

        boolean insertData(Object o) throws SQLException;

        boolean deleteData(Object o) throws SQLException;

        boolean updateData(Object o) throws SQLException;

        Object searchData(Object o) throws SQLException;

        int queryDataNum(Object o) throws SQLException;

        ArrayList query(Object o,int start, int length) throws SQLException;

        Object query(Object o) throws SQLException;
    }

