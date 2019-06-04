package date604;

public class split 
{

	public static void main(String[] args) 
	{
		String str="홍길동,슈퍼맨,배트맨,원/더=우먼";
		
		String[] name=str.split(",|/|="); //짝대기로 나눌수 있음
		//String은 클래스 이므로 메소드를 가지고 이씨다
		
		for(int i=0;i<name.length;i++)
		System.out.println(name[i]);

	}

}
