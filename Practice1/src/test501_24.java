import java.util.Scanner;
public class test501_24
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int stua[]=new int[3];
		int sum=0;
		int hap[]=new int[1];
		
		int avg[]=new int[1];
		
		for(int i=0;i<3;i++)
		{
			stua[i]=sc.nextInt();
			sum= sum + stua[i];
		}
		
		hap[0]=stua[2];
	
		int i=0;
		System.out.print(hap[i]);
	}

}
