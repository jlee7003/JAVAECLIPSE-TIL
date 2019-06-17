package Date617;

import java.sql.*;
import java.util.Scanner;
public class DB_INPUT 
{
	public static void main(String[] args) throws SQLException 
	{
		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java?useSSL=false","root","apmsetup");
		 Scanner sc=new Scanner(System.in);
		 Statement stmt=conn.createStatement();
		 System.out.println("이름을 입력해주세요");
		 String nameI = sc.next();
		 System.out.println("전화번호를 입력해주세요");
		 String phoneI= sc.next();
		 System.out.println("나이를 입력해주세요");
		 int ageI = sc.nextInt();
		 System.out.println("값을 넣어주세요");
		 int payI = sc.nextInt();
		 
		 String sql="insert into member(name, phone, age, pay) values('"+nameI+"','"+phoneI+"',"+ageI+","+payI+")";
		 
		 System.out.println("입력이 완료되었습니다.");
		 
		 stmt.executeUpdate(sql);
		 
		 stmt.close();//데이터 커넥션을 닫아주기 위한 명령어
		 conn.close();
	}
	
	
}
