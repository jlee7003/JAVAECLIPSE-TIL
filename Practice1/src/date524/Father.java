package date524;


class son 
{
int kor;
 public void chul() //final�� ����ϸ� �ٲ��� ���� final�� ����ϸ� �����ε��� ���� �������
 {
	 System.out.println("�ƹ���");
 }
 //final ���� �Ұ�
}

public class Father extends son
	
{
	 public void aaa()
		{
			System.out.println("�߰�");
		}
		
	 public void chul()
	    {
			System.out.println("�߰�alal"); //�ƹ����� �߰�alal�� �ٲ�
		}
		
}

