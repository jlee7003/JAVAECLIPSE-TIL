import java.util.Scanner;
public class date509_24 
{
	//24. �л� 5���� ��,��,�� ������ �Է¹޾Ƽ� �հ�� ����� ���Ѵٰ� �Ҷ� 
    // �� ������ ������ �迭�� ������ Scanner�� ���� �Է¹����� 
   // �հ�� ����� ���� hap, avg��� �̸��� �迭�� ������ ����Ͻÿ�.
	
	Scanner sc=new Scanner(System.in);
	int kor[]=new int[5]; 
	int eng[]=new int[5];
	int mat[]=new int[5];
	int hap[]=new int[5];
	int avg[]=new int[5];
	
	public void input()
	{
		for(int i=0;i<kor.length;i++)
		{
			kor[i]=sc.nextInt();
			eng[i]=sc.nextInt();
			mat[i]=sc.nextInt();
		}
		
	}
	
	public void output()
	{
		
		for(int i=0;i<hap.length;i++)
		{
			hap[i]= kor[i]+eng[i]+mat[i];
			avg[i]=hap[i]/3;
			
			System.out.println(hap[i]+" "+avg[i]);
		}	
		
	}

}
