package Date617;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DB_DELETE 
{
	public static void main(String[] args) throws SQLException 
	{
		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false","root","1234");
		 Scanner sc=new Scanner(System.in);
		 Statement stmt=conn.createStatement();
		 System.out.print("몇번 레코드를 지울껀가요? :");
		 String IDI = sc.next();
				 
		 String sql="delete from member where id='"+IDI+"'";
		 
		 System.out.println("입력이 완료되었습니다.");
		 
		 stmt.executeUpdate(sql);
		 
		 stmt.close();//데이터 커넥션을 닫아주기 위한 명령어
		 conn.close();
	}
	
}
