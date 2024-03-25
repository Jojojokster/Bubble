package com.jojo.connection;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseConnection {

    private static DatabaseConnection instance;
    private Connection connection;

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    private DatabaseConnection() {

    }

    public void connectToDatabase() throws SQLException {
        String server = "bubbles.database.windows.net";
        String port = "1433";
        String database = "Jojo";
        String userName = "Jojo@bubbles";
        String password = "Joseph 78";
        connection = java.sql.DriverManager.getConnection("jdbc:sqlserver://" + server + ":" + port + ";database=" + database + ";user=" + userName + ";password=" + password + ";encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
