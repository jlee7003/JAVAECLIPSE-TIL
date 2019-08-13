
class parent8 {
	int kor;

	parent8() {
		kor = 60;
		System.out.println(kor);
	}

	parent8(int kor) {
		this.kor = kor;
		System.out.println(this.kor);
	}
}

class daughter8 extends parent8 {
	int eng;

	daughter8() {
		super();
	}

	daughter8(int kor) {//생성자의 매개변수로 들어온다면
		super(kor);
//		super(88); 
	}
	//매개변수가 있는 생성자가 존재할때 
	//매개변수 없는 생성자를 호출하고자 할때는 매개변수 없는 생성자를 명시해야 된다..
}

public class 생생성자5 {

	public static void main(String[] args) {
		daughter8 d8 = new daughter8(77); //daughter로 전달 -> daughter 생성자가 받음
		daughter8 dd8 = new daughter8(); 
	}

}
