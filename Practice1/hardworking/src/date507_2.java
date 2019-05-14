import java.util.Scanner;
public class date507_2 
{
	int num1;
	int num2;
	private int hap; //요 클래스 안에서만 사용이 가능 직접 접근 불가 
	
	public void add1()
	{
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		
	}

	public void add2()
	{
		hap=num1+num2;
		
	}
	
	public int output() //리턴 되는 값의 자료형을 void 대신에 적어줘야함
	{
	return hap; //리턴은 값을 가져오는것, 어떠한 값을 유지하고자 할때 사용, 그 값을 사용하기 위해 사용
	}           //모든 함수는 괄호가 끝나면 사라지지만 
	            //리턴은 다른 곳으로 값을 보낼 수 있음,리턴은 항상 변수 1개만 보낼 수 있다.
	
}
