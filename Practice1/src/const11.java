
public class const11 
{
  // �Ӽ�
	int kor;
	int eng;
	int mat;
	
  // ������ (�ʱⰪ)
	const11(int k,int e,int m)
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
