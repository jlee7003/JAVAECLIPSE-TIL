
public class para_class {

	int kor;
	
	public void imsi()
	{
		kor=100;
		cal(kor); //기본형 변수는 값을 줄때
	}
	public void cal(int kor) { //매개변수 kor는 100 imsi에서 값을 줌
		kor ++;
		System.out.println("cal()함수:"+kor);
	}
	public void chul()
	{
		System.out.println(kor);
	}
	

}
