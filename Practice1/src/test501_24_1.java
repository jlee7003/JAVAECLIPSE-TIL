import java.util.Scanner;
public class test501_24_1
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int stu1[]=new int[5];
		int stu2[]=new int[5];
		int stu3[]=new int[5];
	
		
		int sum[]=new int[5];
		
		for(int i=0;i<stu1.length;i++) //학생 1
		{
			stu1[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<stu2.length;i++) //학생 2
		{
			stu2[i]=sc.nextInt();
			
		}
		for(int i=0;i<stu3.length;i++) //학생 3
		{
			stu3[i]=sc.nextInt();
		}
	
		
		for(int i=0;i<sum.length;i++)
		{
			sum[i]= stu1[i]+ stu2[i]+ stu3[i];
		System.out.print(" "+sum[i]+" ");
	
		}
		
			
		
		

	}

}
