import java.util.Scanner;
public class test501_7 
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
		{case 1: System.out.println(kor);
		 case 2: System.out.println(eng);
		 case 3: System.out.println(mat);
		}
		
		

	}

}