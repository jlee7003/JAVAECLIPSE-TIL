package date603;
import java.util.Date;
public class test 
{

	public static void main(String[] args) 
	{
		//���� �����ڸ� ���� �����ʿ� �ִ� ���� �������� �� ���
		//���ڴ� ���� ���ڴ� ���� ���� ���� ����ȯ�̶�� �� 
		//������ ������ ���´� �׻� ���ƾ���
		
		//����
		int a=99;
		int b=a;// a��� ������ ������ �ִ� ���� ������ ������ ����

		//char aa=b; Ÿ���� ���� �������� x
		
		//�迭
		int[] kor= new int[3];
		kor[0]=100;
		kor[1]=90;
		kor[2]=80;
		int[] kkk =kor;
		System.out.println(kkk[2]);
		
		//��ä
		Date today=new Date();
		System.out.println(today.getDate());
		
		Date ttt=today;
		System.out.println(ttt.getDate());
	}

}
