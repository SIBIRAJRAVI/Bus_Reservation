package busResv;
import java.sql.*;
import java.util.Scanner; //nested package/ hierarchical package
import java.util.ArrayList;

public class BusDemo {

	public static void main(String[] args) throws SQLException {
		
//	
//		ArrayList<Bus> buses = new ArrayList<Bus>();
//		ArrayList<Booking> bookings = new ArrayList<Booking>();
//		
//		buses.add(new Bus(1,true,2));
//		buses.add(new Bus(2,false,50));
//		buses.add(new Bus(3,true,48));
		
		BusDataAccess busData=new BusDataAccess();
		
		busData.DisplayBusInfo();
		
		
		int userOpt = 1;
		Scanner scanner = new Scanner(System.in);
		
		
		
		while(userOpt==1) {
			System.out.println("Enter 1 to Book and 2 to exit");
			userOpt = scanner.nextInt();
			if(userOpt == 1) {
				Booking booking = new Booking();
				if(booking.isAvailable()) {
					bookings.add(booking);
					System.out.println("Your booking is confirmed");
				}
				else
					System.out.println("Sorry. Bus is full. Try another bus or date.");
			}
		}
	}

}
