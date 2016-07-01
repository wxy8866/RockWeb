package com.wxy8866.fromzero.beans;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by XingYi Wei on 2016-04-11.
 */
public class ORMDBUtil
{
    public Connection getConnection() throws Exception
    {
        Connection connection = null;

        Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance();

        String url = "jdbc:db2://XINGYIWEI-IBM:50000/dtcntrl:deferPrepares=false;fullyMaterializeInputStreams=true;fullyMaterializeLobData=true;progresssiveLocators=2;progressiveStreaming=2;currentSchema=DTCNTRL;";
        String username = "dtuser";
        String password = "Welcome1";

        connection = DriverManager.getConnection(url, username, password);

        return connection;

    }

    public ArrayList select(String sql) throws Exception
    {
        ArrayList<User> resultArray = new ArrayList<User>();

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        connection = getConnection();
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sql);

        while (resultSet.next())
        {
            User u = new User();
            u.setUserID(resultSet.getLong("USERID"));
            u.setScreenname(resultSet.getString("SCREENNAME"));

            resultArray.add(u);
        }

        if (resultSet != null) resultSet.close();
        if (statement != null) statement.close();
        if (connection != null) connection.close();

        return resultArray;
    }

    public void insert(String sql) throws Exception
    {
        //TODO
    }

    public void update(String sql) throws Exception
    {
        //TODO
    }

    public void delete(String sql) throws Exception
    {
        //TODO
    }


}
