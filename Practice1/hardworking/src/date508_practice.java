import java.util.Scanner;
public class date508_practice
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
   
   public void cal(int sss,String str)
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
		   {
		   case 1: cal(kor,"����"); break;
		   case 2: cal(kor,"����"); break;
		   case 3: cal(kor,"����"); break;
		   }
	   }
	   
   
}
 