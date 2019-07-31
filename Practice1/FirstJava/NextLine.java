import java.util.Scanner;
public class NextLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
System.out.print("많은 단어들을 입력 하시오");
String line = sc.nextLine();
String word = sc.next();
System.out.println("="+line); //라인은 개행문자(공백 까지 포함하여 출력하고)
System.out.println("e"+word); // next는 뛰어쓰기가 들어온 순간 부터 출력에서 제외시킨다.

	}

}
