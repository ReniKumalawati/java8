package Stream.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conn {
    private static final String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/jp";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "mysql";
    private java.sql.Connection connection;
    private Properties properties;

    public java.sql.Connection connect() {
        if (connection == null) {
            try {
                Class.forName(DATABASE_DRIVER);
                connection = DriverManager.getConnection(DATABASE_URL, getProperties());
            } catch (ClassNotFoundException | SQLException e) {
                // Java 7+
                e.printStackTrace();
            }
        }
        return connection;
    }

    private Properties getProperties() {
        if (properties == null) {
            properties = new Properties();
            properties.setProperty("user", USERNAME);
            properties.setProperty("password", PASSWORD);
        }
        return properties;
    }
}
