package Date617;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DB_UPDATE 
{

	public static void main(String[] args) throws SQLException
	{
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false","root","1234");
		Scanner sc=new Scanner(System.in);
		Statement stmt=conn.createStatement();
		
		//.out.println("�����Ͻ� �̸����� �����Դϱ�?");
		// String b = sc.next();
		//System.out.println("�����Ͻ� �޴���ȭ��ȣ�� �Է����ּ���");
		// String c = sc.next();
		// System.out.println("�����Ͻ� �ּҸ� �Է����ּ���");
		// String a = sc.next();
		 //System.out.println("�����Ͻ� ���̸� �Է����ּ���");
		// String d = sc.next();
		 System.out.println("�����Ͻ� ���̵�� �����Դϱ�?");
		 int id = sc.nextInt();
		 System.out.println("1:�̸�/2:��ȭ��ȣ/3:�ּ�/4:����");
		 int ch = sc.nextInt();
		 String ppp=""; //sql���� ������ ���⿡ ""���� �ϴ� ���� �����
		 switch(ch)
		 {
		  case 1:System.out.print("�����Ͻ� �̸� ���� �Է��Ͻÿ�");
			  String b = sc.next();
			  ppp="name='"+b+"'"; break;
		  case 2:System.out.print("�����Ͻ� ��ȭ ���� �Է��Ͻÿ�");
			  String c = sc.next();
			  ppp="phone='"+c+"'"; break;
		  case 3:System.out.print("�����Ͻ� �ּ� ���� �Է��Ͻÿ�");
			  String a = sc.next();
			  ppp="juso='"+a+"'"; break;
		  case 4:System.out.print("�����Ͻ� ���� ���� �Է��Ͻÿ�");
			  String d = sc.next();
			  ppp="age='"+d+"'"; break;
		 }
		//String sql="update guest set name='"+b+"',phone='"+c+"',juso='"+a+"',age='"+d+"'  where id="+id;
		String sql="update member set "+ppp+"where id="+id;
		//"String ppp="name='ȫ�浿'";
		stmt.executeUpdate(sql);
		System.out.println("�Է��� �Ϸ� �Ǿ����ϴ�.");
		stmt.close();//������ Ŀ�ؼ��� �ݾ��ֱ� ���� ��ɾ�
		conn.close();//������ Ŀ�ؼ��� �ݾ��ֱ� ���� ��ɾ�

	}

}
