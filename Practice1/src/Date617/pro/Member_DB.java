import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Member_DB // member���̺���� �˻�,�Է�,����,����
{
	Connection conn;
	Statement stmt; 
	Scanner sc;  // Ŭ������ ��������� ����
	
	Member_DB() throws SQLException // ��ü���������� �����ڸ� ���Ͽ�
	{
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false","root","1234");
		stmt=conn.createStatement();
		sc=new Scanner(System.in);
	}
	
	public void insert() throws SQLException
	{
		System.out.print("�̸� : ");
		String name=sc.next();
		   
		System.out.print("��ȭ��ȣ : ");
		String phone=sc.next();
		   
		System.out.print("���� : ");
		String age=sc.next();
		  
		System.out.print("�ּ� : ");
		String juso=sc.next();

		String sql="insert into member(name,phone,age,juso) ";
		sql=sql+" values('"+name+"','"+phone+"',"+age+",'"+juso+"')";
			 
		stmt.executeUpdate(sql);
	}
	public void select() throws SQLException
	{
		String sql="select * from member";
		ResultSet rs=stmt.executeQuery(sql);
		rs.last(); // rs��ü�� ���峡���� �̵�
	    int len=rs.getRow(); // ���ڵ��� ������ len������ ����
	    rs.first(); // rs��ü�� ù��° ���ڵ�� �̵�
	    // �̸� , ��ȭ��ȣ, ����, �ּ� ���� ����ϱ�
	    for(int i=1;i<=len;i++)
	    {
	      System.out.printf("%3s",rs.getString("id"));
	      System.out.printf("%15s",rs.getString("phone"));
	      System.out.printf("%4s",rs.getString("age"));
	      System.out.printf("%10s",rs.getString("juso"));
	      System.out.printf("%10s",rs.getString("name"));
	      rs.next();
	      System.out.println();
	    }
	}
	public void update() throws SQLException
	{
		System.out.println("������ ���ڵ��� id�� �Է��ϼ���");
		int id=sc.nextInt();
		System.out.println("1�� �̸�, 2�� ��ȭ��ȣ, 3�� ����, 4�� �ּ�");
		int ch=sc.nextInt();
		System.out.println("������ ���� �Է��Ͻÿ�");
		String chg=sc.next();
		
		String ppp="";
		
		switch(ch)
		{
		  case 1: ppp="name='"+chg+"'"; break; // name='�̸�'
		  case 2: ppp="phone='"+chg+"'"; break; // phone='��ȭ��ȣ'
		  case 3: ppp="age="+chg; break; // age=����
		  case 4: ppp="juso='"+chg+"'"; break; // juso='�ּ�'
		}
		
		 String sql="update member set "+ppp+" where id="+id;
		           // update member set name='ȫ�浿' where id=3 
		 stmt.executeUpdate(sql);
		
		
		
	}
	public void delete() throws SQLException
	{
		// ������ ���ڵ��� id�� �Է¹޴���.
		System.out.print("������ ���ڵ��� id�� �Է��ϼ��� : ");
		int id=sc.nextInt();
		// ������ �������� �ۼ�
		String sql="delete from member where id="+id;
		// ���� ����
		stmt.executeUpdate(sql);
	}
}








