package date612;

import java.time.LocalDateTime;

public class LocalclassOf 
{

	public static void main(String[] args)
	{
		LocalDateTime today=LocalDateTime.now();//now()->현재시간
		String yo=today.getDayOfWeek().toString();
		
		LocalDateTime xday=LocalDateTime.of(1989,3,26,12,12,12);//of() ->특정시간
		 
		String yo2=xday.getDayOfWeek().toString();
		
		System.out.println(yo+" "+yo2);

	}

}
