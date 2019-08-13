
public class outter2 {
	//내부클래스가 static
	//내부클래스에는 instance속성, 메소드, static메소드가 존재
	static class inner3{ //스태틱이므로  outter2의 객체 생성 없이 바로 접근이 가능함
		int kor=88;
		public void chul()
		{
			System.out.println("국어점수 : "+kor);
		}
		public static void output()
		{
			System.out.println("스태틱 메소드 입니다.");
		}
	}
}
