import java.util.Scanner;
public class test501_2
{

	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
		int kor;
		int eng;
		int mat;
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();
		
		System.out.print((kor+eng+mat)+" "+ (kor+eng+mat)/3 );
	}

}
