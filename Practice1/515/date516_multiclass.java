
public class date516_multiclass  //public�� �ڹ� ���� �� �ϳ��� ������ �ִµ�
                                 //�ڹ� ���ϰ� �̸��� �Ȱ��ƾ� ��
{		
    int kor;
    int eng;
    int mat;
    
    date516_multiclass(int a,int b,int c) //������(�ʱⰪ)
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

