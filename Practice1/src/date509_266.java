import java.util.Scanner;
public class date509_266 
{
	
	int num1;
	int num2;
	Scanner sc=new Scanner(System.in);
	
	 int wew=sc.nextInt();
		int lot[]=new int[wew];

		
		public void input()
		{
			 num1=sc.nextInt();
			 num2=sc.nextInt();
		}	 
			
		public void inin()
		{
			
			 
			if(num1<num2)
			{
				int num3=num2-num1+1;
				for(int i=0;i<lot.length;i++)
				{
					lot[i]=(int)(Math.random()*num3)+num1;
				}
			}
			
			else if(num2<num1)
			{ 
				int num3=num1-num2+1;
				for(int i=0;i<lot.length;i++)
				{
					lot[i]=(int)(Math.random()*num3)+num1;
				}
		    }
			
		}

		public void output()
		{
			for(int i=0;i<lot.length;i++)
			System.out.print(lot[i]+" ");
		}
}
