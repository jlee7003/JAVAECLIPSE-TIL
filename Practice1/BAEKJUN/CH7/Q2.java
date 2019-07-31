package CH7;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int aa=sc.nextInt(); 					//입력할 숫자의 길이 입력
		
		int array2[]=new int[aa]; 				//입력할 숫자 길이 만큼의 배열 생성 및 숫자를 잘라 각 자리에 넣어줄것
		
		String b=sc.next();						 // 자르게 될 숫자 입력 (문자열이지만)
		
		String as[]=b.split("");				 // 문자열 b를 잘라주어 String as[]라는 배열에 저장 
										     	//<-현재 문자열인 상태이므로 숫자처럼 연산을 할 수 없으므로 숫자로 만들어주는 작업을 해야함
		
		int hap=0;								// 합을 저장할 변수
		
		
		
		for(int i=0;i<as.length;i++) {          //for문을 이용하여 as[] 배열에 있는 문자열들을 
													
			array2[i]=Integer.parseInt(as[i]);  //Interger.parseInt()를 사용하여 숫자로 바꾸어줌
			hap=hap+array2[i];
		}
		
		System.out.println(hap);
	 

	
	}

}
