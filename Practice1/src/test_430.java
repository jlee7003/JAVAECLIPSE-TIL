
public class test_430 
{

	public static void main(String[] args)
	{
		int lot[]=new int[6];
		
		System.out.println("��÷�� 6���� ��ȣ��");
		for(int i=0;i<=5;i++) // arr.length = arr �迭�� ũ��
		{
			lot[i]=(int)(Math.random()*45)+1;
			System.out.print(lot[i] + " ");
		}
		System.out.println("�Դϴ�.");
	}

}
