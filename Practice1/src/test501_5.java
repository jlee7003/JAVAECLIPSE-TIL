import java.util.Scanner;
public class test501_5 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int eng;
		eng=sc.nextInt();
		
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
