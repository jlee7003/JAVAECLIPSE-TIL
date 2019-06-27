package Date625;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_SELECT2 
{
	
	Connection conn; //객체생성을 해야함으로 생성자에서 객체생성을 해줌
	Statement stmt;//
	String sql; 
	Scanner sc=new Scanner(System.in);
	ResultSet rs; //변수의 타입형을 적어주었는데 하단에 다시 적을 경우 java.lang.NullPointerException error가 발생하게 됨
	//클래스 변수 초기화를 위한 생성자내에 코딩
	
	DB_SELECT2() throws SQLException
	{
	 conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false","root","1234");
     stmt=conn.createStatement();
	}
	
   public void all_chul() throws SQLException
   {
	   System.out.println("-전체출력-");
	 sql= "select * from member order by age desc";
	 chul(sql);
	
	 
   }
   public void name_chul() throws SQLException
   {
	   System.out.println("-이름검색-");
	   System.out.println("검색할 이름을 입력하십시오");
	   String search=sc.next();
	 sql="select * from member where name like '%"+search+"%'";
	 chul(sql);
	
   }
   public void phone_chul() throws SQLException
   {
	   
	   System.out.println("-번호검색-");
	   System.out.println("검색할 전화번호를 입력하십시오");
	   String search=sc.next();
	 sql="select * from member where phone like '%"+search+"%'";
	 chul(sql);
	   
   }
   public void juso_chul() throws SQLException
   {
	   System.out.println("-주소검색-");
	   System.out.println("검색할 주소를 입력하십시오");
	   String search=sc.next();
	 sql="select * from member where juso like '%"+search+"%'";
	 chul(sql);
	 
   }
   public void insert() throws SQLException
	 {
	   System.out.println("-회원입력-");
	   System.out.print("이름: ");
	   String name=sc.next();
	   System.out.print("전화번호: ");
	   String phone=sc.next();
	   System.out.print("나이: ");
	   int age=sc.nextInt();
	   System.out.print("주소: ");
	   String juso=sc.next();
		 sql="insert into member(name,phone,age,juso) values('"+name+"','"+phone+"',"+age+",'"+juso+"')";
	   //데이터베이스에 변화가 없을 경우 stmt.executeUpdate(sql); 같이 하면 된다. ResultSet 처리를 해줄 필요가 없다.
		 stmt.executeUpdate(sql);
	 }
	 public void delete() throws SQLException
	 {
		 System.out.println("-회원삭제-");
		 System.out.print("삭제할 아이디: ");
		 int id=sc.nextInt();
		 sql="delete from member where id='"+id+"'";
		   //데이터베이스에 변화가 없을 경우 stmt.executeUpdate(sql); 같이 하면 된다. ResultSet 처리를 해줄 필요가 없다.
			 stmt.executeUpdate(sql);
			 
	 }
	 public void search(int ee) throws SQLException
	 {
		 
		 switch(ee)
		 {
		 case 1: all_chul();  break;
		   case 2: name_chul();  break;
		   case 3: phone_chul();  break;
		   case 4: juso_chul();  break;
		 }
		 /*System.out.println("-통합검색-");
		 System.out.print("이름: ");
		 String search1=sc.next();
		 System.out.print("번호: ");
		 String search2=sc.next();
		 System.out.print("주소: ");
		 String search3=sc.next();
		 sql="select * from member where name like '%"+search1+"%' "
		 		+ "and phone like '%"+search2+"%' and juso like '%"+search3+"%'";
		 chul(sql);*/
	 }
	 
	 public void chul(String sql) throws SQLException
	 {
		 rs=stmt.executeQuery(sql);
		 while(rs.next()) //rs.next()는 다음레코드 이동=> 다음레코드 있으면 true 없으면 false;
	     {
			 System.out.printf("%10s",rs.getString("id"));
		   System.out.printf("%10s",rs.getString("name"));
		   System.out.printf("%15s",rs.getString("phone"));
		   System.out.printf("%10s",rs.getString("age"));
		   System.out.printf("%10s",rs.getString("juso"));
		   System.out.println();
		 }
	 }
	
}
