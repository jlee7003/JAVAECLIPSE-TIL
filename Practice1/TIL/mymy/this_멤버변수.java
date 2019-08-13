
public class this_멤버변수 {
	//클래스안에 포함된 요소 -> thrtjdrhk apthem
// this : 현제 자신의 객체를 부를때의 이름, 그 메소드의 리턴 값 ,
//        this로 부를수 있는 변수는 클래스 바로 아래에 있는 변수들만 부를 수 있다.
	
	int kor=7;
	int eng=6;
	
	public void chul()
	{
		int kor=70; //-> 메소드 내의 변수 , 현제 클래스의 멤버가 아님 ->메소드가 실행되고 나면 사라지기에 클래스 멤버로 치지 않음
		int eng=60;
		System.out.println(kor); //현제 메소드의 변수를 불러옴
		System.out.println(this.kor); //현제 클래스의 멤버 변수 , 멤버 메소드를 불러옴
	}
}
