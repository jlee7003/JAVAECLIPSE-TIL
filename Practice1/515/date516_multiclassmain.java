
public class date516_multiclassmain  //public은 자바 파일 중 하나만 있을수 있는데
                                 //자바 파일과 이름이 똑같아야 함
{		
	public static void main(String[] args) 
	{
		int kor=90;
		int eng=88;
		int mat=70;
		date516_multiclass aa=new date516_multiclass(kor,eng,mat);
		//date516_multiclass(90,88,70)
		
		aa.chul();
		aa.input(kor,eng,mat);
		//객체를 인스턴스화
		//aa-> 객체변수,클래스로
	}
 }

