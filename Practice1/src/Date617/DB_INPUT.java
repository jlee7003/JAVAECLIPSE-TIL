package Date617;

import java.sql.*;
import java.util.Scanner;
public class DB_INPUT 
{
	public static void main(String[] args) throws SQLException 
	{
		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java?useSSL=false","root","apmsetup");
		 Scanner sc=new Scanner(System.in);
		 Statement stmt=conn.createStatement();
		 System.out.println("�̸��� �Է����ּ���");
		 String nameI = sc.next();
		 System.out.println("��ȭ��ȣ�� �Է����ּ���");
		 String phoneI= sc.next();
		 System.out.println("���̸� �Է����ּ���");
		 int ageI = sc.nextInt();
		 System.out.println("���� �־��ּ���");
		 int payI = sc.nextInt();
		 
		 String sql="insert into member(name, phone, age, pay) values('"+nameI+"','"+phoneI+"',"+ageI+","+payI+")";
		 
		 System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
		 
		 stmt.executeUpdate(sql);
		 
		 stmt.close();//������ Ŀ�ؼ��� �ݾ��ֱ� ���� ��ɾ�
		 conn.close();
	}
	
	
}
