package Date617;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_MEM 
{
	/*Ŭ�������� ������ ������ �Լ����� ������ �Ȱ��� �̸��� ������ �ٸ� ������
	->�Լ��� ����� ���� ���� ã�� �� ���� ���� ������ ������ ���ٸ� ���� ������ �������� �� 
	 ��������(�Լ� ��),��������(�Լ� ��)*/
	//Ŭ������ �Ӽ��� �޼ҵ�� ���� �Ǿ��ִ�.
	//�ܺο��� �Էµ� �̸�,��ȭ��ȣ,���̸� �����ͼ�
	//name char(10) not null -> name ���� �ʼ���
	Connection conn;//���α׷��־��� DB������ ���� 
	Statement stmt;// DB������ ������ ������ Ŭ����
	
	
	DB_MEM() throws SQLException
	{//connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false","root","1234");
	  //-> �̷��� �ϸ� ���������� �Ǿ� ������ connection�� �ʱ�ȭ�Ǿ� java.lang.NullPointerException error�� �߻��Ѵ�.
		conn= DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false","root","1234");
	 stmt=conn.createStatement();
	}


	 public void insert(String name,String phone,int age) throws SQLException
	  { //�Էµ� ���� member2 ���̺� ����
         String sql="insert into member2(name, phone, age) values('"+name+"','"+phone+"',"+age+")";
		 
		 System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
				 
		 stmt.executeUpdate(sql);
      }
	 
	 

	 public void insert(String name,String phone,int age,String juso) throws SQLException
	  { //�Էµ� ���� member2 ���̺� ����
	 String sql="insert into member(name, phone, age, juso) values('"+name+"','"+phone+"',"+age+",'"+juso+"')";
	 
	 System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
			 
	 stmt.executeUpdate(sql);
	  }
	 //�Ű������� 4����� member table�� ���� �ִ� �޼ҵ带 ������
	 
}
