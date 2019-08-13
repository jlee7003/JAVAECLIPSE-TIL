
public class Instance_Nested {//외부클래스
//내부클래스에서 외부클래스 외부클래스에서 내부클래스의 것들을 사용 할 수도 있다.
	int kor;
	
	public void chul()
	{
		System.out.println("국어점수 :"+kor);
	}
	
	class inner//내부클래스
	{  //?? 왜 내부클래스를 만들어 쓰는걸까??
		int num=99;
		
		public void chul()
		{
			System.out.println("숫자값 :"+num);
		}
	}
}
