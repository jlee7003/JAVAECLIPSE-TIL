import java.util.Scanner;
public class test501_8 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int kor;
		int eng;
		int mat;
		int sel;
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();
		
        sel=sc.nextInt();
		
		
		
		

		
	
		
		switch(sel)
		{case 1: if(kor>=90)
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
		}  ; break;
		 case 2: if(eng>=90)
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
			; break;
		 case 3: 	if(mat>=90)
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
;
		}
		

	}

}