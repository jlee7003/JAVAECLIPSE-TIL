package Date613;

public class TryCatchException 
{

	public static void main(String[] args) 
	{
		 int n=6;
		   int[] lotto=new int[6];
		   int num=100;
		   int div=5;
		   
				
		try //try ���� �ȿ� ������ ������ ĳġ �������� �̵��ϰ� ��  //array �����ε� �Ʒ��� ��ġ ������ null���� ��ġ�����̴�.
		    // ���ܰ� �߻��� ĳġ�� ����ǰ� ���� ������ �ִ� ���ܱ����� ������ �� �ٷ� ĳġ�� �Ѿ�Ƿ�
		{
			
	     lotto[4]=100;
	     int result=num/div;
	     
	   	 String str="������";
		//str=null;//null ���� ��� �� �� ����
		 System.out.println(str.toString()); 
		 System.out.println("�����̴�����");

		}
		catch(Exception e) //������ �� ����� �������� ������ ã�Ƴ��� �����Ƿ� ��õ���� �ʴ� ���
		{
		System.out.println("������");
		e.printStackTrace();
		}
		System.out.println("�����ٿ���");
	}

}
