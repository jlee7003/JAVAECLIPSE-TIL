package Date617;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_SELECT�̿� 
{

	public static void main(String[] args) throws SQLException
    {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java?useSSL=false","root","apmsetup");
		
		Statement stmt=conn.createStatement();
		
		String sql="select * from member";
		
		ResultSet rs; // ���̺����� �о�ͼ� ������ ����
		
		rs=stmt.executeQuery(sql);//select ����� ������ ������� rs�� ���� ,�׸����� �ҷ�����
		
		
		rs.next(); // ���ڵ� �����͸� �Ʒ��� ��ĭ �����ִ� ��ɾ� ù��° ���ڵ�
		System.out.println(rs.getString("name"));
		System.out.println(rs.getString("age"));
		System.out.println("<p>");
		
		stmt.executeUpdate(sql);
		
		stmt.close();//������ Ŀ�ؼ��� �ݾ��ֱ� ���� ��ɾ�
		conn.close();//������ Ŀ�ؼ��� �ݾ��ֱ� ���� ��ɾ�
		
	}

}
