package Date617;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class DB_CONN_CREATE 
{
	//java.sql.* -> java���� sql�� ���õ� API
    //connection class -> java���� �����Ǵ� API -> DB������ ����
	//Statement class -> �������� ����
	//Resultset class -> DB�� �ִ� ���̺��� ������ �����ͼ� �����ϴ� ��
	                 //  ���α׷����� ����� �������� ���Ǵ� ����
	 public static void main(String[] args) throws SQLException//�����Լ��� ����ӽ�
	 {
		 
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java?useSSL=false","root","apmsetup");
		
			Statement stmt=conn.createStatement();
			
			String sql="create table test(aa int)";
			
			stmt.executeUpdate(sql);
			
			stmt.close();//������ Ŀ�ؼ��� �ݾ��ֱ� ���� ��ɾ�
			conn.close();//������ Ŀ�ؼ��� �ݾ��ֱ� ���� ��ɾ�
			
		 //��Ŭ�������� ���ܰ� �߻��Ҽ� ������ ��� ������ �ƴ�
		 
		 /* ����ó��
		  * 
		  * public void �Լ�()
		  * {
		  *    ���๮: ���ܰ� �߻��� �� �ִ� ������ ��� -> ����ó�� ��� ����
		  * }
		  * 1. try-catch���� ���ؼ� (���ܹ߻��� ���α׷� ���� -> ���α׷��� ��� ����)
		  * public void �Լ� ()
		  * {
		  *    try
		  *    {
		  *     ���๮
		  *    }
		  *     catch(����Ŭ���� ������ e) // ����Ŭ�������� ���๮���� �߻� ���� ������ ����
		  *    {
		  *     ���� ���๮���� ������ �߻����� ��� ������ ������ ����
		  *    }
		  * }
		  * 2. throw�� ���� ����ó�� // ���� �����ϱ� �ϰ� �˾Ƽ��� �Լ��� ȣ���� ������ �����°�(���ܸ� �����°�)
		  *                   // ������ �Ҷ� 
		  * public void �Լ�()
		  * {
		  *   ���๮: // ���� �߻��� Ʈ���� ĳġ�� �ƴϰ� throw�� ���ܸ� �ѱ��
		  * }
		  * 
		  * public static void main (String[] args) //���� �Լ����� ����ó���� �޾Ƽ� ���� �ϴ� ��
		  * {
		  * 
		  *   try
		  *    {
		  *     �Լ���(): //���ο��� ���� �Լ��� ȣ���ߴٰ� �Ҷ�
		  *    }
		  *     catch(����Ŭ���� ������ e)
		  *    {
		  *     ���� ���๮���� ������ �߻����� ��� ������ ������ ����
		  *    }
		  *   
		  * }
		  * 
		  * 
		  * 
		  * 
		  * 
		  * 
		  * 
		  * 
		  * 
		  * 
		  * */
		 
	 }
}
