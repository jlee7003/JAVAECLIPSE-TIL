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
			System.out.println("��");
		}
		
		else if(eng>=80)
		{
			System.out.println("��");
		}
		
		else if(eng>=60)
		{
			System.out.println("��");
		}
		
		else if(eng>=50)
		{
			System.out.println("��");
		}
		
		else
		{
			System.out.println("��");
		}
	}
}
