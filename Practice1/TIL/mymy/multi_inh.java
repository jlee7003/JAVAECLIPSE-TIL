
class Grandfather { //kor
	int kor;
	Grandfather()
	{
		System.out.println("Grandfather");
	}
}

class father extends Grandfather{ //kor, eng
	int eng;
	father()
	{
		System.out.println("father");
	}
}

class My extends father{ //kor, eng, mat
	int mat;
	My()
	{
		System.out.println("My");
	}
	public void input()
	{
		kor=90;
		eng=80;
		mat=60;
	}
	public void chul()
	{
		System.out.println(kor+eng+mat);
	}
}

public class multi_inh {
	public static void main(String[] args) {
		My m=new My();
		m.input();
		m.chul();
	}
}
