package Static_instance_Singletone;

public class date522_main2 
{

	public static void main(String[] args) 
	{
		date522_2singletone aa=date522_2singletone.getInstance(); //static aa �� �޾� ���� �����Ƿ� 
		//                                   �ν��Ͻ� �޼ҵ���� �޾Ƶ鿩 ���� �� �� ���� 
		// new �����ڸ� ���� ��ü ������ �Ұ�����-> ���� �߻�  //�̱��� ��üȭ
		aa.input(90,80);
		aa.cal_chul();
		
		
		date522_2singletone aa3=date522_2singletone.getInstance(); //static aa �� �޾� ���� �����Ƿ� 
		//                                   �ν��Ͻ� �޼ҵ���� �޾Ƶ鿩 ���� �� �� ����
		aa3.input(70,30);
		aa3.cal_chul();
		
		

	}

}
