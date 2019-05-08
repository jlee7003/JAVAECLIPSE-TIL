import java.util.Scanner;

public class date508_6
{

	Scanner sc=new Scanner(System.in);
	
	int mat;
	public void input()
	{
	mat=sc.nextInt();
	}

	public void cal()
	{
	
	if(mat>=60)
	{
		System.out.println("합격");
	}
	
	else
	{
		System.out.println("불합격");
	}

	}
   

	
}
