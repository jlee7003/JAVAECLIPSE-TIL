package date528;
import java.util.Scanner;
public abstract class Abst 
{// ������ �Է¹޾Ƽ� ������ ���ϴ� ���α׷�
	
	int kor;
	char grade; //���� ���ڸ� ���� �� �� �ִ� ���� ,""�� �ð�� ������ �� string�� "" char�� ''
	
	
	public void input() //input your grade
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("������ �Է��Ͻʽÿ�");
		kor=sc.nextInt();
	}
	public abstract void calculation();

	public void grade_output() // out put of the total grades
	{
		System.out.println("your grades are : "+ grade );			
	}

}
