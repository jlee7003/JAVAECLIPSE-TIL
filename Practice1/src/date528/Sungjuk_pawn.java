package date528;
//인터페이스를 사용하기 위한 클래스-> 구현클래스 Sungjuk_pawn은 구현클래스 이다.
//Sungjuk 클래스의 메소드를 사용
import java.util.Scanner;
public class Sungjuk_pawn implements Sungjuk
{
	int kor;
	String sung;
	public void input()
	{
		//A는 스캐너 B는 데이터... 사람들 마다 필요한 입력 방식을 입력하면 됨
		Scanner sc=new Scanner(System.in);
		System.out.println();
		kor=sc.nextInt();
	}
 
	public void sung_cal()
	{
		if(kor>=90)
			sung=AA;
		else if(kor>=80)
			sung=BB;
		else if(kor>=70)
			sung=CC;
		else if(kor>=60)
			sung=DD;
		else 
			sung=FF;
	}
	
	public void chul()
	{
		System.out.println(sung);
	}
}

