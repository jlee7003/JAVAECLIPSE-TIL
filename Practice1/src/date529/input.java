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
		System.out.println("���� ����: "+kor);
		System.out.println("���� ����: "+eng);
		System.out.println("���� ����: "+mat);
	}
}
