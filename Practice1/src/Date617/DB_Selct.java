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
		
		ResultSet rs; // ���̺����� �о�ͼ� ������ ����
		
		rs=stmt.executeQuery(sql);//select ����� ������ ������� rs�� ���� ,�׸����� �ҷ�����
		
		
		rs.next(); // ���ڵ� �����͸� �Ʒ��� ��ĭ �����ִ� ��ɾ� ù��° ���ڵ�
		System.out.println(rs.getString("name"));
		System.out.println(rs.getString("age"));
		System.out.println(rs.getString("juso"));
		
		System.out.Println(rs.last);
		
		
		stmt.close();//������ Ŀ�ؼ��� �ݾ��ֱ� ���� ��ɾ�
		conn.close();//������ Ŀ�ؼ��� �ݾ��ֱ� ���� ��ɾ�
		
	}

}
