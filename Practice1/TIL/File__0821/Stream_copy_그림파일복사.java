package File__0821;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Stream_copy_그림파일복사 {
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis=new FileInputStream("d:/pkc/a.jpg");
		FileOutputStream fos=new FileOutputStream("d:/pkc/b.jpg");
		
//		System.out.println(fis.read());
//		System.out.println(fis.read());// 끝-> -1
		long start=System.currentTimeMillis();
		int i;
		byte[] img=new byte[1000];
		while((i=fis.read(img)) != -1) //바이트 배열이름을 read메소드 안에다가 넣어주어야함
		{
			fos.write(img); //write()-> 매개변수 int, byte[]
		}
		long end=System.currentTimeMillis();
		System.out.println("걸린시간: "+(end-start));
	
	}
}
