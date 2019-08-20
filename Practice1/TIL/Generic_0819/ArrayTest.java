package Generic_0819;


class Gene_Test<T,M>{
	private T t; //private String t;
	private M m; //private integer m;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public M getM() {
		return m;
	}
	public void setM(M m) {
		this.m = m;
	}

	}

public class ArrayTest{
	public static void main(String[] args) {
		Gene_Test<String,Integer> gt=new Gene_Test<String,Integer>();
	}
}