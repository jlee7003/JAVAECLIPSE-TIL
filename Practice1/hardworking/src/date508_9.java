import java.util.Scanner;

public class date508_9 
{

	Scanner sc=new Scanner(System.in);

	int num;
	
	
   public void input(int num1,int num2) //변수 int num1,num2는
   //외부에서 가져올것
   {
	  num=num1;
	  num1=num2;
	  num2=num;
	  
	  System.out.print(num1+" "+num2);
	  
   }

}
