package File__0821;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_output {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("C:\\APM_Setup\\htdocs/ababab.html"); //stream -> 읽어온게 바이트 단위
		FileOutputStream fos2=new FileOutputStream("C:\\APM_Setup\\htdocs/bbbbbb.html",true); //stream -> 읽어온게 바이트 단위, 실행 할때 마다 글이 덧 작성됨 중복가능

		String str="<b>안녕하세용! </b>"; //한 문자씩 짤라서 byte배열에 넣어줌
		
		byte[] ss=str.getBytes(); //문자열을 getBytes()하는 메소드를 통해 byte배열로 변셩
		
		fos.write(ss);//byte 배열이 들어가야함
		fos2.write(ss);//byte 배열이 들어가야함
		
	}
	
}
