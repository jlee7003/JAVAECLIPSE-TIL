//zm

//생성자(얘도 메소드): 모든 클래스의 객체가 생성시 실행되는 메소드
//한 클래스내에는 여러개의 생성자다 존재-> 오로지 하나만 실행
//상속을 한 클래스의 생성자는 어떻게 될까?
//실제 객체생성하는 클래스는 상속받는 클래스가 존재 하는게
//상속받는 클래스의 실행자는 어디서 실행이 될까?

class parent5
{
 int kor=100;
 public void chul()
 {
	 System.out.println("parent4");
 }
 parent5(){ //기능이 없는 생성자는 코딩을 하지 않아도 자동으로 실행 시킴 -묵시적 생성자
	 System.out.println("parent4");
 }
}
class daughter5 extends parent5{
 int eng=88;
 public void imsi()
 {
	 System.out.println("daughter");
 }
 daughter5()
 {
	 super(); //자식클래스의 생성자가 실행되기 전에 부모클래스의 생성자를 실행
	         //super()는 부모클래스의 생성자를 의미함
	          //this는 자기 자신의 생성자를 의미
 }
}

//parent5의 생성자는 코드상에서 실행되지 않았다
//-> 하지만 사용할수 있는 이유는 부모크래스인 parent5의 생성자는 묵시적으로 실행이 되었다.
public class 생생성자2 {

	 public static void main(String[] args) {
			parent5 p5=new parent5(); //new 뒤에 있는 것이 생성자
			daughter5 d5=new daughter5();
			//new daughter5() -> daughter5() 생성자 호출 -> 상속이 있다면
			//부모클래스의 생성자를 호출 -> 부모생성자가 실행-> daughter5() 실행
			//System.out.println(d5.eng);
			//System.out.println(p5.kor);
//			p5.chul();
			//d5.chul();
			//d5.imsi();
			
		}
		 
}

