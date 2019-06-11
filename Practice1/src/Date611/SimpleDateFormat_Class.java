package Date611;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat_Class 
{
	public static void main(String[] args) 
	{
		Date today = new Date();
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //이러한 형식으로 출력하겠다.
		                                                           //리턴 값이 있으면 왼쪽 변수에 저장이 가능하다는것
		String ch1=sdf.format(today);
		
 		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
 		String ch2=sdf.format(today);
 		
		sdf = new SimpleDateFormat("HH:mm:ss");
		String ch3=sdf.format(today);
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
	}
}
