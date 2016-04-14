package com.wxy8866.fromzero.beans;
import java.sql.*;
import com.ibm.db2.jcc.DB2Driver;

/**
 * Created by XingYi Wei on 2016-04-11.
 */
public class DBUtil
{
    public  Connection getConnection() throws Exception
    {
        Connection connection = null;

        Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance();

        String url = "jdbc:db2://XINGYIWEI-IBM:50000/dtcntrl:deferPrepares=false;fullyMaterializeInputStreams=true;fullyMaterializeLobData=true;progresssiveLocators=2;progressiveStreaming=2;currentSchema=DTCNTRL;";
        String username = "dtuser";
        String password = "Welcome1";

        connection = DriverManager.getConnection(url, username, password);

        return  connection;

    }

    public ResultSet select(String sql) throws Exception
    {
        Connection connection = null;
        Statement statement = null;
        ResultSet result = null;

        try
        {
            connection = getConnection();
            statement = connection.createStatement();
            result = statement.executeQuery(sql);
            return result;
        }
        catch (SQLException sqle)
        {
            throw new SQLException("select data exception: " + sqle.getMessage());
        }
        catch (Exception e)
        {
            throw new Exception("System exception: " + e.getMessage());
        }
    }

    public  void insert(String sql) throws Exception
    {
        Connection connection = null;
        PreparedStatement ps = null;

        try
        {
            connection = getConnection();
            ps = connection.prepareStatement(sql);
            ps.executeUpdate();
        }
        catch ( SQLException sqle)
        {
            throw new Exception("insert a data exception: " + sqle.getMessage());
        }
        finally
        {

                if (ps != null)
                {
                    ps.close();
                }
                if (connection != null)
                {
                    connection.close();
                }

        }
    }

    public void update(String sql) throws Exception
    {
        Connection connection = null;
        PreparedStatement ps = null;

            connection = getConnection();
            ps = connection.prepareStatement(sql);
            ps.executeUpdate();

        if (ps != null) ps.close();;
        if (connection != null) connection.close();
    }

    public  void delete(String sql) throws  Exception
    {
        Connection connection = null;
        PreparedStatement ps = null;

        connection = getConnection();
        ps = connection.prepareStatement(sql);
        ps.executeUpdate();

        if (ps != null) ps.close();;
        if (connection != null) connection.close();
    }





}
