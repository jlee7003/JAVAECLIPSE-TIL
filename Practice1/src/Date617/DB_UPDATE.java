package Date617;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_UPDATE 
{

	public static void main(String[] args) throws SQLException
	{
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java?useSSL=false","root","apmsetup");
		
		Statement stmt=conn.createStatement();
		
		String sql="update guest set name='"+b+"',phone='"+c+"' where id="+id;
		
		stmt.executeUpdate(sql);
		
		stmt.close();//������ Ŀ�ؼ��� �ݾ��ֱ� ���� ��ɾ�
		conn.close();//������ Ŀ�ؼ��� �ݾ��ֱ� ���� ��ɾ�

	}

}
