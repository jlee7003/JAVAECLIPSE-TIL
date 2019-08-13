import java.io.FileNotFoundException;
import java.io.FileReader;

public class 예외처리2 {
	public static void main(String[] args) {

		try {
			int a = 100;
			int b = 10;
			int c = a / b;

			int[] arr = new int[3];
			//arr[3] = 99;
			
			FileReader fr1=new FileReader("d:/abc.txt"); //파일을 찾는 메소드
		} catch (ArithmeticException e) {// -> 어떠한 에러가 발생할지 모를때 혹은 
			// 어떤 예외가 오더라도 catch 실행문의 내용이 같을때
			// 2개 이상의 예외가 발생할때 예외 별로 catch문을 만든다.
		
			System.out.println("0으로는 나눌 수 없습니다.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 밖의 값을 입력");			
		}catch(FileNotFoundException e)
		{
			System.out.println("파일이 없습니다.");
		}catch(Exception e) //모든 예외를 거를수 있으므로 맨 위에 있을 경우에 에러가 발생 항상 마지막에 Exception을 적어줄것
		{
		 System.out.println("알수 없는 예외 발생");	
		}
		finally { //예외가 발생하더라도 실행됌, 예외처리를 하고 나서 throw를 하게 되면
			//하단의 메소드들은 실행이 안될수 있으므로 finally를 써서 실행시킴
			//catch 문에서 실행방향이 현재파일 아래로 이동x
			//다른 수문으로 이동할때 현재문서에서의 객체를 닫을때 
			//finally에서 처리함
			System.out.println("finally");
		}
		System.out.println("계속 프로그램이 실행");

	}
}
//1.예외 발생 -> 에러, 연결, 클래스

//발생한 예외 처리방법
/*
* (1). try~catch -> 예외에 대한 내용을 catch문 내에 처리 
* (2). throws =
*/
