package Generic_0819;

public class Method_gen {
	public static void main(String[] args)
	{
		Test_Method tm=new Test_Method();
		tm.chul(100);
		Test_Method tm1=new Test_Method();
		tm.chul("안녕");
		Test_Method tm2=new Test_Method();
		tm.chul(100.2);
		
	}

}

class Test_Method
{
	public <T extends Object> void chul(T val) //Number, object, String, Double, 클래스의 번위 제한
	{
		System.out.println(val);
	}
}
//class Test_Method1
//{
//	public void chul(String val)
//	{
//		System.out.println(val);
//	}
//}
//class Test_Method2
//{
//	public void chul(Double val)
//	{
//		System.out.println(val);
//	}
//}