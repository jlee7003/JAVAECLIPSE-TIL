package date524;


public class Test1 
{
   int num1;
   int num2;
   // ��ü�� �����Ҷ� num1�� num2�� ���� �������ÿ�
   Test1(int num1,int num2)
   {
	   this.num1=num1; //System.out.println(num1);
	   this.num2=num2; //System.out.println(num2);
   }
   
   public void hap()
   {
	   // num1�������� num2������ ���� ���Ͻÿ�.
	   int sum = 0;
	   for(int i=num1;i<=num2;i++)
	   {
		   sum=sum+i;
	   }
	   System.out.println(sum);
   }
}
