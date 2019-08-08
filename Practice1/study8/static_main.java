
public class static_main {

	public static void main(String[] args) {

		System.out.println("이름: "+static_class.name);
		System.out.println("국어: "+static_class.kor);
		System.out.println("영어: "+static_class.eng);
		static_class sc=new static_class();
		System.out.println("주소: "+sc.juso);
		System.out.println("나이: "+sc.age);
		static_class.test();
		sc.chul();
	}

}
