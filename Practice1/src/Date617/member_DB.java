package Date617;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class member_DB //member 테이블과의 검색 ,입력 ,삭제 ,수정
{
	Connection conn;
	Statement stmt; //속성을 적는 곳에 기능을 적어줘서 오류가 난것 속성에는 어떠한 값만 들어가야한다. 
	                //그러므로 객체를 만들어 생성자로 활용
		Scanner sc;
		
		
member_DB() throws SQLException //객체변수생성은 생성자를 통하여 만듬
{
	conn= DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false","root","1234");
	stmt=conn.createStatement();
	sc=new Scanner(System.in);
		 
}
  public void insert() throws SQLException
  {
	     System.out.print("이름을 입력해주세요 :");
		 String nameI = sc.next();
		//sc.nextLine();-> 비어있는 값이 있을 경우 입력
		 System.out.print("전화번호를 입력해주세요 :");
		 String phoneI= sc.next();
		
		 System.out.print("주소를 넣어주세요 :");
		 String jusoI = sc.next();
		 System.out.print("나이를 입력해주세요 :");
		 int ageI = sc.nextInt();
		 String sql="insert into member(name, phone, age, juso) values('"+nameI+"','"+phoneI+"',"+ageI+",'"+jusoI+"')";
		 
		 System.out.println("입력이 완료되었습니다.");
				 
		 stmt.executeUpdate(sql);
  }
  public void select() throws SQLException
  {
	  String sql="select * from member";
		
		ResultSet rs; // 테이블내용을 읽어와서 저장할 공간
		rs=stmt.executeQuery(sql);//select 명령을 실행한 결과값을 rs에 저장 ,항목으로 불러야함
		rs.last(); //rs객체의 가장 끝으로 이동
		//first, beforefirst
		int len=rs.getRow(); //레코드의 갯수를 len 변수에 저장
		rs.first();//rs.last(); ->레코드 포인트를 마지막 레코드행으로 지정 
		//이름,전화번호,나이,주소 전부 출력하기;
	    // System.out.Printf("%10s",rs.getString("name"));
		                     //10칸 짜리 문자열로 출력하라 %는 s가 문자열임을 표현
		for(int i=1;i<=len;i++)
		{
		System.out.printf("%15s",rs.getString("id"));
		System.out.print("/");
		System.out.printf("%15s",rs.getString("name"));
		System.out.print("/");
		System.out.printf("%15s",rs.getString("phone"));
		System.out.print("/");
		System.out.printf("%15s",rs.getString("age"));
		System.out.print("/");
		System.out.printf("%15s",rs.getString("juso"));
		rs.next();
		System.out.println();
		}
  }
  public void update() throws SQLException
  {
	  System.out.println("변경하실 아이디는 무엇입니까?");
		 int id = sc.nextInt();
		 System.out.println("1:이름/2:전화번호/3:주소/4:나이");
		 int ch = sc.nextInt();
		 String ppp=""; //sql에서 오류가 나기에 ""으로 일단 값을 줘야함
		 switch(ch)
		 {
		  case 1:System.out.print("변경하실 이름 값을 입력하시오 :");
			  String b = sc.next();
			  ppp="name='"+b+"'"; break;
		  case 2:System.out.print("변경하실 전화 값을 입력하시오 :");
			  String c = sc.next();
			  ppp="phone='"+c+"'"; break;
		  case 3:System.out.print("변경하실 주소 값을 입력하시오 :");
			  String a = sc.next();
			  ppp="juso='"+a+"'"; break;
		  case 4:System.out.print("변경하실 나이 값을 입력하시오 :");
			  String d = sc.next();
			  ppp="age="+d;
			  
		 }
		String sql="update member set "+ppp+" where id="+id;
		 stmt.executeUpdate(sql);
		System.out.println(sql);
  }
  public void delete() throws SQLException
  {
	  System.out.print("몇번 레코드를 지울껀가요? :");
		 String IDI = sc.next();
				 
		 String sql="delete from member where id='"+IDI+"'";
		 
		 System.out.println("입력이 완료되었습니다.");
		 
		 stmt.executeUpdate(sql);
  }
  
}
