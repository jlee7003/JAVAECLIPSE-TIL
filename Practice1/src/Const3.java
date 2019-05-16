
public class Const3 
{
   int kor; //파란색 전역변수
   int eng;
   int mat;
  /* public void chul() //생성자와 메소드는 같은 것
   {
	  //int kor=88;   //지역변수,전역변수 =>자기 자신에게 가까운 변수를 찾음
	   
	   System.out.println(kor);      //현제 chul 메소드의 kor값
	   System.out.println(this.kor); //초기의 값 호출 초기의 kor 값
   }
   */
   //생성자
   Const3(int kor,int eng,int mat)
   {
	   this.kor=kor; // this-> 초기의 kor 값 불러오기 this는 현재 클래스의 값을 가리킨다.
	   this.eng=eng;
	   this.mat=mat;
   }
   
   public void chul()
   {
	   System.out.println(kor);
	   System.out.println(eng);
	   System.out.println(mat);
   }
   //메소드
   public void input(int kor,int eng,int mat)
   {
	   this.kor=kor;
	   this.eng=eng;
	   this.mat=mat;
   }
}
