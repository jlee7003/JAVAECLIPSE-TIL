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
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false","root","1234");
		
		Statement stmt=conn.createStatement();
		
		

		String sql="select * from member";
		
		ResultSet rs; // ���̺����� �о�ͼ� ������ ����
		rs=stmt.executeQuery(sql);//select ����� ������ ������� rs�� ���� ,�׸����� �ҷ�����
		rs.last(); //rs��ü�� ���� ������ �̵�
		//first, beforefirst
		int len=rs.getRow(); //���ڵ��� ������ len ������ ����
		rs.first();//rs.last(); ->���ڵ� ����Ʈ�� ������ ���ڵ������� ���� 
		//�̸�,��ȭ��ȣ,����,�ּ� ���� ����ϱ�;
	    // System.out.Printf("%10s",rs.getString("name"));
		                     //10ĭ ¥�� ���ڿ��� ����϶� %�� s�� ���ڿ����� ǥ��
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
		

		
		
		
		
		stmt.close();//������ Ŀ�ؼ��� �ݾ��ֱ� ���� ��ɾ�
		conn.close();//������ Ŀ�ؼ��� �ݾ��ֱ� ���� ��ɾ�
		
	}

}
