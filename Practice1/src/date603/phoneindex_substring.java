package date603;

public class phoneindex_substring
{

	public static void main(String[] args) 
	{
		//�и��ؼ� ����غ�����
		String phone="010-1234-5678";

		int a=phone.indexOf("-");
		int b=phone.lastIndexOf("-");
		String first=phone.substring(0,a);
		String second=phone.substring(a+1,b);
		String third=phone.substring(b+1);
		System.out.println(first+" "+second+" "+third);
	}

}
