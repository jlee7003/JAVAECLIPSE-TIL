
interface chul_con {
	

	public void chul();


}

class chul_class implements chul_con {
	int kor = 100;

	public void chul() // gijun 값보다 작으면 불합격
	{
		System.out.println("인터페이스");
	}
}

public class Inter_Class3 
{
	public static void main(String[] args) 
	{
		chul_con cc = new chul_con() 
		{
			int kor=100;
			public void chul() 
			{
				System.out.println("익명구현");
				System.out.println(kor);
			}
		};
		cc.chul();
		//interface내에 선언된 속성만 가능함
//		cc.kor;
	}

}
