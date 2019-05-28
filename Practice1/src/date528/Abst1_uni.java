package date528;

public class Abst1_uni extends Abst
{ //오버라이딩
  public void calculation()
  {
		{
			if(kor>=90)
				grade='A';
			else if(kor>=80)
				grade='B';
			else if(kor>=70)
				grade='C';
			else if(kor>=60)
				grade='D';
			else 
				grade='F';
		}
  }
}
