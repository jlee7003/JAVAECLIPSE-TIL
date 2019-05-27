package pro;

class Father
{
	int kor;
	public void chul()
	{
		System.out.println("±×³É°õÅÁ");
	}
}


public class Son extends Father
{
	public void aaa()
	{
		System.out.println("Ãß°¡");
	}
	public void chul()
	{
		System.out.println("Ä¡Áî°õÅÁ");
	}
}
