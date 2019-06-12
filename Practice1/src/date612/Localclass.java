package date612;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Localclass
{
	
	public static void main(String[] args)
	{
      LocalDateTime today=LocalDateTime.now();
      
      int y=today.getYear();//날짜함수
      int m=today.getMonthValue();
      int d=today.getDayOfMonth(); //년월일
      
      String yo=today.getDayOfWeek().toString();//toString 문자로 표현해라
      int yo2=today.getDayOfWeek().getValue(); //숫자로
      
      int hh=today.getHour();
      int mm=today.getMinute();
      int ss=today.getSecond();//시분초
      
      //윤년 여부 isLeapYear() //LocalDate클래스에 멤버메소드
      LocalDate toto=today.toLocalDate();
      System.out.println(toto.isLeapYear()); //윤년인 해에는 true 아니라면 false // today.toLocalDate();
      
      /*time 패키지
       * 
       * LocalDate ->년월일
       * 객체생성: LocalDate today=LocalDate.now();
       * LocalTime  시분초
       * 객체생성: LocalDate today=LocalTime.now();
       * LocalDateTime 년월일시분초
       * 객체생성: LocalDate today=LocalDateTime.now();
       * 
       * 
       * 
       * */
      
      String chul=y+"년"+m+"월"+d+"일"+yo+" "+hh+"시 "+mm+"분"+ss+"초";
      System.out.println(chul);
	}

}
