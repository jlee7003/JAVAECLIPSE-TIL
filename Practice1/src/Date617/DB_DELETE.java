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
		 System.out.print("��� ���ڵ带 ���ﲫ����? :");
		 String IDI = sc.next();
				 
		 String sql="delete from member where id='"+IDI+"'";
		 
		 System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
		 
		 stmt.executeUpdate(sql);
		 
		 stmt.close();//������ Ŀ�ؼ��� �ݾ��ֱ� ���� ��ɾ�
		 conn.close();
	}
	
}
