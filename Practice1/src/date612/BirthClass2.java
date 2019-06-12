package date612;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class BirthClass2
{

	public static void main(String[] args) 
	{
		LocalDateTime today=LocalDateTime.now();
		LocalDateTime xday=LocalDateTime.of(2016,9,10,12,12,12);
		
		
		Period pp=Period.between(xday.toLocalDate(),today.toLocalDate());
		
		int y=pp.getYears();
		int m=pp.getMonths();
		int d=pp.getDays();
		
		System.out.println(y+"³â"+m+"¿ù"+d+"ÀÏ");
	
		
		
	}

}
