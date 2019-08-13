import java.util.Date;

public class para3 {
	Date today;
	public void imsi()
	{
		today=new Date();
		test5.ppp(today);		
	}

	//상속 : 부모클래스의 속서으 메소드를 물려 받아 사용한다.
	
	//1. 코드의 재사용-> 빠른 개발
	

}

class test5
{
	
	public static void ppp(Date today)
	{
		System.out.println(today.getMonth());//getMonth는 0부터 시작함 0~11
	}
}