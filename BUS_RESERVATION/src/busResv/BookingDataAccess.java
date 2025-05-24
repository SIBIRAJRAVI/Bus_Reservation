package busResv;
import java.util.Date;
import java.sql.*;

public class BookingDataAccess {
	
	public int getBookedCount(int id,Date date)throws Exception {
		
		String username="root";
		String password="password";
		String url="jdbc:mysql://localhost:3306/bus_ticket_reservation";
		
		Connection con=db_connection.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select count(passanger_name)where bus_no="+id+"and traveling_date="+date);
		
		
		return rs.getInt(1);
		
	}
	

}
