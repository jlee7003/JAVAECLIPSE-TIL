package date604;

public class trim 
{
	public static void main(String[] args) 
	{
		String str="                안녕 홍길            동러해ㅑ엏";//중간의 공백은 없애지 않음 좌우의 공백만 지움
		
		System.out.println(str.length());
		
		String trim_str=str.trim();
		
		System.out.println(trim_str.length());
	}
}
