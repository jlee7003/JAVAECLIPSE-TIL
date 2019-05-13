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
		public void stand2(int sss,String str)//출력, 계산 ()안의 sss와 str은 
		                                     // 함수 안의 변수로 취급
		{                                    //매게변수 값을 받아서 전달해주는 변수
		
			if(sss>=90)
			{
				System.out.println(str+" : 수");
			}
			
			else if(sss>=80)
			{
				System.out.println(str+" : 우");
			}
			
			else if(sss>=70)
			{
				System.out.println(str+" : 미");
			}
			
			else if(sss>=60)
			{
				System.out.println(str+" : 양");
			}
			
			else
			{
				System.out.println(str+" : 가");
			}
			
			
		}
		
		
	public void stand3_exe() //함수 실행
	  {
		
		
		stand2(kor,"국어"); //함수 실행 명령어 암기할것
	    stand2(mat,"수학"); 
		stand2(eng,"영어"); 
		stand2(sci,"과학"); 
		
	 }
}
		
		

