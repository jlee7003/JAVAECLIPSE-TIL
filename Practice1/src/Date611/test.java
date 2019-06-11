package Date611;
import java.util.Date;
public class test 
{

	public static void main(String[] args) 
	{
		Date today=new Date();
		
		int y=today.getYear()+1900; 
		int m=today.getMonth()+1;
		String m2=m+"";//숫자 + 문자 =문자
		//m이 한자리일경우 0을 붙인다.
		if(m2.length()==1) //length 기억해놓을것
			m2="0"+m;
	    
	
		int d=today.getDate();
		String d2=d+"";
		if(d2.length()==1) //0~9는 0을 붙혀주고 10~12는 조건을 없게해줌
			d2="0"+d;
		
		
		String tt=y+"-"+(m2)+"-"+d2;
		System.out.println(tt);
	
		String aa=y+"년 "+(m2)+"월 "+d2+"일 ";
		System.out.println(aa);

		int h=today.getHours();
	    int mm=today.getMinutes();
	    int s=today.getSeconds();
	    String tt3=h+":"+mm+":"+s;
	    System.out.println(tt3);
	}   

}
