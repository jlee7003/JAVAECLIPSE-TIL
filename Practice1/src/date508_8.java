import java.util.Scanner;
public class date508_8 
{
	
	int kor;
	int eng;
	int mat;
	int sel;
	Scanner sc=new Scanner(System.in);
	
	public void input()
	{
		
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();
		sel=sc.nextInt();
		
	}
	
	public void newput(int sss,String str) //�Ű� ������ �޴� �Լ�
	{
		
		if(sss>=90)
		{
			System.out.println(str+" : ��");
		}
		
		else if(sss>=80)
		{
			System.out.println(str+" : ��");
		}
		
		else if(sss>=60)
		{
			System.out.println(str+" : ��");
		}
		
		else if(sss>=50)
		{
			System.out.println(str+" : ��");
		}
		
		else
		{
			System.out.println(str+" : ��");
		}

	}
	
	
	public void output()
	{	
		switch(sel)
		{case 1: newput(kor,"����"); break;
		 case 2: newput(eng,"����"); break;
		 case 3: newput(mat,"����"); break;
		 default: System.out.println("�߸� �Է�");
		}
		
		

	}

}
		


