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
   // �������� ���������ڰ� private�̴� �̱����� �̿��Ͽ� 
   // ��ü�� �����Ͻÿ�.
   public void aadi()
   {
	   System.out.println(num1+" "+num2);
   }
   
}
