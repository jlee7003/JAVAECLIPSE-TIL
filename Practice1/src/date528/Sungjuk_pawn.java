package date528;
//�������̽��� ����ϱ� ���� Ŭ����-> ����Ŭ���� Sungjuk_pawn�� ����Ŭ���� �̴�.
//Sungjuk Ŭ������ �޼ҵ带 ���
import java.util.Scanner;
public class Sungjuk_pawn implements Sungjuk
{
	int kor;
	String sung;
	public void input()
	{
		//A�� ��ĳ�� B�� ������... ����� ���� �ʿ��� �Է� ����� �Է��ϸ� ��
		Scanner sc=new Scanner(System.in);
		System.out.println();
		kor=sc.nextInt();
	}
 
	public void sung_cal()
	{
		if(kor>=90)
			sung=AA;
		else if(kor>=80)
			sung=BB;
		else if(kor>=70)
			sung=CC;
		else if(kor>=60)
			sung=DD;
		else 
			sung=FF;
	}
	
	public void chul()
	{
		System.out.println(sung);
	}
}

