import java.sql.SQLException;
import java.util.Scanner;

public class Member_Main
{
	public static void main(String[] args) throws SQLException
	{
		Member_DB mdb=new Member_DB();
		Scanner sc=new Scanner(System.in);
		int chk;
		do
		{
			System.out.println("1. 회원출력하기");
			System.out.println("2. 회원입력하기");
			System.out.println("3. 회원수정하기");
			System.out.println("4. 회원삭제하기");
			System.out.println("5. 종료하기");
		
			
			System.out.print("무엇을 하겠습니까? ");
			chk=sc.nextInt();
			
			switch(chk)
			{
		  	   case 1: mdb.select(); break;
		  	   case 2: mdb.insert(); break;// 입력메소드실행 ;
		  	   case 3: mdb.update(); break;
		  	   case 4: mdb.delete(); break;
			}
		}while(chk!=5); 
		
	}
}












