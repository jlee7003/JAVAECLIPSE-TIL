package date527;

public class date527_1 
{
 int kor=90;
 
  public void chul()
  {
	  System.out.println(kor);
  }
  public void aaa() // ���� �Լ��� �ִ� �޼ҵ峪 �Ӽ��� �θ� �� ������
                    // �ٸ� �Լ��� �޼ҵ峪 �Ӽ��� �θ� �� ����.
  {
	  kor=88;
	  chul();
  }
  public static void main(String[] args) //���� Ŭ������ ������ main �Լ��� �� ���� �ڽ���
  {
	  date527_1  f=new date527_1();
	  f.kor=99;
	  f.chul();
  }
}
