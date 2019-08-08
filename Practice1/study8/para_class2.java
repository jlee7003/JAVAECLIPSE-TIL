
public class para_class2 {

	int kor;
	public void imsi()
	{
		kor=100;
		test t=new test();
		t.input(kor);
		
	}

	
}

class test
{
	int kor;
	public void input(int kor) {
		this.kor=kor;
		this.kor++;
		System.out.println(this.kor);
	}
}
