import java.util.Scanner;
public class test_4294 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
		int[] lot=new int[sc.nextInt()]; //3�� ¥�� ����Ʈ => ����Ʈ�� �������ϱ�
		 for(int i=0;i<=4;i++) //�ݺ��� 
		 {
	      lot[i]=(int)(Math.random()*45)+1; //i�� ¥�� ����Ʈ�� ���� ��
		 
	      
	      System.out.println(lot[i]);
		 }
		
	}

}
