package date529;
import java.util.Scanner;
public class input
{

	int kor;
	int eng;
	int mat;
	
	public void input1()
	{
		Scanner sc=new Scanner(System.in);
		
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();
	}
	
	public void chul()
	{
		System.out.println("국어 점수: "+kor);
		System.out.println("영어 점수: "+eng);
		System.out.println("수학 점수: "+mat);
	}
}
