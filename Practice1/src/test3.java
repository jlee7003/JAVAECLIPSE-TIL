import java.util.Scanner;
public class test3
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		if((num+num1+num2)/3<60)
		{
			System.out.println("재시험입니다.");
		}
		else
		{
			System.out.println("축하합니다. 합격 입니다.");
		}
	

	}

}