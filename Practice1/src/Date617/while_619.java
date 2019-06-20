package Date617;
import java.sql.SQLException;
import java.util.Scanner;
public class while_619 
{

	public static void main(String[] args) 
	{
		 int ch2=0;
 try 
 {
	 member_DB mdb=new member_DB();
	    Scanner sc=new Scanner(System.in);
	 
	 do //먼저 실행후 뒤에 조건을 검색함,무조건 실행후 조건을 검색
	 {
		
			/*int ch1=0;
			int ch2=0;
		 while(ch1!=0)//조건에 따라 실행
		 {
			 System.out.println("while");
		 }
		 */
			
		    
		 System.out.println("1. 회원출력하기");
		 System.out.println("2. 회원입력하기");
		 System.out.println("3. 회원삭제하기");
		 System.out.println("4. 회원수정하기");
		 System.out.println("5. 종료하기");
		 
		 System.out.print("입력 :");
		 ch2=sc.nextInt();
		 
		 switch(ch2)
		 {
		 case 1: mdb.select(); break;//출력메소드 실행
		 case 2: mdb.insert(); break;//입력 메소드 실행
		 case 3: mdb.delete(); break;//삭제 메소드 실행
		 case 4: mdb.update(); break;//수정 메소드 실행
		 }
	 }while(ch2!=5);//5을 누르면 종료됨 ,5이 아니라면 무한 반복

 }
 catch(Exception e)
 {
	 
 }
 
	}

}
