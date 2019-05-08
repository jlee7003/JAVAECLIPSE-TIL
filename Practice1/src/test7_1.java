import java.util.Scanner;
public class test7_1 

{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		age=age/10; // 10부터 59까지의 값을 10으로 나누면 정수형 변수이기 때문에 소수점은 버리고 정수부만 취한다.
		
		switch(age)
		{
		case 1: System.out.println("스파게티"); break;
		case 2: System.out.println("부대찌개"); break;
		case 3: System.out.println("불닭발"); break;
		case 4: System.out.println("참치회"); break;
		case 5: System.out.println("쭈꾸미 불고기"); break;
		default : System.out.println("오류"); break;
		}
	}
}
