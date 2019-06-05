import java.util.Scanner;

public class Hap 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in); // 입력위한 클래스변수생성
		int a=sc.nextInt();  // 값 하나
		int b=sc.nextInt();  // 값 둘
		int start=Math.min(a, b);  // 작은값이 start변수
		int end=Math.max(a, b);    // 큰값이 end변수
		int total=0;               // 변수에 0
		for(int i=start;i<=end;i++) // 작은값부터 큰값까지 실행
			total=total+i;          // 값이 누적
		
		System.out.println("합 : "+total);
	}
}
