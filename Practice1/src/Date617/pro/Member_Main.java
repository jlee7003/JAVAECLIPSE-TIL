import java.sql.SQLException;
import java.util.Scanner;

public class Member_Main
{
	public static void main(String[] args) throws SQLException
	{
		Member_DB mdb=new Member_DB();
		Scanner sc=new Scanner(System.in);
		int chk;
		do
		{
			System.out.println("1. ȸ������ϱ�");
			System.out.println("2. ȸ���Է��ϱ�");
			System.out.println("3. ȸ�������ϱ�");
			System.out.println("4. ȸ�������ϱ�");
			System.out.println("5. �����ϱ�");
		
			
			System.out.print("������ �ϰڽ��ϱ�? ");
			chk=sc.nextInt();
			
			switch(chk)
			{
		  	   case 1: mdb.select(); break;
		  	   case 2: mdb.insert(); break;// �Է¸޼ҵ���� ;
		  	   case 3: mdb.update(); break;
		  	   case 4: mdb.delete(); break;
			}
		}while(chk!=5); 
		
	}
}












