import java.util.Scanner;

public class date513_9 
{

	
	int kor;
	int eng;
	int mat;
	int hap;
	
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();
		
		
	}
	
	public int stand() //��� �Լ��� ���� �Լ��� �θ��� �ִ�. 
	                   //�� ���� �Լ� ȣ���� �Ұ���
	                   //�Լ� �ȿ��� �Լ��� ȣ���Ͽ� ���� ����
	{
		hap=kor+eng+mat;
		System.out.println(hap);
		
		return hap; //�Լ��� ���� ������ ���� �Ҽ� �ְ� �ϴ� ��ɾ�
	}
}
