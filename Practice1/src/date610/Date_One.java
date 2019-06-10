package date610;

import java.util.Date;

public class Date_One
{
	public static void main(String[] args) 
	{
	    // Date()
		Date today=new Date();
		
		int y=today.getYear()+1900;  // 년
		int m=today.getMonth(); // 월
		int d=today.getDate();   // 일
		int dd=today.getDay(); // 요일
		int hh=today.getHours();  // 시간
		int mm=today.getMinutes(); // 분
		int ss=today.getSeconds(); // 초
		
		String tt=y+"년 "+m+"월 "+d+"일 ";
		String tt2=dd+"요일";
		String tt3=hh+"시 "+mm+"분 "+ss+"초";
		
		System.out.println(tt);
		System.out.println(tt2);
		System.out.println(tt3);
		
		
		//System.out.println(today.toString());
		// toString() => 객체변수를 문자형으로 출력하는 함수
	}
}
