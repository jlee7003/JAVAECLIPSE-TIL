package Date617;
import java.sql.SQLException;
import java.util.Scanner;
public class while_619 
{

	public static void main(String[] args) 
	{
		 int ch2=0;
 try 
 {
	 member_DB mdb=new member_DB();
	    Scanner sc=new Scanner(System.in);
	 
	 do //���� ������ �ڿ� ������ �˻���,������ ������ ������ �˻�
	 {
		
			/*int ch1=0;
			int ch2=0;
		 while(ch1!=0)//���ǿ� ���� ����
		 {
			 System.out.println("while");
		 }
		 */
			
		    
		 System.out.println("1. ȸ������ϱ�");
		 System.out.println("2. ȸ���Է��ϱ�");
		 System.out.println("3. ȸ�������ϱ�");
		 System.out.println("4. ȸ�������ϱ�");
		 System.out.println("5. �����ϱ�");
		 
		 System.out.print("�Է� :");
		 ch2=sc.nextInt();
		 
		 switch(ch2)
		 {
		 case 1: mdb.select(); break;//��¸޼ҵ� ����
		 case 2: mdb.insert(); break;//�Է� �޼ҵ� ����
		 case 3: mdb.delete(); break;//���� �޼ҵ� ����
		 case 4: mdb.update(); break;//���� �޼ҵ� ����
		 }
	 }while(ch2!=5);//5�� ������ ����� ,5�� �ƴ϶�� ���� �ݺ�

 }
 catch(Exception e)
 {
	 
 }
 
	}

}
