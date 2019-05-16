
public class Const1 
{
  // 속성
	int kor;
	int eng;
	int mat;
	
  // 생성자 (초기값)
	Const1(int k,int e,int m)
	{
		kor=k;
		eng=e;
		mat=m;
	}
	public void chul()
	{
		int hap=kor+eng+mat;
		System.out.println(hap);
	}
	
	public void input(int k,int e,int m)
	{
		kor=k;
		eng=e;
		mat=m;
	}
	
  // 메소드
	
}
