package Date613;

public class Throwsm 
{

	public void chul() //����޼ҵ� Ŭ���� �ȿ� �ִ� �͵��� ������ �θ�
	{
		try 
		{
	     int result=100/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("���� �߻�");
		}
		
	}
	
	
	
	public static void main(String[] args) //������ �ƴ�
	{
		// chul();//����ƽ �ȿ��� ����ƽ�� ��밡���ϹǷ� ����
		          //static�޼ҵ� �ȿ����� static�� ���� ���� 
		          //static ->��ü �������� �۾Ƶ� ��밡��
		Throwsm th=new Throwsm();
		th.chul();//����ƽ �̹Ƿ� 
		System.out.println("�Լ� ȣ��� ���๮��");
	}

}
