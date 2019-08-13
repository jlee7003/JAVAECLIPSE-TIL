
class parent7 {
	int kor;

	public void chul() {
		System.out.println("parent4");
	}

	parent7(int kor) // 부모클래스에 매개변수가 있다면 자식 클래스에서 오류가 발생
	{
		this.kor = kor;
		System.out.println(kor);
	}

}

class daughter7 extends parent7 {
	int eng = 88;

	public void imsi() {
		System.out.println("daughter");
	}

	daughter7(int kor,int eng) {
		//부모 생성자에 전달해야 하는 매개변수는 자식생성자가 가져와서 전달한다
		super(kor); // 가 숨어있음 , super.chul(); -> 부모의 chul이라는 메소드를 호출하라.35
		this.eng = eng;
	}
}

//parent5의 생성자는 코드상에서 실행되지 않았다
//-> 하지만 사용할수 있는 이유는 부모크래스인 parent5의 생성자는 묵시적으로 실행이 되었다.
public class 생생성자4 {

	public static void main(String[] args) {
		daughter7 dd7 = new daughter7(77,66);
		dd7.chul();
		dd7.imsi();

	}

}
