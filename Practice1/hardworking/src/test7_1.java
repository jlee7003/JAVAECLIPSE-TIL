import java.util.Scanner;
public class test7_1 

{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		age=age/10; // 10���� 59������ ���� 10���� ������ ������ �����̱� ������ �Ҽ����� ������ �����θ� ���Ѵ�.
		
		switch(age)
		{
		case 1: System.out.println("���İ�Ƽ"); break;
		case 2: System.out.println("�δ��"); break;
		case 3: System.out.println("�Ҵ߹�"); break;
		case 4: System.out.println("��ġȸ"); break;
		case 5: System.out.println("�޲ٹ� �Ұ��"); break;
		default : System.out.println("����"); break;
		}
	}
}
