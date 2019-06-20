import java.sql.*;

public class DB_SELECT
{
	public static void main(String[] args) throws SQLException 
	{
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false","root","1234");
		Statement stmt=conn.createStatement();
		
		String sql="select * from member";
		ResultSet rs=stmt.executeQuery(sql);
		rs.last(); // rs객체의 가장끝으로 이동
	    int len=rs.getRow(); // 레코드의 갯수를 len변수에 저장
	    rs.first(); // rs객체의 첫번째 레코드로 이동
	    // 이름 , 전화번호, 나이, 주소 전부 출력하기
	    for(int i=1;i<=len;i++)
	    {
	      System.out.printf("%15s",rs.getString("phone"));
	      System.out.printf("%4s",rs.getString("age"));
	      System.out.printf("%10s",rs.getString("juso"));
	      System.out.printf("%10s",rs.getString("name"));
	      rs.next();
	      System.out.println();
	    }
	}
}
















