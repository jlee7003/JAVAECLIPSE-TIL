package date603;

public class split 
{

	public static void main(String[] args) 
	{
		String phone="010-1234-5678";
		
		String[] pho=phone.split("-");//������ �迭�� �޾ƾ���
		//pho��� �迭�� '-'���ڸ� �������� �ڸ� ������ 0�� �ε��� ���� ������ �ѱ�
//		������ ���� �迭�� �迭
		System.out.println(pho[0]);
		System.out.println(pho[1]);
		System.out.println(pho[2]);

	}

}
