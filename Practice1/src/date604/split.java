package date604;

public class split 
{

	public static void main(String[] args) 
	{
		String str="안녕하세요";
		
		String[] name=str.split(""); //¦���� ������ ����
		//String�� Ŭ���� �̹Ƿ� �޼ҵ带 ������ �̾���
		
		for(int i=0;i<name.length;i++)
		System.out.println(name[i]);

	}

}
