package date524;
import java.util.Scanner;
abstract class Good
{
	int kor;
	int eng;
	int mat;
	 int hap;
	 int avg;
	// 과목의 합
	public abstract void hap();
	
	// 평균
	public abstract void avg();
	
	// 과목 점수 입력
	public abstract void input();
	
	// 평균과 합계 출력
	public abstract void chul();
}
// 위와 같은 추상클래스가 있다. 3과목을 입력하여
// 합,평균을 구하고 출력하는 메소드를 완성하시오.

public class Test7 extends Good //추상메소드 = 오버라이딩 할 것
{
	
	Scanner sc=new Scanner(System.in);
	
	public void hap()
	{
	
	 hap=kor+eng+mat;
	}
	public void avg()
	{
	
	 avg=(kor+eng+mat)/3;
	}
	public void input()
	{
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();
	}
	public void chul()
	{
		System.out.println(hap+" "+avg);
	}
}
