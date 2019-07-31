package CH6;
import java.util.*;
public class Q3_한수 {

	/*
	 * 어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
	 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
	 * 
	 * 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
	 * 
	 * 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
	 */
	public static int[] splitNum(int value) 
	{
	 int[] splited_num_array = new int[Integer.toString(value).length()];//tostring-> 객체의 정보를 문자열로 만드는 메소드
	 //각 자리 수를 저장할 배열 선언. 크기는 문자열로 변환된 value의 길이 만큼
	 for(int i=0; value!=0;i++) {
		 splited_num_array[i] = (value % 10);
		 value /=10;//value=value/10
	 }
		return splited_num_array;
	}
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //n을 입력 받음
        sc.close();
         
        if (n < 100) { //n이 100미만 일 경우 한수는 입력값의 수와 같다.
            System.out.println(n);
        } else {
            int result = 99;
             
            for (int i = 100; i <= n; ++i) {//100부터 입력 값 까지 검사
                result += checkHanNumber(i);//result = result + checkHanNumber(i)
            }
             
            if (n == 1000)
            	result--;
             
            System.out.println(result);
        }
    }
     
    private static int checkHanNumber(int number) { //100이상일 경우 한수인지 체크 하는 함수
        int num1 = number / 100 % 10;//100의 자리
        int num2 = number / 10 % 10; //10의 자리
        int num3 = number % 10;
         
        if (num2 * 2 == num1 + num3) { //a+c가 2b인 경우 1씩 더함
            return 1;
        }
        return 0;
    }
}