package date604;

public class trim 
{
	public static void main(String[] args) 
	{
		String str="                �ȳ� ȫ��            �����ؤ��j";//�߰��� ������ ������ ���� �¿��� ���鸸 ����
		
		System.out.println(str.length());
		
		String trim_str=str.trim();
		
		System.out.println(trim_str.length());
	}
}
