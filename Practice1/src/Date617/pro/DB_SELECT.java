import java.sql.*;

public class DB_SELECT
{
	public static void main(String[] args) throws SQLException 
	{
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false","root","1234");
		Statement stmt=conn.createStatement();
		
		String sql="select * from member";
		ResultSet rs=stmt.executeQuery(sql);
		rs.last(); // rs��ü�� ���峡���� �̵�
	    int len=rs.getRow(); // ���ڵ��� ������ len������ ����
	    rs.first(); // rs��ü�� ù��° ���ڵ�� �̵�
	    // �̸� , ��ȭ��ȣ, ����, �ּ� ���� ����ϱ�
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
















