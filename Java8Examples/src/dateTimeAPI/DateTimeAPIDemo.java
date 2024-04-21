package dateTimeAPI;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateTimeAPIDemo {
	public static void main(String[] args) {

		LocalDateTime date = LocalDateTime.now();
		System.out.println(date);

		Date date2 = new Date();
		System.out.println(date2);

		Instant instant = Instant.now();
		System.out.println(instant);

		Duration duration = Duration.ofHours(10);
		System.out.println(duration);

//		LocalDate
//
//		Date with no time component
//		Default format - yyyy-MM-dd (2020-02-20)
//		LocalDate today = LocalDate.now();  // gives today’s date
//		LocalDate aDate = LocalDate.of(2011, 12, 30); //(year, month, date)

		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);

		LocalDate localDate2 = LocalDate.of(2012, 03, 24);
		System.out.println(localDate2);

//		LocalTime
//
//		Time with no date with nanosecond precision
//		Default format - hh:mm:ss:zzz (12:06:03.015) nanosecond is optional
//		LocalTime now = LocalTime.now();  // gives time now
//		LocalTime aTime2 = LocalTime.of(18, 20, 30); // (hours, min, sec)

		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);

		LocalTime localTime2 = LocalTime.of(12, 45, 50);
		System.out.println(localTime2);

//		LocalDateTime
//
//		Holds both Date and Time
//		Default format - yyyy-MM-dd-HH-mm-ss.zzz (2020-02-20T12:06:03.015)
//		LocalDateTime timestamp = LocalDateTime.now(); // gives timestamp now
//		//(year, month, date, hours, min, sec)
//		LocalDateTime dt1 = LocalDateTime.of(2011, 12, 30, 18, 20, 30);

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);

		LocalDateTime dt1 = LocalDateTime.of(2011, 12, 30, 18, 20, 30);
		System.out.println(dt1);
		
		int Integer = 24;
		char String  = 'I';
		System.out.print(Integer);
		System.out.print(String);
		
        short x = 10;
        x = (short) (x * 5);
        System.out.print(x);
        
        

	}

}
