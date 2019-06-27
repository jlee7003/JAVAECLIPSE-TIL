package Date627;
import java.util.Scanner;
public class test11
{
	public void test1()
	{
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b =sc.nextInt();
    int sum=0;
	for(
	int i = a;i<=b;i++)
	{
		sum =sum + a;
	}
	System.out.println(a);
	}
	
	public void test2()
	{
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int lot =0;
	lot=(int)(Math.random()*b)+a;
    System.out.println(lot);
	}
	
	
	public void test3()
	{
		String[] name= {"aa","vv","bb"};
		
		int	aaaa=(int)(Math.random()*3);
		
		System.out.println(name[aaaa]);
		System.out.println(aaaa);

	}
}
