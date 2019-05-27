package date524;
public class Test4
{
   int num1;
   int num2;
   
   private Test4(int num1,int num2)
   {
	  this.num1=num1;
	  this.num2=num2;
	  
   }
   
   public static Test4 getT4(int num1,int num2)
   {
	   Test4 ss= new Test4(num1,num2);
	   return ss;
   }
   // 생성자의 접근제한자가 private이다 싱글톤을 이용하여 
   // 객체를 생성하시오.
   public void aadi()
   {
	   System.out.println(num1+" "+num2);
   }
   
}
