import java.util.Scanner;
public class test6 
{
	 public static void main(String[] args)
	 {
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println("a ���� b ������ 3�� ����� �ƴ� ���� ��½ý��� �Դϴ�.");
		 System.out.print("a�� ���� �Է��Ͻʽÿ� :");
		 int num=sc.nextInt();
		 System.out.print("b�� ���� �Է��Ͻʽÿ� :");
		 int num1=sc.nextInt();
		 int num2=0;
	
		  for(int i=num;i<=num1;i++)
		  {
			 
			  if(i %3!=0)
			  {
				  num2=num2+i;
			  }
			  
			  
		  }
		  System.out.println(num + "���� " + num1 +"������ 3����� �ƴ� ���� ���� :" + num2 + "�Դϴ�.");
		
		  
	 }
			
}
		 
