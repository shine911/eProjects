package com.app.conf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
    private String databaseName = "sql";
    private String username = "sa";
    private String password = "Thiennhi1412";
    private String hostname = "jdbc:sqlserver://localhost;databaseName="+databaseName;

    private static ConnectionUtils obj = null;
    private ConnectionUtils(){

    }
    public static ConnectionUtils getInstance(){
        if(obj==null){
                obj = new ConnectionUtils();
        }
        return obj;
    }

    public Connection getConnection() throws ClassNotFoundException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(hostname,username,password);
            System.out.println("Connect database succeessfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
