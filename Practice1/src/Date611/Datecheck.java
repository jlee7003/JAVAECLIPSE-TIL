package Date611;

import java.time.LocalDateTime;

public class Datecheck {

	public static void main(String[] args) 
	{
		LocalDateTime today=LocalDateTime.now();
		
		//plus 말고도 minus가 존재한다.
		//LocalDateTime xday=today.plusYears(10); //오늘을 기준으로 년도에 10을 더하는것
		//LocalDateTime xday=today.plusMonths(10);  //오늘을 기준으로 10개월을 더한 것 
		//LocalDateTime xday=today.plusDays(1000);  //오늘을기준으로 1000일을 더한것
		//LocalDateTime xday=today.plusHours(1000);  //...
		//LocalDateTime xday=today.plusMinutes(1000);
		//LocalDateTime xday=today.plusSeconds(1000);
  		int y=xday.getYear();
		int m=xday.getMonthValue();
		int d=xday.getDayOfMonth();
		
		System.out.println(y+"년"+m+"월"+d+"일");
		
		
		
	}

}
