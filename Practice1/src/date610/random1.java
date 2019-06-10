package date610;

import java.util.Random;

public class random1 
{
  public static void main(String[] args)
  {
	  Random rd=new Random();
	  
	  boolean r1=rd.nextBoolean();
	  System.out.println(r1);
	  
	  double r2=rd.nextDouble();
	  System.out.println(r2);
	  
	  int r3=rd.nextInt();
	  System.out.println(r3);
	  
	  int r4=rd.nextInt(5); //2보다 작은 정수의 형태 출력
	  System.out.println(r4);
	  
	  int lot=rd.nextInt(45)+1;// 45를 입력하면 (0~44) 그래서 1을 더하는 것
	  System.out.println(lot);
	  int lot2;
	  int n=0;
	  for(;;)//반볻문
	  {
	
	  lot2=rd.nextInt(79)+1+1020;// 마지막값-시작값  / 시작값 
	  if(lot==1079)
		  break;  //lot이 1079가 나오면 메소드를 break해준다.(종료)
	              //break 종료명령문 제어문 종료
	           
	  n++;
	  }
	  System.out.println(lot2+" "+n);
	  
	  //무한 반복 
	  
	  //for문 while문이 끝나지 않는것
	  //for(int i=0;i=0;i<0;)
	  //for(;;)무한반복
	  //{
	  //  반복문; 
	  //}
	  //
	  //while(true)
	  //{
	  //
	  //}
  }
}

