package date524;

 class son 
{
 int kor;
  public final void chul() //final�� ����ϸ� �ٲ��� ���� final�� ����ϸ� �����ε��� ���� �������
  
  {
	 System.out.println("�ƹ���");
  }
  //final ���� �Ұ�
}

public class father extends son
	
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


