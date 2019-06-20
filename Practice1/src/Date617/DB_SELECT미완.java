package Date617;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_SELECT미완 
{

	public static void main(String[] args) throws SQLException
    {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false","root","1234");
		
		Statement stmt=conn.createStatement();
		
		

		String sql="select * from member";
		
		ResultSet rs; // 테이블내용을 읽어와서 저장할 공간
		rs=stmt.executeQuery(sql);//select 명령을 실행한 결과값을 rs에 저장 ,항목으로 불러야함
		rs.last(); //rs객체의 가장 끝으로 이동
		//first, beforefirst
		int len=rs.getRow(); //레코드의 갯수를 len 변수에 저장
		rs.first();//rs.last(); ->레코드 포인트를 마지막 레코드행으로 지정 
		//이름,전화번호,나이,주소 전부 출력하기;
	    // System.out.Printf("%10s",rs.getString("name"));
		                     //10칸 짜리 문자열로 출력하라 %는 s가 문자열임을 표현
		for(int i=1;i<=len;i++)
		{
		System.out.printf("%15s",rs.getString("id"));
		System.out.print("/");
		System.out.printf("%15s",rs.getString("name"));
		System.out.print("/");
		System.out.printf("%15s",rs.getString("phone"));
		System.out.print("/");
		System.out.printf("%15s",rs.getString("age"));
		System.out.print("/");
		System.out.printf("%15s",rs.getString("juso"));
		rs.next();
		System.out.println();
		}
		

		
		
		
		
		stmt.close();//데이터 커넥션을 닫아주기 위한 명령어
		conn.close();//데이터 커넥션을 닫아주기 위한 명령어
		
	}

}
