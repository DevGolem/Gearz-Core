package development.gearznetworking.com.Core.MySQL;

import development.gearznetworking.com.Core.Core;

import java.sql.*;

/**
 * Created by Ben on 5/22/2016.
 */
public class MySQL
{

    private Connection connection;

    private String host;
    private String port;
    private String database;
    private String username;
    private String password;

    public MySQL() {

        host = Core.getInstance().getConfig().getString("MySQL.Host");
        port = Core.getInstance().getConfig().getString("MySQL.Port");
        database = Core.getInstance().getConfig().getString("MySQL.Database");
        username = Core.getInstance().getConfig().getString("MySQL.Username");
        password = Core.getInstance().getConfig().getString("MySQL.Password");

        try {
            if (connection != null)
                return;

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + database, username, password);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public ResultSet getResultSet(String qry) throws SQLException
    {
        PreparedStatement statement = connection.prepareStatement(qry);
        return statement.executeQuery();
    }

    public void executeUpdate(String qry) throws SQLException
    {
        PreparedStatement statement = connection.prepareStatement(qry);
        statement.executeUpdate();
        statement.close();
    }
}


