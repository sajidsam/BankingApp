package bankingsystemswing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnector {

	private static final String URL = "jdbc:mysql://localhost:3306/banksystem";
	private static final String USER = "root";
	private static final String PASSWORD = "";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
}
