import java.util.Scanner;
public class date508_3 
{
 int kor;
 int eng;
 int mat;
 int hap;
 int avg;
 Scanner sc= new Scanner(System.in);
 
 public void input()
 {
	 kor=sc.nextInt();
	 eng=sc.nextInt();
	 mat=sc.nextInt();
 }
 
 
 public void sum()
 {
	 hap=kor+eng+mat;
	 avg=(kor+eng+mat)/3;
	 
 }
 
 public void out()
 {
	 System.out.print(hap +"<-Че  ЦђБе->"+ avg);
 }
}
