import java.util.Scanner;
public class date513_3 

{

	int kor;
	int mat;
	int eng;
	int sci;
	int sel;

	Scanner sc=new Scanner(System.in);
	
	
	public void stand1()
	{   
		kor=sc.nextInt();
		mat=sc.nextInt();
		eng=sc.nextInt();
		sci=sc.nextInt();
		
	}
		public void stand2(int sss,String str)//���, ��� ()���� sss�� str�� 
		                                     // �Լ� ���� ������ ���
		{                                    //�ŰԺ��� ���� �޾Ƽ� �������ִ� ����
		
			if(sss>=90)
			{
				System.out.println(str+" : ��");
			}
			
			else if(sss>=80)
			{
				System.out.println(str+" : ��");
			}
			
			else if(sss>=70)
			{
				System.out.println(str+" : ��");
			}
			
			else if(sss>=60)
			{
				System.out.println(str+" : ��");
			}
			
			else
			{
				System.out.println(str+" : ��");
			}
			
			
		}
		
		
	public void stand3_exe() //�Լ� ����
	  {
		
		
		stand2(kor,"����"); //�Լ� ���� ��ɾ� �ϱ��Ұ�
	    stand2(mat,"����"); 
		stand2(eng,"����"); 
		stand2(sci,"����"); 
		
	 }
}
		
		

