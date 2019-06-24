# 자바 기본기

<h2>·기초개념(class,method,comment)</h2><p>
	
   <b>-class</b> <p>
	
    public-> 이 클래스는 누구든지 사용가능
    class-> 클래스를 선언하는 명령어
    Hello-> 내가 정한 클래스의 이름

    클래스를 이루는 단어의 첫글자는 대문자로 해주는 것이 좋다.
    클래스: 자바클래스를 이루는 기본적인 블록*/
   
  <b>-method</b> <p>
	

    static: 정적 메소드이다.
    void: 결과값을 반환하지 않음
		
    입력을 받아서 기능을 하고 출력하는 함수
    메소드에 우리가 원하는 작업을 적어 작업을 하게 함
    정수를 담는 공간 만들기= 자료형 변수명 
   
   <b>-comment</b> <p>
   
    -> //를 입력하고 메모를 할수 있는 기능
		/*Text*/ : 여러줄 주석처리 할때 사용 
    // : 한줄짜리 주석시 사용
  
<h2>·제어문(분기문, 반복문)</h2> <p>
  
	·if-else문 <p>	

	·switch문 <p>

	·for문,이중for문 <p>
	
	·while문 <p>
  
<h2>·배열 선언하기(변수명 함수변수=new 변수명)</h2> <p>
	
	·int 배열명[] = new int[배열크기]; 
  
<h2>·이중배열 사용하기</h2> <p>
	
	public static void main(String[] args)
	
     }
     //2중행렬 범위 설정
     int sung[][]=new int[5][3]; => 5행, 3열
     int sum=0;
     Scanner sc=new Scanner(System.in);
     //2중행렬 값 입력
     for(int i=0;i<3;i++)
     {
    	 for(int j=0;j<3;j++)
    	 {
    		 System.out.println("값을 입력하십시오");
    		 sung[i][j]=sc.nextInt();
    	 }
     }
  
<h2>·overloading</h2> <p>
  
<h2>·interface </h2><p>
  
<h2>·abstract class </h2><p>
  
<h2>·instance</h2> <p>
  
<h2>·static</h2><p>
  
-> 정적멤버 객체 생성 없이 부를수 있음, 스테틱이 붙어있음
   클래스명 aa = new 클래스명(); 같이 객체 생성할 필요 없이
   호출 할 수 있음 (클래스명.메소드명();으로 메소드 호출이 가능함)
   
   *스태틱을 사용하는 이유?
   객체생성없이 사용 할 수 있게 만들면 객체를 만들시 사용되는 메모리를 절약할 수 있으므로 메모리 낭비를 최소화 하는 것.
   
   
<h2>singletone </h2><p>
  
-> private을 통해 외부에서 접근을 막았을 경우 생성자에 getInstance()와 static을 통해 생상자를 
   자기 자신의 클래스 내에서(private이여도 자기 자신의 클래스 안에서는 객체화가 가능하므로)객체를 만들어 리턴해주어 
   클래스명 aa=클래스명.getInstance(); 이라는 과정을 통해 객체화 해주어 사용하는것

  
<h2>·extands(상속)</h2> <p>
  
<h2>·break,continue, Date class, calender class, random class</h2> <p>
  
<h2>·SimpleDate, SimpleDateFormet class(날짜형식), TimeZone class</h2> <p>
	
<h2> 전역변수, 지역변수 <h2>
	
     ->같은 클래스 안에서 함수를 만들고 클래스 안에 변수를 만들었을때 위치에 따라 변수의 값이 정해지는 것 
       ex) public class exex
            {
	      int prac;
	      
	      public void input()
	      {
	       int prac; <- 지역변수: 함수내에서 변수가 선언되어 변수에 가장 가까운 값을 대입하게 됌
	       prac=140;
	      }
	      
	      public void output()
	      {
	       prac=100; <- 변수가 함수내에 없으므로 클래스 변수로 가서 값을 찾음
	      }
	    }
