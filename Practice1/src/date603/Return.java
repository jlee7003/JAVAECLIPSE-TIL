package date603;
import java.util.Date;
public class Return
{
	public int aaa()
	{
		int a=9;
		return a;
	}
	public int[] bbb()
	{
		int[] kor=new int[3];
		kor[0]=100;
		kor[1]=150;
		kor[2]=110;
		return kor;
		
	}
	
	public Date ccc()
	{
			Date today=new Date();
			return today;
	}

}
