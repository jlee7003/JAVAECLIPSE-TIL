package CH6;

import java.util.Scanner;

public class Q7 {
  //소스는 언제든지 순서대로 작동함
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt(); // 고정비용
      int B = sc.nextInt(); // 가변비용 (1대당)
      int C = sc.nextInt(); // 노트북 가격

      sc.close();

      // 노트북 대수
      int n = 0;
      int amount = 0;
      int cost = 0;

      if (C <= B) {
         System.out.println(-1);
      } else {
         while (amount <= cost) {//170<1070
             // 총 수입
        	 amount= C * n;//170

             // 총 비용
              cost= A + (B * n); //1070
            n++;
          
         }
         System.out.println(n);
      }


   }

}