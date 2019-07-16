package Date507;
import java.util.Scanner;
public class date507_2 
{
	int num1;
	int num2;
	private int hap; //�� Ŭ���� �ȿ����� ����� ���� ���� ���� �Ұ� 
	
	public void add1()
	{
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		
	}

	public void add2()
	{
		hap=num1+num2;
		
	}
	
	public int output() //���� �Ǵ� ���� �ڷ����� void ��ſ� ���������
	{
	return hap; //������ ���� �������°�, ��� ���� �����ϰ��� �Ҷ� ���, �� ���� ����ϱ� ���� ���
	}           //��� �Լ��� ��ȣ�� ������ ��������� 
	            //������ �ٸ� ������ ���� ���� �� ����,������ �׻� ���� 1���� ���� �� �ִ�.
	
}
