package date524;
import java.util.Scanner;
public class Abstractclass3
{
	int kor;
	int eng;
	int mat;
	int sum;
	int aver;
	Scanner sc=new Scanner(System.in);
	
	public void hap()
	{
		sum=kor+eng+mat;
	}
	public void avg()
	{
		aver=sum/3;
	}
	public void input()
	{
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();
	}
	public void chul()
	{
		System.out.println(sum+" "+aver);
	}

}
