package date610;

import java.util.Calendar;
import java.util.TimeZone;

public class Calendar_One 
{
	public static void main(String[] args)
	{
		// Date today=new Date();
		TimeZone tz=TimeZone.getTimeZone("Canada/Central");
		Calendar today=Calendar.getInstance(tz); 
		int ap=today.get(Calendar.AM_PM); // 오전 0, 오후 1
		System.out.println(ap);
		
		int y=today.get(Calendar.YEAR);
		int m=today.get(Calendar.MONTH); // 0~11
		int d=today.get(Calendar.DAY_OF_MONTH);
		System.out.println(y+"년 "+m+"월 "+d+"일");  
		
		int dd=today.get(Calendar.DAY_OF_WEEK); // 1~7
		System.out.println(dd+"요일");
		
		int hh=today.get(Calendar.HOUR);
		int mm=today.get(Calendar.MINUTE);
		int ss=today.get(Calendar.SECOND);
		System.out.println(hh+"시 "+mm+"분 "+ss+"초");
		
		
		//System.out.println(today.toString());
	}
}
