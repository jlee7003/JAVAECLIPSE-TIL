import java.util.Scanner;

public class date508_11 
{
	Scanner sc=new Scanner(System.in);
	
    
    int num=sc.nextInt();
    int num1=sc.nextInt();
    int num2=sc.nextInt();

	
	public void input() 
	{
		if(num > num2 && num > num1 && num1 > num2 )
	      { 
	    	  System.out.println(num +" "+ num1+" "+num2 );
	    	
	      }
	      
	      else if(num > num2 && num > num1 && num1 < num2 )
	      { 
	    	  System.out.println(num +" "+ num2+" "+num1 );
	    	
	      }
	      
	      else if( num1 > num2 && num1 > num && num2 > num )
	      {
	    	  System.out.println(num1 +" "+ num2+" "+num);
	      }
	      
	      else if( num1 > num2 && num1 > num && num2 < num )
	      {
	    	  System.out.println(num1 +" "+ num+" "+num2);
	      }
	      
	      else if( num2 > num1 && num2 > num1 && num > num1 )
	      {
	    	  System.out.println(num2 +" "+ num+" "+num1);
	      }
	      
	      else if( num2 > num1 && num2 > num1 && num < num1 )
	      {
	    	  System.out.println(num2 +" "+ num1+" "+num);
	      }
	}
      
      


}
