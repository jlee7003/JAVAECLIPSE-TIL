import java.util.Scanner;
public class date509_24 
{
	//24. 학생 5명의 국,영,수 성적을 입력받아서 합계와 평균을 구한다고 할때 
    // 각 과목의 점수를 배열로 만든후 Scanner를 통해 입력받은후 
   // 합계와 평균을 각각 hap, avg라는 이름의 배열로 만든후 출력하시오.
	
	Scanner sc=new Scanner(System.in);
	int kor[]=new int[5]; 
	int eng[]=new int[5];
	int mat[]=new int[5];
	int hap[]=new int[5];
	int avg[]=new int[5];
	
	public void input()
	{
		for(int i=0;i<kor.length;i++)
		{
			kor[i]=sc.nextInt();
			eng[i]=sc.nextInt();
			mat[i]=sc.nextInt();
		}
		
	}
	
	public void output()
	{
		
		for(int i=0;i<hap.length;i++)
		{
			hap[i]= kor[i]+eng[i]+mat[i];
			avg[i]=hap[i]/3;
			
			System.out.println(hap[i]+" "+avg[i]);
		}	
		
	}

}
