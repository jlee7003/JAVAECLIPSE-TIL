package date524;


class son 
{
int kor;
 public void chul() //final�� ����ϸ� �ٲ��� ���� final�� ����ϸ� �������̵��� ���� �������
 //�������̵� : �θ� ���� �ִ� �޼ҵ带 �����Ͽ� ��� �ϴ� ��
 {
	 System.out.println("�ƹ���");
 }
 //final ���� �Ұ�
}

public class Abstractclass2 extends son
	
{
	 public void aaa()
		{
			System.out.println("�߰�");
		}
		
	 public void chul()//�� �޼ҵ带 ������ ������ chul �޼ҵ尡 ����;
	    {
			System.out.println("���� �߰�"); //�ƹ����� ���� �߰��� �ٲ�
		}
		
}