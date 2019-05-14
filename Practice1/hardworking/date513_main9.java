
public class date513_main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		date513_9 aa=new date513_9();
		// 3명의 국영수 합의 평균을 구하시오
		aa.input(); //첫번째 input 값을 hap1으로 저장
		int hap1=aa.stand();
		
		aa.input();//두번째 input 값을 hap1으로 저장
		int hap2=aa.stand();
		
		aa.input();//세번째 input 값을 hap1으로 저장
		int hap3=aa.stand();
		
		
		int hap=hap1+hap2+hap3;
		System.out.print(hap/3);
		
		
	}

}
