package Date613;

public class Throws2m 
{

	public void chul() throws ArithmeticException //����޼ҵ� Ŭ���� �ȿ� �ִ� �͵��� ������ �θ�
	{
	     int result=100/0; //����ó���ϱ� �Ⱦ��		
	}
		
	public static void main(String[] args) //������ �ƴ�
	{
		// chul();//����ƽ �ȿ��� ����ƽ�� ��밡���ϹǷ� ����
		          //static�޼ҵ� �ȿ����� static�� ���� ���� 
		          //static ->��ü �������� �۾Ƶ� ��밡��
		Throws2m th=new Throws2m();
		
		try
		{
			th.chul();
		}
		catch(ArithmeticException e)
		{
			System.out.println("���ܹ߻�");
		}
		
		System.out.println("�Լ� ȣ��� ���๮��");
	}

}
