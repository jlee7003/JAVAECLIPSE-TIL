package src;

import java.util.Scanner;
public class test로또중복금지문
{ 
	Scanner sc=new Scanner(System.in);
	int lotto[]=new int[6];
	int num = 0;
	public void sum()
	{
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)(Math.random()*45)+1;
			
			
			for(int j=0;j<=i-1;j++)
			  {
				 
				  if(lotto[j]>lotto[i])
				  {
					  i=i-1;
				  }
				  
			  }
			
		}
	
	}
	
	public void sum2()
	{
		for(int i=0;i<lotto.length;i++) 
		{
			System.out.print(lotto[i]+" ");
		}
	  
	}
}
