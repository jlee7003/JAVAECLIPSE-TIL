package Static_instance_Singletone;

public class date522_3 
{
	String bunho;
	String pwd;
	int pay;
	
	date522_3(String bunho,String pwd)
	{
		this.bunho=bunho;
		this.pwd=pwd;
		//통장번호랑 비밀번호 체크 기능
		this.pay=3000000;
	}
	public static date522_3 getInstance()
	{
		date522_3 aa=new date522_3("00-000-000-000","1234");
		
		return aa;
	}

	public void chul()
	{
		System.out.println(pay);
	}
}
