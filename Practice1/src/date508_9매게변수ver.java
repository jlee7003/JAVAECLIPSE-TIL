import java.util.Scanner;

public class date508_9 
{

	Scanner sc=new Scanner(System.in);
 
	int num;

   public void input(int num1, int num2) // 매게변수로 num1 과 num2로 지정
   {
	  num=num1;
	  num1=num2;
	  num2=num;
	  
	  System.out.print(num1+" "+num2);
   }
      
      

}
