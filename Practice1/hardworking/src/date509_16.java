package src;

import java.util.Scanner;
public class date509_16 
{
	
	//16. Scanner로 n이라는 변수에 값을 입력받은 후 
    //1부터 n 까지의 합을 구하시오.
	
	Scanner sc =new Scanner(System.in);
	int num1;
	int num2;
	int num=0;
	
	//int tmp;
	/* if(n>m)
	 { num=num1;
	   num1=num2;
	   num2=num;
	 }
	 */
	
	public void input()
	{
		num1=sc.nextInt();
		num2=sc.nextInt();
	}
	
	public void cal()
	{
		if(num1<num2)
		{
		
			for(int i=num1;i<=num2;i++)
			{
				num=num+i;
			}
			
			System.out.print(num+" ");
			
		}
		
		else if(num2<num1)
		{
		
			for(int i=num2;i<=num1;i++)
			{
				num=num+i;
			}
			
			System.out.print(num+" ");
		}
			
			
	}
			
			
}
