package date524;

import java.util.Scanner;
public class Test2 
{
	Scanner sc=new Scanner(System.in);
    int start;
    int end;
	
	Test2()
   {
	   
	  start=1;
	  end=45;
	  
	  System.out.println(start+" "+end);
   }
	Test2(int end)
   {
	  start=1;	  
	  this.end=end;
	  System.out.println(start+" "+end);
   }
	Test2(int start,int end)
   {  
		this.start=start;
		this.end=end;
	  System.out.println(start+" "+end);
   }
  // �����ڸ� ���� start,end�� �������ÿ�(������ �����ε�)
  // �� ���� �Է����� ������ start=1 , end=45
  // ���� �ϳ��� �ԷµǸ�  start=1, end=�ԷµȰ�
  // ���� ���� �ԷµǸ� �Ѵ� �Էµ� ��
   
  public void random_gen()
  {
	 int random;
	 int ch=end-start+1;
	 random=(int)(Math.random()*ch)+start;
	 System.out.println(random);
		
  }
}
