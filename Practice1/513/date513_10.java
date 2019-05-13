import java.util.Scanner;
public class date513_10 
{
	Scanner sc=new Scanner(System.in);
	int kor;
	int eng;
	int mat;
	int hap[]=new int[3];
	int sum=0;

	
	public void input()
	{
		for(int i=0;i<hap.length;i++)
		{
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();
		
		hap[i]=kor+mat+eng;
		}
	}

	
	public void output()
	{
		
		
		
		for(int i=0;i<hap.length;i++)
		{
		System.out.print(hap[i]+" ");
		System.out.println(hap[i]/3);
		sum=sum+(hap[i]/3);
		}
		
		System.out.println(sum/3);
	}
}
