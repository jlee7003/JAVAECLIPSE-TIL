import java.sql.*;
import java.util.Scanner;

public class DB_INPUT 
{
	public static void main(String[] args) throws SQLException 
	{
	   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false","root","1234");
	   Statement stmt=conn.createStatement();
   
	   Scanner sc=new Scanner(System.in);
   
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
	   
	   stmt.close();
	   conn.close();
	}
}
