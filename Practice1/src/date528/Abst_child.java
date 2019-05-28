package date528;

public class Abst_child extends Abst
{//오버라이딩
  public void calculation()
  {
		if(kor>=90)
			grade='해';
		else if(kor>=80)
			grade='별';
		else if(kor>=70)
			grade='달';
		else if(kor>=60)
			grade='눈';
		else 
			grade='움';
  }
}
