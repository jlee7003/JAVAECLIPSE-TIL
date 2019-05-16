
public class date516_multiclass  //public은 자바 파일 중 하나만 있을수 있는데
                                 //자바 파일과 이름이 똑같아야 함
{		
    int kor;
    int eng;
    int mat;
    
    date516_multiclass(int a,int b,int c) //생성자(초기값)
    {
    	kor=a;
    	eng=b;
    	mat=c;
    }

    public void chul()
    {
    	int hap=kor+eng+mat;
    	System.out.println(hap);
    }
	
    
	public void input(int a,int b,int c)
	{
		kor=a;
    	eng=b;
    	mat=c;
	}
	
 }

