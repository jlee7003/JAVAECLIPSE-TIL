
public class nested_method { // 외부클래스
	// 내부클래스에서 외부클래스 외부클래스에서 내부클래스의 것들을 사용 할 수도 있다.
	int kor = 99;

	public void chul() {
		System.out.println("국어점수 :" + kor);
	}

	public void output()// 내부클래스
	{ // ?? 왜 내부클래스를 만들어 쓰는걸까??
		class method_in { //은닉 개념으로 사용 클래스를 숨기기 , 구조를 숨기기 위하여
			int num = 77;

			public void chul() {
				System.out.println("숫자값 :" + num);
			}
		}
		method_in mi =new method_in();
		mi.chul();
		
	}
}
