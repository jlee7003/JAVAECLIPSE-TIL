package Date613;

public class Throws2
{
	public void chul() throws ArithmeticException// ����޼ҵ�
	{
		int result=100/0; // ����ó���ϱ� �Ⱦ��!!
	}

	public static void main(String[] args)
	{
		// chul(); // static�޼ҵ� �������� static�� ���ٰ���
		Throws2 th=new Throws2();
		try
		{
		  th.chul();
		}
		catch(ArithmeticException e)
		{
			System.out.println("ȣ���Ѱ����� ����ó��");
		}
		System.out.println("�Լ�ȣ��ڿ� ����� ����");
	}
}
