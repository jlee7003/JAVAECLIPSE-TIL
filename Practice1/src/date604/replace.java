package date604;

public class replace
{

	public static void main(String[] args)
	{
		String str="안녕하세요!! 오늘 월요일이거든 ";
		
	    String new_str=str.replace("월요일","화요일");//str에 있는 월요일을 화요일로 바꿔라
	    //빈칸을 땡땡으로 바꿀 수도 있다.
	    
	    System.out.println(new_str);

	}

}
