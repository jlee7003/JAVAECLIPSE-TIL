package Static_instance_Singletone;

public class date522_main1 
{

	public static void main(String[] args) 
	{
		//���� ����� ��� ����� Ŭ����.�̸�
		// => ex) date522_1.sogae
		//���� �ʵ�= �������� ������
		//static�� �Ǹ� �ۿ��� ������ �����ϰ� �� �߿��� �ڷ�� static�� ������� ����
		date522_1.name="����ȣ"; //������ ������ �ʰ� ���� static���� �־��� ��  
		date522_1.age=24;
		
		date522_1.sogae();
		
		date522_1 aa= new date522_1();
		
		aa.input(4);
		aa.sogae(); //
	}

}
