package date520;

public class date520_2
{
  int kor;
  int eng;
  int mat;
  
  
  date520_2(int kor,int eng, int mat) //�ŰԺ����� ���ڷ��ϸ� �����ϱ� ����� �̸��� ����� ����
  {
  	 this.kor=kor; //class���� ���� ����
  	 this.eng=eng;
  	 this.mat=mat;
  }
  
  public void chul()
  {
	  System.out.println(kor+eng+mat);
  }
  
}


