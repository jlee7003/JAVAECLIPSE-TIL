import java.util.Scanner;
public class Tutorial1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=3;i++)
		 {
			System.out.print("���� ������ �Է��Ͻÿ�: ");		
			int a =sc.nextInt();		
			System.out.print("���� ������ �Է��Ͻÿ�: ");		
			int b =sc.nextInt();		
			System.out.print("���� ������ �Է��Ͻÿ�: ");		
			int c =sc.nextInt();
				
			if((a>100)||(b>100)||(c>100))		
			{
			 System.out.println("�߸��� ���Դϴ�.");
			}	
		
			else		
			{
			 System.out.println(("������ ������ �հ�� ")+(a+b+c)+("�Դϴ�. "));
			}	
			
		 }     
		
		
	}
	
}