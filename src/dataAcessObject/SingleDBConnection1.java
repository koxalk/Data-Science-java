package dataAcessObject;

import java.sql.*;

public class SingleDBConnection1 {

    private final String username;
    private final String password;
    private final String databaseName;
    private Connection connection;
    private static SingleDBConnection1 instance;

    private SingleDBConnection1(String username, String password, String dbname) {
        this.username = username;
        this.password = password;
        this.databaseName = dbname;
        this.initConnection();
    }

    private void initConnection() {
        String url = "jdbc:mysql://localhost/" + this.databaseName + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, this.username, this.password);
            System.out.println("Connection established!!!");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static SingleDBConnection1 getInstance(String username, String password, String dbname) {
        if (instance != null) {
            System.out.println("I am a singleton class and I can create only one object!!!");
            return instance;
        }
        instance = new SingleDBConnection1(username, password, dbname);
        return instance;
    }

    public Connection getConnection() {
        return this.connection;
    }
}
