import java.sql.*;

public class DB_CONN 
{
  // java.sql.* => java���� sql�� ���õ�  API 
  // Connection Class =>  DB������ ����
  // Statment Class => �������� ����
  // ResultSet Class => DB�� �ִ� ���̺��� ������ �����ͼ� �����ϴ°�
  //                    ���α׷����� ����� ����
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
