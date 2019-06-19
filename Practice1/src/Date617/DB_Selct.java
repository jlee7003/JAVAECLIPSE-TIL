package Date617;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class DB_Selct;
{

	public static void main(String[] args) throws SQLException
    {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false","root","1234");
		Scanner sc=new Scanner(System.in);
		Statement stmt=conn.createStatement();
		
		
		int IDI=sc.nextInt();
		String sql="select * from member where id="+IDI+"";
		
		ResultSet rs; // 테이블내용을 읽어와서 저장할 공간
		
		rs=stmt.executeQuery(sql);//select 명령을 실행한 결과값을 rs에 저장 ,항목으로 불러야함
		
		
		rs.next(); // 레코드 포인터를 아래로 한칸 내려주는 명령어 첫번째 레코드
		System.out.println(rs.getString("name"));
		System.out.println(rs.getString("age"));
		System.out.println(rs.getString("juso"));
		
		System.out.Println(rs.last);
		
		
		stmt.close();//데이터 커넥션을 닫아주기 위한 명령어
		conn.close();//데이터 커넥션을 닫아주기 위한 명령어
		
	}

}
