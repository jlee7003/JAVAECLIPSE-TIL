package Static_instance_Singletone;

public class date522_main2 
{

	public static void main(String[] args) 
	{
		date522_2singletone aa=date522_2singletone.getInstance(); //static aa 를 받아 복제 했으므로 
		//                                   인스턴스 메소드들을 받아들여 실행 할 수 있음 
		// new 연산자를 통해 객체 생성이 불가능함-> 에러 발생  //싱글톤 객체화
		aa.input(90,80);
		aa.cal_chul();
		
		
		date522_2singletone aa3=date522_2singletone.getInstance(); //static aa 를 받아 복제 했으므로 
		//                                   인스턴스 메소드들을 받아들여 실행 할 수 있음
		aa3.input(70,30);
		aa3.cal_chul();
		
		

	}

}
