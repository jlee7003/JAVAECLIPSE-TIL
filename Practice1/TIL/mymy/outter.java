
public class outter {
	int kor;

	public void chul() {
		System.out.println("국어: " + kor);
		inner2 i2=new inner2();
		i2.eng=18;
		System.out.println("영어: " + i2.eng);
	}

	class inner2 {
		int eng;
		int kor=10;
		public void hap()
		{
			//kor: 내부에 있는 속성인 kor
			//outter.this.kor //외부 클래스의 속성을 불러오는 방법
			int tot=outter.this.kor+eng; //외부클랫스에 있는 속성은 내부클래스에서 호출 할 수 있다.
			System.out.println("국어+영어:"+tot);
		}
	}
}
