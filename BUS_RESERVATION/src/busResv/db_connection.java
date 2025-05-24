package busResv;
import java.sql.*;
public class db_connection {
	public static String username="root";
	 public static String password="root@123";
	public static String url="jdbc:mysql://localhost:3306/bus_ticket_reservation";
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,username,password);
		
		
	}

}
