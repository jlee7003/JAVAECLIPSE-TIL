package Date611;

import java.util.Date;

public class Simple_Date
{
  public static void main(String[] args)
  {
    Date today=new Date();
    int y=today.getYear()+1900;  //년 
	int m=today.getMonth()+1;    //월
	String m2=m+""; // 숫자를 문자로 바꾸는 방법
	// m이 1자리일경우(1~9월) 앞에 '0'을 붙인다..
	if(m2.length() == 1) // 문자열바꾼후 길이가 1이면
	   m2="0"+m2; // 항상실행하면 안된다
 	
	int d=today.getDate();
	String d2=d+""; 
	if(d2.length() == 1)
	   d2="0"+d2;
	
	
	int hh=today.getHours();
	int mm=today.getMinutes();
	int ss=today.getSeconds();
	
    // 2019-06-11 로 출력해보기
	String ch1=y+"-"+m2+"-"+d2;
    // 2019년 06월 11일
	String ch2=y+"년 "+m2+"월 "+d2+"일";
    // 10:30:31  (시분초) 출력하기
	String ch3=hh+":"+mm+":"+ss;
	// 전체 출력
	System.out.println(ch1);
	System.out.println(ch2);
	System.out.println(ch3);
  }
}
