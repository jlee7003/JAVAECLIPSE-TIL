
public class test501_21 
{

	public static void main(String[] args)
	{
		int lotto[]=new int[6];
		
		System.out.println("��÷�� 6���� ��ȣ��");
		for(int i=0;i<=5;i++) // arr.length = arr �迭�� ũ��
		{
			lotto[i]=(int)(Math.random()*45)+1;
			System.out.print(lotto[i] + " ");
		}
		System.out.println("�Դϴ�.");
	}

}
