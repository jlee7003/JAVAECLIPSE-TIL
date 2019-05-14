import java.util.Scanner;
public class date509_25 
{

	Scanner sc=new Scanner(System.in);
	
		int lot[]=new int[4];
		
		public void input()
		{
			 
			 int num1=sc.nextInt();
			int num2=sc.nextInt();
	
			if(num1<num2)
			{
				for(int i=0;i<lot.length;i++)
				{
					lot[i]=(int)(Math.random()*(num2-num1+1))+num1;
				}
			}
			
			else if(num2<num1)
			{
				for(int i=0;i<lot.length;i++)
				{
					lot[i]=(int)(Math.random()*(num1-num2+1))+num2;
				}
		    }
			
		}

		public void output()
		{
			for(int i=0;i<lot.length;i++)
			System.out.print(lot[i]+" ");
		}
}
