import java.util.Scanner;
public class test6 
{
	 public static void main(String[] args)
	 {
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println("a 부터 b 까지의 3의 배수가 아닌 수의 출력시스템 입니다.");
		 System.out.print("a의 값을 입력하십시오 :");
		 int num=sc.nextInt();
		 System.out.print("b의 값을 입력하십시오 :");
		 int num1=sc.nextInt();
		 int num2=0;
	
		  for(int i=num;i<=num1;i++)
		  {
			 
			  if(i %3!=0)
			  {
				  num2=num2+i;
			  }
			  
			  
		  }
		  System.out.println(num + "부터 " + num1 +"까지의 3배수가 아닌 수의 합은 :" + num2 + "입니다.");
		
		  
	 }
			
}
		 
