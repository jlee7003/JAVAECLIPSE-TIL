package Generic_0819;

import java.io.File;

public class File_class2
{
	
	 public static void main(String[] args) 
	 {
		 //디렉토리 생성
		 //파일 삭제, 이름변경
		 File f1=new File("c:/anthony");
		 f1.mkdir();//make directory
		 
		 File f2=new File("C:\\APM_Setup\\htdocs/bb.jpg");
		 if(f2.exists())
		 {
		 f2.delete(); //삭제하기
		 System.out.println("삭제 되었습니다.");
		 }
		 else
			 System.out.println("존재하지 않습니다.");
		 
		 File f3=new File("C:\\APM_Setup\\htdocs/교수님 자료.zip");
		 File f4=new File("C:\\APM_Setup\\htdocs/bb.jpg");
		 f3.renameTo(f4);
	 }

}
