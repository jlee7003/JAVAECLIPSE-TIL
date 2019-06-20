import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Member_DB // member테이블과의 검색,입력,삭제,수정
{
	Connection conn;
	Statement stmt; 
	Scanner sc;  // 클래스의 멤버변수를 정의
	
	Member_DB() throws SQLException // 객체변수생성은 생성자를 통하여
	{
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false","root","1234");
		stmt=conn.createStatement();
		sc=new Scanner(System.in);
	}
	
	public void insert() throws SQLException
	{
		System.out.print("이름 : ");
		String name=sc.next();
		   
		System.out.print("전화번호 : ");
		String phone=sc.next();
		   
		System.out.print("나이 : ");
		String age=sc.next();
		  
		System.out.print("주소 : ");
		String juso=sc.next();

		String sql="insert into member(name,phone,age,juso) ";
		sql=sql+" values('"+name+"','"+phone+"',"+age+",'"+juso+"')";
			 
		stmt.executeUpdate(sql);
	}
	public void select() throws SQLException
	{
		String sql="select * from member";
		ResultSet rs=stmt.executeQuery(sql);
		rs.last(); // rs객체의 가장끝으로 이동
	    int len=rs.getRow(); // 레코드의 갯수를 len변수에 저장
	    rs.first(); // rs객체의 첫번째 레코드로 이동
	    // 이름 , 전화번호, 나이, 주소 전부 출력하기
	    for(int i=1;i<=len;i++)
	    {
	      System.out.printf("%3s",rs.getString("id"));
	      System.out.printf("%15s",rs.getString("phone"));
	      System.out.printf("%4s",rs.getString("age"));
	      System.out.printf("%10s",rs.getString("juso"));
	      System.out.printf("%10s",rs.getString("name"));
	      rs.next();
	      System.out.println();
	    }
	}
	public void update() throws SQLException
	{
		System.out.println("수정할 레코드의 id를 입력하세요");
		int id=sc.nextInt();
		System.out.println("1은 이름, 2는 전화번호, 3은 나이, 4는 주소");
		int ch=sc.nextInt();
		System.out.println("수정할 값을 입력하시오");
		String chg=sc.next();
		
		String ppp="";
		
		switch(ch)
		{
		  case 1: ppp="name='"+chg+"'"; break; // name='이름'
		  case 2: ppp="phone='"+chg+"'"; break; // phone='전화번호'
		  case 3: ppp="age="+chg; break; // age=나이
		  case 4: ppp="juso='"+chg+"'"; break; // juso='주소'
		}
		
		 String sql="update member set "+ppp+" where id="+id;
		           // update member set name='홍길동' where id=3 
		 stmt.executeUpdate(sql);
		
		
		
	}
	public void delete() throws SQLException
	{
		// 삭제할 레코드의 id를 입력받느다.
		System.out.print("삭제할 레코드의 id를 입력하세요 : ");
		int id=sc.nextInt();
		// 삭제할 쿼리문을 작성
		String sql="delete from member where id="+id;
		// 쿼리 실행
		stmt.executeUpdate(sql);
	}
}








