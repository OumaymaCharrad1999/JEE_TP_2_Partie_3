package metier;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnection {
    private static Connection connection;
    static {
	try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB_CAT", "root", "1329566");
	} 
        catch (Exception e) {
            e.printStackTrace();
	}
    }
    public static Connection getConnection() {
	return connection;
    }
}