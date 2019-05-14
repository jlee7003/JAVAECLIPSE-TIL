import java.util.Scanner;

public class date508_7 
{
	int kor;
	int eng;
	int mat;
	int sel;
	Scanner sc=new Scanner(System.in);
	
	public void input()
	{
		
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();
		sel=sc.nextInt();
	}
	public void output()
	{	
		switch(sel)
		{case 1: System.out.println(kor); break;
		 case 2: System.out.println(eng); break;
		 case 3: System.out.println(mat);
		}
		
		

	}
	
}
