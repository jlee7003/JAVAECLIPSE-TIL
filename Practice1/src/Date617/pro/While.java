import java.sql.SQLException;
import java.util.Scanner;

public class While
{
	public static void main(String[] args) throws SQLException
	{
		Member_DB mdb=new Member_DB();
		Scanner sc=new Scanner(System.in);
		int ch2;
		do
		{
			System.out.println("1. ȸ������ϱ�");
			System.out.println("2. ȸ���Է��ϱ�");
			System.out.println("3. �����ϱ�");
			
			System.out.print("������ �ϰڽ��ϱ�? ");
			ch2=sc.nextInt();
			
			switch(ch2)
			{
		  	   case 1: mdb.select(); break;
		  	   case 2: mdb.insert(); break;// �Է¸޼ҵ���� ;
			}
		}while(ch2!=3); // ch2�̶�� ������ 0�� �ƴϸ� �� 
		
		/*
		int ch1=0;
		while(ch1!=0) // ch1�̶�� ������ 0�� �ƴϸ� ��
		{
			System.out.println("while");
		}
		*/
		
	}
}
