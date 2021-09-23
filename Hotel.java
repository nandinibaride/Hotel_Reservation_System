package hotelreservationsystem.com;

public class Hotel {
	
	public String hotelName;
    public int forWeekDay;
    public int forWeekEnd;

	private String HotelName;
    public String getHotelName() {
		return hotelName;
	}
    
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	
	public int getForWeekDay() {
		return forWeekDay;
	}
	
	public void setForWeekDay(int forWeekDay) {
		this.forWeekDay = forWeekDay;
	}
	
	public int getForWeekEnd() {
		return forWeekEnd;
	}
	
	public void setForWeekEnd(int forWeekEnd) {
		this.forWeekEnd = forWeekEnd;
	}
	
	 @Override
		public String toString() {
			return "Hotel [hotelName=" + hotelName + ", forWeekDay=" + forWeekDay + ", forWeekEnd=" + forWeekEnd + "]";
		}

	
	}


