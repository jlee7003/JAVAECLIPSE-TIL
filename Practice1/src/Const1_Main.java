
public class Const1_Main 
{
	public static void main(String[] args) 
	{
		int kor=90;
		int eng=80;
		int mat=88;
		Const1 c1=new Const1(kor,eng,mat);
		// Const1(90,80,88);
		c1.input(kor,eng,mat);
		c1.chul();
		// 객체를 인스턴스화
		// c1 => 객체변수,클래스변수
	}
}
