import java.util.Scanner;
public class test2
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("국어 점수를 입력하십시오 :");
		int num=sc.nextInt();
		System.out.print("영어 점수를 입력하십시오 :");
		int num1=sc.nextInt();
		System.out.print("수학 점수를 입력하십시오 :");
		int num2=sc.nextInt();
		
		int hap=num+num1+num2;
		int avg=(num+num1+num2)/3;
		
		System.out.println(hap);
		System.out.println(avg);

	}

}
