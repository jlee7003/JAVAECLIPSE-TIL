package Generic_0819;
//Generic 같은 클래스에 다른 자료형 가져오기
class Test1 // private 접근제한자는 외부x 내부에서만 접근 가능함
{ // private 속성의 값을 처리하는 메소드를 주어야함=> getter, setter
	private Integer kor;

	public Integer getKor() {// 값을 가져오는 getter
		return kor; // return을 통해서 가져온다.
//		                     getter명명법 -> get+변수명(앞글자는 대문자)
	}

	public void setKor(Integer kor) { //setter는 매개변수를 통해서
		this.kor = kor;
	}

}

class Test2 {
	private String kor;//자료형만 다르다면 이름이 같아도 상관이 없음

	public String getName() {
		return kor;
	}

	public void setName(String kor) {
		this.kor = kor;
	}
}

public class non_generic {
	public static void main(String[] args) {

		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		t1.setKor(99); //변수를 초기화 할땐 set을 사용함
		t2.setName("홍길동");
		}
}
