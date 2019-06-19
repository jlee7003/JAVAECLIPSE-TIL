package Date617;

import java.sql.*;

import java.util.Scanner;
public class DB_INPUT 
{
	public static void main(String[] args) throws SQLException 
	{
		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false","root","1234");
		 Scanner sc=new Scanner(System.in);
		 Statement stmt=conn.createStatement();
		 
		 System.out.print("이름을 입력해주세요 :");
		 String nameI = sc.next();
		//sc.nextLine();-> 비어있는 값이 있을 경우 입력
		 System.out.print("전화번호를 입력해주세요 :");
		 String phoneI= sc.next();
		
		 System.out.print("주소를 넣어주세요 :");
		 String jusoI = sc.next();
		 System.out.print("나이를 입력해주세요 :");
		 int ageI = sc.nextInt();
		 String sql="insert into member(name, phone, age, juso) values('"+nameI+"','"+phoneI+"',"+ageI+",'"+jusoI+"')";
		 
		 System.out.println("입력이 완료되었습니다.");
		
		 
		 
		 stmt.executeUpdate(sql);
		 
		 stmt.close();//데이터 커넥션을 닫아주기 위한 명령어
		 conn.close();
	}
	
	
}
