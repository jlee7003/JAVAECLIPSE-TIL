package date520;

public class date520_main1 
{

	public static void main(String[] args) 
	{
		date520_1 aa=new date520_1();
		 //1.메인함수내에서 변수를 만드는법
		aa.n=100;
		aa.cal();
		aa.chul();

		
		//2.메소드를 이용하는 방법
		date520_1 bb=new date520_1();
		bb.input();
		bb.cal();
		bb.chul();
		
		//3.생성자를 이용하는 방법
		
		date520_1 cc=new date520_1();
		cc.cal();
		cc.chul();
		
		
	}

}
