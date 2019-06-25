package Date617;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DB_UPDATE 
{

	public static void main(String[] args) throws SQLException
	{
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false","root","1234");
		Scanner sc=new Scanner(System.in);
		Statement stmt=conn.createStatement();
		
		//.out.println("변경하실 이름명은 무엇입니까?");
		// String b = sc.next();
		//System.out.println("변경하실 휴대전화번호를 입력해주세요");
		// String c = sc.next();
		// System.out.println("변경하실 주소를 입력해주세요");
		// String a = sc.next();
		 //System.out.println("변경하실 나이를 입력해주세요");
		// String d = sc.next();
		 System.out.println("변경하실 아이디는 무엇입니까?");
		 int id = sc.nextInt();
		 System.out.println("1:이름/2:전화번호/3:주소/4:나이");
		 int ch = sc.nextInt();
		 String ppp=""; //sql에서 오류가 나기에 ""으로 일단 값을 줘야함
		 switch(ch)
		 {
		  case 1:System.out.print("변경하실 이름 값을 입력하시오");
			  String b = sc.next();
			  ppp="name='"+b+"'"; break;
		  case 2:System.out.print("변경하실 전화 값을 입력하시오");
			  String c = sc.next();
			  ppp="phone='"+c+"'"; break;
		  case 3:System.out.print("변경하실 주소 값을 입력하시오");
			  String a = sc.next();
			  ppp="juso='"+a+"'"; break;
		  case 4:System.out.print("변경하실 나이 값을 입력하시오");
			  String d = sc.next();
			  ppp="age='"+d+"'"; break;
		 }
		//String sql="update guest set name='"+b+"',phone='"+c+"',juso='"+a+"',age='"+d+"'  where id="+id;
		String sql="update member set "+ppp+"where id="+id;
		//"String ppp="name='홍길동'";
		stmt.executeUpdate(sql);
		System.out.println("입력이 완료 되었습니다.");
		stmt.close();//데이터 커넥션을 닫아주기 위한 명령어
		conn.close();//데이터 커넥션을 닫아주기 위한 명령어

	}

}