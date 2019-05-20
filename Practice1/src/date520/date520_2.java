package date520;

public class date520_2
{
  int kor;
  int eng;
  int mat;
  
  
  date520_2(int kor,int eng, int mat) //매게변수를 약자로하면 이해하기 힘드니 이름을 제대로 설정
  {
  	 this.kor=kor; //class에서 정한 변수
  	 this.eng=eng;
  	 this.mat=mat;
  }
  
  public void chul()
  {
	  System.out.println(kor+eng+mat);
  }
  
}


