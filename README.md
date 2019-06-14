# 자바 기본기

<h2>·기초개념(class,method,comment)</h2><p>
  
  -class
   public-> 이 클래스는 누구든지 사용가능
   class-> 클래스를 선언하는 명령어
   Hello-> 내가 정한 클래스의 이름

   클래스를 이루는 단어의 첫글자는 대문자로 해주는 것이 좋다.
   클래스: 자바클래스를 이루는 기본적인 블록*/
   
  -method
   static: 정적 메소드이다.
   void: 결과값을 반환하지 않음
		
   입력을 받아서 기능을 하고 출력하는 함수
   메소드에 우리가 원하는 작업을 적어 작업을 하게 함
   정수를 담는 공간 만들기= 자료형 변수명 
   
   -comment
   
    -> //를 입력하고 메모를 할수 있는 기능
		/*Text*/ : 여러줄 주석처리 할때 사용 
    // : 한줄짜리 주석시 사용
   
   
<h2>·변수 만들기(int,short,char,double) </h2><p>
  
<h2>·형변환 <p>
  
<h2>·Scanner class, final</h2> <p>
  
<h2>·제어문(분기문, 반복문)</h2> <p>
  
<h2>·if-else문</h2> <p>
  
<h2>·switch문</h2> <p>
  
<h2>·for문,이중for문</h2> <p>
  
<h2>·배열 선언하기(변수명 함수변수=new 변수명)</h2> <p>
  
<h2>·이중배열 사용하기</h2> <p>
  
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
