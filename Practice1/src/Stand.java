import java.util.Scanner;
public class Stand {

	//클래스는 속성과 메소드로 구성된다.
	//만들고자 하는 프로그램에 필요한 속성, 메소드
	
	//두 수를 입력하여 합을 출력하시요
	
	//속성: 필요한 변수를 만든다.
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
	    // ------------------------입력함수-----------------------------
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
	    

	    //---------------------------수식 함수-------------------------
	    
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
	    
	    //----------------------------출력함수--------------------------
	    
	    public void output()
	    {
	    	System.out.print("합은 :" +sum);
	    }
	    
	    //---------------------------변수교환함수-------------------------
	    public void change()//미완성
	    {
		    changefx= num1; 
	    	num1 = num2;
		     
	    }
	    
	    
		
		
		
	    
	    
	    
	    
	    
	    //접근권한 return 자료형 함수명() 
	    //return-> 함수를 실행하고 나서 결과를 받는것 리턴 값이 있다면 함수의 자료형 
	    //         함수 실행후 값을 변수에 저장 할 수 있다.
	    //public void aaa()-> 리턴 값이 없는 함수
	    
	//기능: 프로그램의 동작을 만든다.
	// 1. 두수를 입력하기
	// 2. 두수의 합 구하기
	// 3. 합을 출력하기
	    
	
}
