import java.sql.*;

public class DB_CONN 
{
  // java.sql.* => java에서 sql과 관련된  API 
  // Connection Class =>  DB서버와 연결
  // Statment Class => 쿼리문의 실행
  // ResultSet Class => DB에 있는 테이블의 내용을 가져와서 저장하는곳
  //                    프로그램에서 사용할 목적
	public static void main(String[] args) throws SQLException
	{
		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false","root","1234");
		 
		 Statement stmt=conn.createStatement();
		 
		 String sql="create table test(aa int)";
		 
		 stmt.executeUpdate(sql);
	 
		 stmt.close();
		 conn.close();
	}
}
