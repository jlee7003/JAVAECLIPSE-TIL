
public class 생성자와메소드 
{ //클래스는 프로그램의 기본단위
	//속성(필드,상태) : 프로그램에서 필요한 변수,값을 저장할 공간
	int kor;//변수
	// 메소드(동작, 기능): 프로그램에서 실제 동작하는 내용
	
	생성자와메소드(int kor)
	{
		this.kor=kor;
		System.out.println(kor);
		//변수 kor에 매게변수 kor를 대입
	}
	
	public void input(int kor)
	{
		this.kor=kor;
		System.out.println(kor);
		//변수 kor에 매게변수 kor를 대입
	}
	
	//생성자(얘도 메소드): 모든 클래스의 객체가 생성시 실행되는 메소드
//	한 클래스내에는 여러개의 생성자다 존재-> 오로지 하나만 실행
//	상속을 한 클래스의 생성자는 어떻게 될까?
//  실제 객체생성하는 클래스는 상속받는 클래스가 존재 하는게
//	상속받는 클래스의 실행자는 어디서 실행이 될까?
	
 class parent4
 {
	 int kor=100;
	 public void chul()
	 {
		 System.out.println("parent4");
	 }
 }
 class daughter{
	 int eng=88;
	 public void imsi()
	 {
		 System.out.println("daughter");
	 }
 }
 
 public class son4
 {
	 public void main(String[] args) {
		parent4 p4=new parent4();
		daughter dd=new daughter();
	}
	 
 }
	
	// 처음: 절차지향 코딩-> 속성과 메소드 분리하여 만들기

	
	//생성자와 메소드의 공통점 : 둘다 메소드로 작동
	//생성자와 메소드의 차이점 : 실행되는 시점이 다름
	
	//오버로딩: 이름이 같은 메소드가 존재하는것, 생김세는 비슷하나 메개변수의 개수나 값이 다를때 사용함
	
	

}
