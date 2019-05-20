package date520;

public class date520_1 
{
   //속성 : 변수
	int n;
	int total;
	
  //생성자 : 기능
  //클래스 내의 속성의 초기값을 주는 것
	
	
  //메소드 : 기능
	date520_1()
	{
		n=88;
	}
	public void input()
	{
		n=99;
	}
	
	public void cal()
	{
		for(int i=1;i<=n;i++)
		{
			total=total+i;
		}
	}
	
	public void chul()
	{
		 System.out.println(total);
	}
}
