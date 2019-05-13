import java.util.Scanner;
public class date513_2
{
	int kor;
	int eng;
	int mat;
	int sci;
	
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();
		sci=sc.nextInt();
		
	}
	
	public void claout()
	{
		if(kor>=90)
		{
			System.out.println("수");
		}
		
		else if(kor>=80)
		{
			System.out.println("우");
		}
		
		else if(kor>=70)
		{
			System.out.println("미");
		}
		
		else if(kor>=60)
		{
			System.out.println("양");
		}
		
		else
		{
			System.out.println("가");
		}  
		
		
		if(eng>=90)
		{
			System.out.println("수");
		}
		
		else if(eng>=80)
		{
			System.out.println("우");
		}
		
		else if(eng>=70)
		{
			System.out.println("미");
		}
		
		else if(eng>=60)
		{
			System.out.println("양");
		}
		
		else
		{
			System.out.println("가");
		}  
		
		
		if(mat>=90)
		{
			System.out.println("수");
		}
		
		else if(mat>=80)
		{
			System.out.println("우");
		}
		
		else if(mat>=70)
		{
			System.out.println("미");
		}
		
		else if(mat>=60)
		{
			System.out.println("양");
		}
		
		else
		{
			System.out.println("가");
		}  
		
		
		
		if(sci>=90)
		{
			System.out.println("수");
		}
		
		else if(sci>=80)
		{
			System.out.println("우");
		}
		
		else if(sci>=70)
		{
			System.out.println("미");
		}
		
		else if(sci>=60)
		{
			System.out.println("양");
		}
		
		else
		{
			System.out.println("가");
		}  
	}
	
	
	
}

