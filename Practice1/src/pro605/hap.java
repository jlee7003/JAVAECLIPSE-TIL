import java.util.Scanner;

public class Hap 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in); // �Է����� Ŭ������������
		int a=sc.nextInt();  // �� �ϳ�
		int b=sc.nextInt();  // �� ��
		int start=Math.min(a, b);  // �������� start����
		int end=Math.max(a, b);    // ū���� end����
		int total=0;               // ������ 0
		for(int i=start;i<=end;i++) // ���������� ū������ ����
			total=total+i;          // ���� ����
		
		System.out.println("�� : "+total);
	}
}
