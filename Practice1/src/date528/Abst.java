package date528;
import java.util.Scanner;
public abstract class Abst 
{// 점수를 입력받아서 성적을 구하는 프로그램
	
	int kor;
	char grade; //문자 한자를 저장 할 수 있는 변수 ,""가 올경우 오류가 남 string은 "" char는 ''
	
	
	public void input() //input your grade
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("성적을 입력하십시오");
		kor=sc.nextInt();
	}
	public abstract void calculation();

	public void grade_output() // out put of the total grades
	{
		System.out.println("your grades are : "+ grade );			
	}

}
