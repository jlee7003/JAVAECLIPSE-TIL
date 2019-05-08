import java.util.Scanner;
public class date508_5
{
 
	int eng;
 
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		eng=sc.nextInt();
	}
	
	public void chul()
	{
		if(eng>=90)
		{
			System.out.println("수");
		}
		
		else if(eng>=80)
		{
			System.out.println("우");
		}
		
		else if(eng>=60)
		{
			System.out.println("미");
		}
		
		else if(eng>=50)
		{
			System.out.println("양");
		}
		
		else
		{
			System.out.println("가");
		}
	}
}
