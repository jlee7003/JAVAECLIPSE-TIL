package Date617;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class member_DB //member ���̺���� �˻� ,�Է� ,���� ,����
{
	Connection conn;
	Statement stmt; //�Ӽ��� ���� ���� ����� �����༭ ������ ���� �Ӽ����� ��� ���� �����Ѵ�. 
	                //�׷��Ƿ� ��ü�� ����� �����ڷ� Ȱ��
		Scanner sc;
		
		
member_DB() throws SQLException //��ü���������� �����ڸ� ���Ͽ� ����
{
	conn= DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false","root","1234");
	stmt=conn.createStatement();
	sc=new Scanner(System.in);
		 
}
  public void insert() throws SQLException
  {
	     System.out.print("�̸��� �Է����ּ��� :");
		 String nameI = sc.next();
		//sc.nextLine();-> ����ִ� ���� ���� ��� �Է�
		 System.out.print("��ȭ��ȣ�� �Է����ּ��� :");
		 String phoneI= sc.next();
		
		 System.out.print("�ּҸ� �־��ּ��� :");
		 String jusoI = sc.next();
		 System.out.print("���̸� �Է����ּ��� :");
		 int ageI = sc.nextInt();
		 String sql="insert into member(name, phone, age, juso) values('"+nameI+"','"+phoneI+"',"+ageI+",'"+jusoI+"')";
		 
		 System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
				 
		 stmt.executeUpdate(sql);
  }
  public void select() throws SQLException
  {
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
  }
  public void update() throws SQLException
  {
	  System.out.println("�����Ͻ� ���̵�� �����Դϱ�?");
		 int id = sc.nextInt();
		 System.out.println("1:�̸�/2:��ȭ��ȣ/3:�ּ�/4:����");
		 int ch = sc.nextInt();
		 String ppp=""; //sql���� ������ ���⿡ ""���� �ϴ� ���� �����
		 switch(ch)
		 {
		  case 1:System.out.print("�����Ͻ� �̸� ���� �Է��Ͻÿ� :");
			  String b = sc.next();
			  ppp="name='"+b+"'"; break;
		  case 2:System.out.print("�����Ͻ� ��ȭ ���� �Է��Ͻÿ� :");
			  String c = sc.next();
			  ppp="phone='"+c+"'"; break;
		  case 3:System.out.print("�����Ͻ� �ּ� ���� �Է��Ͻÿ� :");
			  String a = sc.next();
			  ppp="juso='"+a+"'"; break;
		  case 4:System.out.print("�����Ͻ� ���� ���� �Է��Ͻÿ� :");
			  String d = sc.next();
			  ppp="age="+d;
			  
		 }
		String sql="update member set "+ppp+" where id="+id;
		 stmt.executeUpdate(sql);
		System.out.println(sql);
  }
  public void delete() throws SQLException
  {
	  System.out.print("��� ���ڵ带 ���ﲫ����? :");
		 String IDI = sc.next();
				 
		 String sql="delete from member where id='"+IDI+"'";
		 
		 System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
		 
		 stmt.executeUpdate(sql);
  }
  
}
