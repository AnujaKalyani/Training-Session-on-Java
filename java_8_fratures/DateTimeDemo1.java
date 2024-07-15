package java_8_fratures.com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo1 {

	public static void main(String[] args) {
		LocalDate dt=LocalDate.now();
		System.out.println("Current Date: "+dt);
		LocalTime lt=LocalTime.now();
		System.out.println("Current Time: "+lt);
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println("Current Date And Time: "+ldt);
		
		DateTimeFormatter format=DateTimeFormatter.ISO_LOCAL_DATE;
		System.out.println("Date Time Format: "+format);
		
		Month month=dt.getMonth();
		System.out.println("Current Month: "+month);
		
	}

}
