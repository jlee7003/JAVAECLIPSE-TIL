import java.util.Scanner;
public class Stand {

	//Ŭ������ �Ӽ��� �޼ҵ�� �����ȴ�.
	//������� �ϴ� ���α׷��� �ʿ��� �Ӽ�, �޼ҵ�
	
	//�� ���� �Է��Ͽ� ���� ����Ͻÿ�
	
	//�Ӽ�: �ʿ��� ������ �����.
	Scanner sc=new Scanner(System.in);
	    int num1;
	    int num2;
	    int num3;
	    int num4;
	    int num5;
	    int sum;
	  
	    int firstnum;
		int lastnum;
		int num=0;
	    int changefx;
	    // ------------------------�Է��Լ�-----------------------------
	    public void input2()
	    {
	    	
	    	num1=sc.nextInt();
	    	num2=sc.nextInt();
	    }
	    
	    public void input3()
	    {
	    
	    	num1=sc.nextInt();
	    	num2=sc.nextInt();
	    	num3=sc.nextInt();
	    }
	    
	    public void input4()
	    {
	    	
	    	num1=sc.nextInt();
	    	num2=sc.nextInt();
	    	num3=sc.nextInt();
	    	num4=sc.nextInt();
	    }
	    
	    public void input5()
	    {
	    
	    	num1=sc.nextInt();
	    	num2=sc.nextInt();
	    	num3=sc.nextInt();
	    	num4=sc.nextInt();
	    	num5=sc.nextInt();
	    }
	    
	    public void atobsuminput()
		{
			firstnum=sc.nextInt();
			lastnum=sc.nextInt();
		}
	    

	    //---------------------------���� �Լ�-------------------------
	    
	    public void add2numbers(int num1, int num2)
	    {
	    	sum = num1 + num2;
	    }
	    
	    public void add3numbers()
	    {
	    	sum = num1 + num2 + num3;
	    }
	    
	    public void add4numbers()
	    {
	    	sum = num1 + num2 + num3 + num4;
	    }
	    
	    public void add5numbers()
	    {
	    	sum = num1 + num2+ num3 + num4 + num5;
	    }
	    
	    public void numatobsum()
		{ 
			
			for(int i=firstnum;i<=lastnum;i++)
			{
				firstnum=firstnum+i;
			}
			int num= firstnum;
		
			System.out.print(num-1);
		}
	    
	    //----------------------------����Լ�--------------------------
	    
	    public void output()
	    {
	    	System.out.print("���� :" +sum);
	    }
	    
	    //---------------------------������ȯ�Լ�-------------------------
	    public void change()//�̿ϼ�
	    {
		    changefx= num1; 
	    	num1 = num2;
		     
	    }
	    
	    
		
		
		
	    
	    
	    
	    
	    
	    //���ٱ��� return �ڷ��� �Լ���() 
	    //return-> �Լ��� �����ϰ� ���� ����� �޴°� ���� ���� �ִٸ� �Լ��� �ڷ��� 
	    //         �Լ� ������ ���� ������ ���� �� �� �ִ�.
	    //public void aaa()-> ���� ���� ���� �Լ�
	    
	//���: ���α׷��� ������ �����.
	// 1. �μ��� �Է��ϱ�
	// 2. �μ��� �� ���ϱ�
	// 3. ���� ����ϱ�
	    
	
}
