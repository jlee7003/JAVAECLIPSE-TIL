package Date613;

public class TryCatch 
{

	public static void main(String[] args) 
	{
		 int n=6;
		   int[] lotto=new int[6];
		   int num=100;
		   int div=0;
		   
		
		
		
		try //try ���� �ȿ� ������ ������ ĳġ �������� �̵��ϰ� ��  //array �����ε� �Ʒ��� ��ġ ������ null���� ��ġ�����̴�.
		    // ���ܰ� �߻��� ĳġ�� ����ǰ� ���� ������ �ִ� ���ܱ����� ������ �� �ٷ� ĳġ�� �Ѿ�Ƿ�
		{
			
			lotto[6]=100;
	     int result=num/div;
	     
	   	 String str="������";
		 str=null;//null ���� ��� �� �� ����
		 System.out.println(str.toString()); 

		}
		catch(ArrayIndexOutOfBoundsException e)//array�� ���ܽ�
		{
			System.out.println("Array����");
		}
		catch(NullPointerException e)//����ó�� Ŭ���� e�� �ŰԺ����̴�. null�� ���ܽ�
		{
			System.out.println("ERROR 404: ������ �߻��߽��ϴ�.");
			System.out.println("str�� �������� ���� null�Դϴ�.");
			e.printStackTrace();
		}
		catch(ArithmeticException e)//0���δ� �������� 
		{
			System.out.println("0���δ� ���� �� �����ϴ�.");
		}
		catch(Exception e) //������ �� �������ְ� �������� ���� ������ �ɷ����� ��
		                   //�� Exception�� ������ ������ catch���ٰ� ����ؾ���->�ƴϸ� �� Exception�� �ɷ���
		{
			System.out.println("������ ������ ���� ���������� �𸥴�.");
		}
		finally //������ ���౸�� �����̵� �ƴϵ� ������ �����
		{
			System.out.println("finally�Դϴ�");
		}
		
		System.out.println("������");
	}

}
