import java.util.Scanner;
public class Tutorial1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=3;i++)
		 {
			System.out.print("국어 점수를 입력하시오: ");		
			int a =sc.nextInt();		
			System.out.print("영어 점수를 입력하시오: ");		
			int b =sc.nextInt();		
			System.out.print("수학 점수를 입력하시오: ");		
			int c =sc.nextInt();
				
			if((a>100)||(b>100)||(c>100))		
			{
			 System.out.println("잘못된 값입니다.");
			}	
		
			else		
			{
			 System.out.println(("국영수 점수의 합계는 ")+(a+b+c)+("입니다. "));
			}	
			
		 }     
		
		
	}
	
}