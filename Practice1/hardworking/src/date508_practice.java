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
			System.out.println(str+" : 수");
		}
		
		else if(sss>=80)
		{
			System.out.println(str+" : 우");
		}
		
		else if(sss>=60)
		{
			System.out.println(str+" : 미");
		}
		
		else if(sss>=50)
		{
			System.out.println(str+" : 양");
		}
		
		else
		{
			System.out.println(str+" : 가");
		}

   }
   
	   public void output()
	   {
		   switch(sel) 
		   {
		   case 1: cal(kor,"국어"); break;
		   case 2: cal(kor,"국어"); break;
		   case 3: cal(kor,"국어"); break;
		   }
	   }
	   
   
}
 