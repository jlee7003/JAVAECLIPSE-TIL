package date524;
public class Test3 
{
  int kor;
  int eng;
  int mat;
  int sci;
  int hap;
  int avg;
  // 메소드 오버로딩
  // 메소드에 매개변수로 들어오는 과목의 갯수만큼만 평균을 구하시오.
  
  public void average()
  {
	  System.out.println("값이 없습니다.");
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
