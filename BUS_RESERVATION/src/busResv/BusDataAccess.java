package busResv;
import java.sql.*;

public class BusDataAccess {
	public  void DisplayBusInfo()throws SQLException {
		Connection con=db_connection.getConnection();
	
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from bus");
		
		while(rs.next()) {
			System.out.print("Bus No : "+ rs.getInt(1)+"\t");
			switch(rs.getInt(2)) {
			case 1:
				System.out.print(" AC : Yes"+"\t");
				break;
			case 0:
				System.out.print("AC : No"+"\t");
			
			default:
				System.out.print("invalid");
				
			
			}
			
			System.out.print("Capacity is : "+rs.getInt(3));
		}
		
		
		
		
		
	}
	public int getCapacity(int id)throws Exception{
		Connection con=db_connection.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select capacity from bus where id="+id);
		rs.next();
		return rs.getInt(1);
		
	}
}

	
