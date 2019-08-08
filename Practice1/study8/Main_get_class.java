
public class Main_get_class {

	public static void main(String[] args) {

		Getter_Setter gs=new Getter_Setter();
		gs.aaa(90);//kor 변수는 private으로 설정했기에 접근 할 수 없어서 값을 바꿀 수 없다.
	
		int kor=gs.bbb();
		System.out.println(kor);
		gs.getKor();
		System.out.println(gs.getKor());
		
	}

}
