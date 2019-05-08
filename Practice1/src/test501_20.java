import java.util.Scanner;
public class test501_20
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int pay[]={100,200,150,55,88,95,56,96,88};
		int sum=0;
		
		for(int i=0;i<pay.length;i++)
		{
			sum= sum + pay[i];
		}
		
		 System.out.print(sum);

	}

}
