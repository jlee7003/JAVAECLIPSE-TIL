package File__0821;

import java.io.*;


public class File_copybuffer 
{
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("d:/1.jpg");//읽어올 대상
		BufferedReader br=new BufferedReader(fr);//매개변수로서 문자열은 없음
		//보조수단으로 buffer를 사용함,파일에 접근하려하면 file reader로 접근하면 된다.
		//생성자에 들어갈 값은 fr//파일 reader의 객체가 꼭 들어가야함
		FileWriter fw=new FileWriter("d:/2.jpg");//쓰는 대상
		//그림파일은 복사는 되지만 바이트 형식으로 복사가 되는게 아니라 실행시 오류가 발생함
		BufferedWriter bw=new BufferedWriter(fw);//매개변수로서 문자열은 없음

		
		int tt;

		char[] input=new char[100]; 
		String str="";
		while((tt=fr.read(input)) != -1)//-1이면 글자가 없다는 뜻
		{
			str= str+new String(input,0,tt);
		
		}
		
		bw.write(str); //작성
		
		br.close();
		bw.close();//먼저 종료 시켜야 한다 br이 fr의 객체를 사용하기에 먼저종료하면 에러발생
		fr.close();
		fw.close();
	}
}
