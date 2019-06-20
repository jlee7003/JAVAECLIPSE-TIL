import java.sql.SQLException;
import java.util.Scanner;

public class While
{
	public static void main(String[] args) throws SQLException
	{
		Member_DB mdb=new Member_DB();
		Scanner sc=new Scanner(System.in);
		int ch2;
		do
		{
			System.out.println("1. 회원출력하기");
			System.out.println("2. 회원입력하기");
			System.out.println("3. 종료하기");
			
			System.out.print("무엇을 하겠습니까? ");
			ch2=sc.nextInt();
			
			switch(ch2)
			{
		  	   case 1: mdb.select(); break;
		  	   case 2: mdb.insert(); break;// 입력메소드실행 ;
			}
		}while(ch2!=3); // ch2이라는 변수가 0이 아니면 참 
		
		/*
		int ch1=0;
		while(ch1!=0) // ch1이라는 변수가 0이 아니면 참
		{
			System.out.println("while");
		}
		*/
		
	}
}
