import java.util.Scanner;
public class date509_19 
{
	//18�������� kor�迭�� ���� Scanner�� �Է��� �� 
    //kor�迭�� ������ ����Ͻÿ�.

	Scanner sc= new Scanner(System.in);
	
	int kor[]=new int[6];
	
	
	public void input()
	{
		for(int i=0;i<kor.length;i++)
		{
			kor[i]=sc.nextInt();
		}
	}
	
	
	public void output()
	{
	
		for(int j=0;j<kor.length;j++)
		{
			System.out.print(kor[j]);
		}
	
	}
	
}
