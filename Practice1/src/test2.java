import java.util.Scanner;
public class test2
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("���� ������ �Է��Ͻʽÿ� :");
		int num=sc.nextInt();
		System.out.print("���� ������ �Է��Ͻʽÿ� :");
		int num1=sc.nextInt();
		System.out.print("���� ������ �Է��Ͻʽÿ� :");
		int num2=sc.nextInt();
		
		int hap=num+num1+num2;
		int avg=(num+num1+num2)/3;
		
		System.out.println(hap);
		System.out.println(avg);

	}

}
