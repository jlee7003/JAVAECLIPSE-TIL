
public class Const1 
{
  // �Ӽ�
	int kor;
	int eng;
	int mat;
	
  // ������ (�ʱⰪ)
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
	
  // �޼ҵ�
	
}
