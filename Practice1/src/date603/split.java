package date603;

public class split 
{

	public static void main(String[] args) 
	{
		String phone="010-1234-5678";
		
		String[] pho=phone.split("-");//무조건 배열로 받아야함
		//pho라는 배열에 '-'문자를 기준으로 자른 내용을 0번 인덱스 부터 차레로 넘김
//		변수는 변수 배열은 배열
		System.out.println(pho[0]);
		System.out.println(pho[1]);
		System.out.println(pho[2]);

	}

}
