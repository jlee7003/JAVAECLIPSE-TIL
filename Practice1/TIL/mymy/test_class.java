
public class test_class

{
	private int kor; //직접 접근은 불가능함
	private int eng;
	private int mat;
	private int tot;
	
	public void setTot(int kor, int eng, int mat) //메인클레스에서 받은 매계변수 값을 this.kor에 저장
	{
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public int getKor() 
	{
		return kor;
	}
	public int getEng() {
		return eng;
	}
	
	public int getMat() {
		return mat;
	}
		
	
	public int getTot() {
		 tot=getKor()+getEng()+getMat();
		return tot;		
	}
	
}
