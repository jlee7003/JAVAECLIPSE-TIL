package date522;

public class date522_2singletone 
{
	//�̱���: 
    //class ������ �ڹ� ������ ��� ���ִ��� �� �� ���� �� ��ɸ� ����� ������. class ���Ϸδ� ���θ� �鿩�� �� ���� ����
	int num1;
	int num2;
	String name;
	
	 private date522_2singletone(String name)// �����ڿ��� �̸��� �ʱ�ȭ ,�����ڰ� private ������ ��ü ������ �Ұ���
	 // private -> �ڽ��� Ŭ���������� ������ ������, �̰��� �̱��� ��� �����ִ°� return class��ü�� �Ѱ��ִ°�
	{
		this.name=name; 
	}
	
	 public static date522_2singletone getInstance()// �긦 ����ƽ���� ����� ���� ������ static���� �ڽ��� ����Ŭ������ ���� ��
	                                      // aa�� return������ private�ӿ��� static aa�� main Ŭ�������� ���� �� ����
	 {
		 date522_2singletone aa1=new  date522_2singletone("����ȣ"); //���⼭ �����ڸ� ������ְ� return�� ����
		                                       // ���� �⼮�θ� ����� ��(���� ������)
		                                       //return �Ǵ� ���� class������ �ڷ������� Ŭ������ ������(���� Ŭ������ �̸�)
		 return aa1; //��ȯ�Ǵ� Ŭ������ ���� �̸��� ��� ����
	 }
	public void input(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	public void cal_chul()
	{
		int hap=num1+num2;
		
		System.out.println(name+"  :  "+hap);
	}
	
	
}
