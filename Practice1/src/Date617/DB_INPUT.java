package Date617;

import java.sql.*;

import java.util.Scanner;
public class DB_INPUT 
{
	public static void main(String[] args) throws SQLException 
	{
		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false","root","1234");
		 Scanner sc=new Scanner(System.in);
		 Statement stmt=conn.createStatement();
		 
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
		 
		 stmt.close();//������ Ŀ�ؼ��� �ݾ��ֱ� ���� ��ɾ�
		 conn.close();
	}
	
	
}
