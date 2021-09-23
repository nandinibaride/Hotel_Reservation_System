package hotelreservationsystem.com;

import java.util.ArrayList;

/*
 * @purpose:Ability to add Hotel in a Hotel Reservation System.
 * @author: Nandini.B
 */
public class AddHotelName {
	static ArrayList<Hotel> HotelsList = new ArrayList<>();

	public static Hotel viewHotel(String hotelName, ArrayList<Hotel> HotelList) {
		for (Hotel i : HotelsList) {
			System.out.println(i);
			return(i);
			}
		return null;
		}

	public static void main(String[] args) {
		System.out.println("WELCOME TO HOTEL RESERVATION PROGRAM");

		Hotel lakeWood = new Hotel();
		lakeWood.setHotelName("LakeWood");
		lakeWood.setForWeekDay(110);
		lakeWood.setForWeekEnd(90);
		System.out.println(lakeWood);

		Hotel bridgeWood = new Hotel();
		bridgeWood.setHotelName("Bridge Wood");
		bridgeWood.setForWeekDay(160);
		bridgeWood.setForWeekEnd(60);
		System.out.println(bridgeWood);

		Hotel ridgeWood = new Hotel();
		ridgeWood.setHotelName("Ridge Wood");
		ridgeWood.setForWeekDay(220);
		ridgeWood.setForWeekEnd(150);
		System.out.println(ridgeWood);
		
	}

}