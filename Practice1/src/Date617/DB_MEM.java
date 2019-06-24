package Date617;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_MEM 
{
	/*클래스에서 선언한 변수와 함수에서 선언한 똑같은 이름의 변수는 다른 변수임
	->함수는 가까운 변수 부터 찾게 됨 만약 같은 공간에 변수가 없다면 밖의 변수를 가져오게 됨 
	 지역변수(함수 안),전역변수(함수 밖)*/
	//클래스는 속성과 메소드로 구성 되어있다.
	//외부에서 입력된 이름,전화번호,나이를 가져와서
	//name char(10) not null -> name 값을 필수로
	Connection conn;//프로그래밍언어와 DB서버의 연결 
	Statement stmt;// DB서버에 쿼리를 실행할 클래스
	
	
	DB_MEM() throws SQLException
	{//connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false","root","1234");
	  //-> 이렇게 하면 지역변수가 되어 원래의 connection이 초기화되어 java.lang.NullPointerException error가 발생한다.
		conn= DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false","root","1234");
	 stmt=conn.createStatement();
	}


	 public void insert(String name,String phone,int age) throws SQLException
	  { //입력된 값을 member2 테이블에 저장
         String sql="insert into member2(name, phone, age) values('"+name+"','"+phone+"',"+age+")";
		 
		 System.out.println("입력이 완료되었습니다.");
				 
		 stmt.executeUpdate(sql);
      }
	 
	 

	 public void insert(String name,String phone,int age,String juso) throws SQLException
	  { //입력된 값을 member2 테이블에 저장
	 String sql="insert into member(name, phone, age, juso) values('"+name+"','"+phone+"',"+age+",'"+juso+"')";
	 
	 System.out.println("입력이 완료되었습니다.");
			 
	 stmt.executeUpdate(sql);
	  }
	 //매개변수가 4개라면 member table에 값을 넣는 메소드를 만들어라
	 
}
