package Date613;

public class Throws
{
	public void chul() // ����޼ҵ�
	{
	   try
	   {
		int result=100/0;
	   }
	   catch(ArithmeticException e)
	   {
		   System.out.println("���ܹ߻�");
	   }
	}

	public static void main(String[] args)
	{
		// chul(); // static�޼ҵ� �������� static�� ���ٰ���
		Throws th=new Throws();
		th.chul();
		System.out.println("�Լ�ȣ��ڿ� ����� ����");
	}

}
