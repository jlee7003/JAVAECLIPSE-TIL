import java.util.Scanner;
public class date513_1 

{
	Scanner sc=new Scanner(System.in);
	
	
	int kor;
	int mat;
	int eng;
	int sci;
	int sss;
	String str;
	
	public void stand1()
	{   
		kor=sc.nextInt();
		mat=sc.nextInt();
		eng=sc.nextInt();
		sci=sc.nextInt();
		sss=sc.nextInt();
		str=sc.next();
		
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
	public void stand2()
	{
		System.out.print(str+":"+sss);
	}
}
