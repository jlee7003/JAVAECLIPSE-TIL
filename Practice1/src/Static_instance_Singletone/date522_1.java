package Static_instance_Singletone;

public class date522_1
{
 int kor; //인스턴스 멤버 -> 무조건 객체를 생성해 불러야함, 스테틱이 붙어 있지 않음
 static String name; //정적멤버 -> 객체 생성 없이 부를수 있음, 스테틱이 붙어있음
 static int age;
 //정적 멤버 스태틱-> 객체 생성 없이 사용 할 수 있는 것 (값이 고정된 것이 아님)
 //              클래스에 소속된 멤버, 객채 내부에 존재하지 않고, 메소드 영역에 존재
 // 스태틱을 사용하는 이유-> 객체생성 없이 사용할 수 있게(복사본으로 안만들어도 사용이 가능하게 됨)
 // 인스턴스 멤버, 정적멤버(static)
 //객체를 만들면 메모리를 차지하게 됨 그러므로 스태틱을 사용해 메모리의 낭비를 최소화 하는 것
  public void chul()
  {
	  System.out.println(kor);
  }
  
  public void input(int kor)
  {
	  this.kor=kor;
	  age=11; //age가 스태틱임에도 인스턴스 함수이기에 객체를 만들어도 상관이 없음
	          //객체란 변수를 만들어 따로따로 일을 하는것을 뜻함
	  System.out.println(kor);
  }
	 
  public static void sogae()
  {
	  //kor=100;// static이 안붙었기에 static 함수 내에서 static이 없는 변수는 사용 할 수 없다.
	  //           객체를 안만드는 함수이기에 불가능
	 //this.age=99; //this는 클래스 자신이므로 사용이 불가,현재객체이므로
	  System.out.println(name+" "+age);
	  
  }
}
