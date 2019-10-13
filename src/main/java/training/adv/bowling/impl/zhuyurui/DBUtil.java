package training.adv.bowling.impl.zhuyurui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	//private static final String url = "jdbc:h2:file:C:/Users/Alex/data/sample/App";
	private static final String url = "jdbc:h2:mem:~/App";
	private static final String user = "sa";
	private static final String pwd = "";
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("org.h2.Driver");
			connection = DriverManager.getConnection(url, user, pwd);
			connection.setAutoCommit(false);


		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return connection;
	}






}