
public class test501_22
{

	public static void main(String[] args)
	{
		int test[]=new int[10];
		
		System.out.println("��÷�� 6���� ��ȣ��");
		for(int i=0;i<=5;i++) // arr.length = arr �迭�� ũ��
		{
			test[i]=(int)(Math.random()*10)+1;
			System.out.print(test[i] + " ");
		}
		System.out.println("�Դϴ�.");
	}

}
