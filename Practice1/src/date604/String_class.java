package date604;

public class String_class 
{

	public static void main(String[] args) 
	{
		String name="ȫ�浿";
		String str=new String("ȫ�浿");
		
		System.out.println(name+" "+str);
		
        if(name.equals(str))//int char�� =�� ����ϸ� ������
        	                //��ü�� ��ü�� ���ҋ��� equals�޼ҵ带 ����ؼ� ���ؾ���
        {
        	System.out.println("����");
        }
        else
        	System.out.println("�ٸ���");
        //��ü�̱� ������ �ٸ� ������ �����ϹǷ� ���� �ٸ� ����� �ν��ϰ� ��
        
        //wrapper class
        //
        //int
//        char   ----\  Ŭ����
//        double ----/
//        boolean(true,false)
        

	}
}
