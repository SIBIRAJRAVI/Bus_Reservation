package busResv;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat; 
import java.sql.SQLException;
public class Booking {
	String passengerName;
	int busNo;
	Date date;
	
	Booking(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of passenger: ");
		passengerName = scanner.next();
		System.out.println("Enter bus no: ");
		busNo = scanner.nextInt();
		System.out.println("Enter date dd-mm-yyyy");
		String dateInput = scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public boolean isAvailable()throws Exception {
		
		BusDataAccess busdata=new BusDataAccess();
		
		int capacity= busdata.getCapacity(busNo);
		
		BookingDataAccess bookData= new BookingDataAccess();
		
		int booked=bookData.getBookedCount(busNo,date);
		
		
		int booked = 0;
		for(Booking b:bookings) {
			if(b.busNo == busNo && b.date.equals(date)) {
				booked++;
			}
		}
		
		return booked<capacity?true:false;
		
	}
}