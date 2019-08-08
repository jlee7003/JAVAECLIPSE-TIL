//zm

//생성자(얘도 메소드): 모든 클래스의 객체가 생성시 실행되는 메소드
//한 클래스내에는 여러개의 생성자다 존재-> 오로지 하나만 실행
//상속을 한 클래스의 생성자는 어떻게 될까?
//실제 객체생성하는 클래스는 상속받는 클래스가 존재 하는게
//상속받는 클래스의 실행자는 어디서 실행이 될까?

class parent4
{
 int kor=100;
 public void chul()
 {
	 System.out.println("parent4");
 }
 parent4(){ //기능이 없는 생성자는 코딩을 하지 않아도 자동으로 실행 시킴 -묵시적 생성자
	 
 }
}
class daughter{
 int eng=88;
 public void imsi()
 {
	 System.out.println("daughter");
 }
}

public class 생생성자 {

	 public static void main(String[] args) {
			parent4 p4=new parent4(); //new 뒤에 있는 것이 생성자
			daughter dd=new daughter();
			
			
		}
		 
}

