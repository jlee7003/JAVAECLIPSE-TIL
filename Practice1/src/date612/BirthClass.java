package date612;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class BirthClass
{

	public static void main(String[] args) 
	{
		LocalDateTime today=LocalDateTime.now();
		LocalDateTime birthday=LocalDateTime.of(2016,9,10,12,12,12);
		
		long year=birthday.until(today,ChronoUnit.YEARS); //비교할 대상의 날짜
		long month=birthday.until(today,ChronoUnit.MONTHS);
		long day=birthday.until(today,ChronoUnit.DAYS);
		long hour=birthday.until(today,ChronoUnit.HOURS);
		long minute=birthday.until(today,ChronoUnit.MINUTES);
		long second=birthday.until(today,ChronoUnit.SECONDS);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);

		
		
	}

}
