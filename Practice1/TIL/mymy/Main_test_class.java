
public class Main_test_class {

	public static void main(String[] args) {
		test_class ts=new test_class();
		//private 속성에 접근하고자 한다면 public 메소드로 해야 한다.
		ts.setTot(50,60,70); //setKor 메소드에 값 50 보내기
	  	
		System.out.println(ts.getTot()); // setTot 보낸 값 getTot로 보낸후 더해서 출력하기
		//생성자 -객체와 이름이 똑같은 함수 , 초기화 시키는 내용을 많이 씀
	}

}
