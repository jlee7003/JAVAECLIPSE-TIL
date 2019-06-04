package date604;

public class charAT 
{

	public static void main(String[] args) 
	{
		String str="1234567-1234567";
		
		
		//남자는 1,3 여자는 2,4
		char chk=str.charAt(8);
		
		if(chk=='1' || chk=='3')
		{
			System.out.println("남자입니다.");
		}
		else
			System.out.println("여자입니다.");
		
		

	}

}
