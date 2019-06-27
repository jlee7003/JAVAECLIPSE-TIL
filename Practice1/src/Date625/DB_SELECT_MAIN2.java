package Date625;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DB_SELECT_MAIN2
{
	public static void main(String[] args) throws SQLException 
	{	/*1. do while문 만들고
	      2. 출력 매뉴 만들기
	      3. while의 조건식 성립유무 확인하기
		     */
         		
		int chk=0;
		DB_SELECT2 aa1=new DB_SELECT2();//생성자에 예외처리를 부른 놈이 처리하라고 명령해서 빨간 줄이 뜨게 됨
		Scanner sc=new Scanner(System.in); // 입력클래스 생성
		do//while 반복문의 변형으로 무조건 한번 실행하고 조건이 나오는 명령어
		{
			System.out.println("1.전체출력하기");
			System.out.println("2.이름검색");
			System.out.println("3.전화번호 검색");
			System.out.println("4.주소 검색");
			System.out.println("5.회원 입력");
			System.out.println("6.회원 삭제");
			System.out.println("7.통합검색하기");
			System.out.println("8.종료");
			System.out.println("키를 입력해주세요");
		    chk=sc.nextInt();
		    
		    //입력값에 따라 필요한 메소드
		    
		   switch(chk)
		   {
		   case 1: aa1.all_chul();  break;
		   case 2: aa1.name_chul();  break;
		   case 3: aa1.phone_chul();  break;
		   case 4: aa1.juso_chul();  break;
		   case 5: aa1.insert(); break;
		   case 6: aa1.delete(); break;
		   case 7:{System.out.println("1부터 4의 숫자를 입력하십시오");
		        int nn=sc.nextInt();
			   aa1.search(nn); break;}
		   //default://case 이외의 값이 들어오게 된 경우
		   }
		   
		   
		    
		    
		}while(chk!=8);//조건의 값이 true 값이라면 계속 반복 되고 false가 되면 중지하게 됨
	System.out.println("종료되었습니다.");
	}

}
