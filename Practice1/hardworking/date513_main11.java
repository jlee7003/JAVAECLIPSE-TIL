import java.util.Scanner;
public class date513_main11
{

	public static void main(String[] args) 
	{
		//�迭�� ũ�Ⱑ 5�� test��� �迭�� �����.
        //�迭�� ��������� 1���� 5������ ���� �Է��Ѵ�.
		//�迭�� ����ִ� ���� ������� ����Ѵ�.
		Scanner sc=new Scanner(System.in);
		
		int test[]=new int[5];
		
		for(int i=0;i<test.length;i++)
		{
			test[i]=sc.nextInt();
		}
		
		for(int i=0;i<test.length;i++)
		{
			System.out.print(test[i]);
		}
	}

}
