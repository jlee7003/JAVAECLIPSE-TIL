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
			System.out.println("������Դϴ�.");
		}
		else
		{
			System.out.println("�����մϴ�. �հ� �Դϴ�.");
		}
	

	}

}