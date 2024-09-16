package vn.iotstar.configs;
import java.sql.Connection;


public class DBConnectSQL {
	private final String serverName = "DESKTOP-T2CV8JR";


	 private final String dbName = "ltwebst2";


	 private final String portNumber = "1433";


	 private final String userID = "sa";


	 private final String password = "1234567@a$";



	 public Connection getConnection() throws Exception {



	 String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;


	 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");


	 return DriverManager.getConnection(url, userID, password);



	 }

}
