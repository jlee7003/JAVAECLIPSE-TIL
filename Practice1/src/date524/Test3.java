package date524;
public class Test3 
{
  int kor;
  int eng;
  int mat;
  int sci;
  int hap;
  int avg;
  // �޼ҵ� �����ε�
  // �޼ҵ忡 �Ű������� ������ ������ ������ŭ�� ����� ���Ͻÿ�.
  
  public void average()
  {
	  System.out.println("���� �����ϴ�.");
  }
  public void average(int kor)
  {
	  hap=kor;
	  avg=hap/1;
	  System.out.println(avg);
  }
  public void average(int kor,int eng)
  {
	  hap=kor+eng;
	  avg=hap/2;
	  System.out.println(avg);
  }
  public void average(int kor,int eng,int mat)
  {
	  hap=kor+eng+mat;
	  avg=hap/3;
	  System.out.println(avg);
  }
  public void average(int kor,int eng,int mat,int sci)
  {
	  hap=kor+eng+mat+sci;
	  avg=hap/4;
	  System.out.println(avg);
  }
}
