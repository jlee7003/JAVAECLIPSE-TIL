package date603;
import java.util.Date;
public class test 
{

	public static void main(String[] args) 
	{
		//대입 연산자를 통해 오른쪽에 있는 값을 왼쪽으로 줄 경우
		//문자는 문자 숫자는 숫자 외의 경우는 형변환이라고 함 
		//오른쪽 왼쪽의 형태는 항상 같아야함
		
		//변수
		int a=99;
		int b=a;// a라는 정수형 변수에 있는 값을 왼쪽의 변수에 저장

		//char aa=b; 타입이 맞지 않음으로 x
		
		//배열
		int[] kor= new int[3];
		kor[0]=100;
		kor[1]=90;
		kor[2]=80;
		int[] kkk =kor;
		System.out.println(kkk[2]);
		
		//객채
		Date today=new Date();
		System.out.println(today.getDate());
		
		Date ttt=today;
		System.out.println(ttt.getDate());
	}

}
