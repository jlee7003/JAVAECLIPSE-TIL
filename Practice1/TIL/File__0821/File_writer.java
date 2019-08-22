package File__0821;

import java.io.*;
import java.util.Scanner;

public class File_writer {
	
	public static void main(String[] args) throws IOException {
		FileWriter fw1=new FileWriter("d:/a.txt");
		FileWriter fw2=new FileWriter("d:/b.txt");// true가 없다면 새로 만든다
		FileWriter fw3=new FileWriter("d:/c.txt",true); //추가 개념
		String str="안녕하세여";
		fw1.write(str);
		
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		fw2.write(str);
		
		fw3.write(str);
		
		fw1.close();
		fw2.close();
		fw3.close();
	}
}
