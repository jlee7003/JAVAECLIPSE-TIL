import java.util.Scanner;
public class test_429 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		// �迭: ������ �������� ����
		// ��ǥ�̸����� �����ϰ� �ε�����ȣ�� ����
		
		//�迭 ����¹�
		//1. �迭�� �� ���� ������ �ִ� ���
		// �ڷ���[] �迭��= {��,��,��,��};
		int[] kor = {80,90,70,60,50}; //����
		
		//2. ���� ������ ���� ���� ���
		int[] eng =new int[5]; // �Ҵ�
		
		//int a=30;
		//a=a+100;
		//System.out.println(a);
		

		kor[3]=kor[3]+100;
		System.out.println(kor[3]);
		
		//�迭�� ����� �ʱⰪ���� 0�� �ڵ�����
		System.out.println(kor[2]);
	
	}

}
