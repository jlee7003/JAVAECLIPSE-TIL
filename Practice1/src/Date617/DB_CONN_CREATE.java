package Date617;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class DB_CONN_CREATE 
{
	//java.sql.* -> java에서 sql과 관련된 API
    //connection class -> java에서 제공되는 API -> DB서버와 연결
	//Statement class -> 쿼리문의 실행
	//Resultset class -> DB에 있는 테이블의 내용을 가져와서 저장하는 곳
	                 //  프로그램에서 사용할 목적으로 사용되는 공간
	 public static void main(String[] args) throws SQLException//메인함수는 가상머신
	 {
		 
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java?useSSL=false","root","apmsetup");
		
			Statement stmt=conn.createStatement();
			
			String sql="create table test(aa int)";
			
			stmt.executeUpdate(sql);
			
			stmt.close();//데이터 커넥션을 닫아주기 위한 명령어
			conn.close();//데이터 커넥션을 닫아주기 위한 명령어
			
		 //이클립스에서 예외가 발생할수 있음을 경고 에러가 아님
		 
		 /* 예외처리
		  * 
		  * public void 함수()
		  * {
		  *    실행문: 예외가 발생할 수 있는 문장일 경우 -> 예외처리 방법 서술
		  * }
		  * 1. try-catch문을 통해서 (예외발생시 프로그램 종료 -> 프로그램이 계속 실행)
		  * public void 함수 ()
		  * {
		  *    try
		  *    {
		  *     실행문
		  *    }
		  *     catch(예외클래스 변수명 e) // 예외클래스명은 실행문에서 발생 예측 가능한 예외
		  *    {
		  *     위의 실행문에서 에러가 발생했을 경우 실행할 문장을 서술
		  *    }
		  * }
		  * 2. throw를 통한 예외처리 // 에러 났으니까 니가 알아서해 함수를 호출한 놈한테 던지는것(예외를 보내는것)
		  *                   // 팀플을 할때 
		  * public void 함수()
		  * {
		  *   실행문: // 예외 발생시 트라이 캐치가 아니고 throw로 예외를 넘긴다
		  * }
		  * 
		  * public static void main (String[] args) //메인 함수에서 예외처리를 받아서 직접 하는 것
		  * {
		  * 
		  *   try
		  *    {
		  *     함수명(): //메인에서 위의 함수를 호출했다고 할때
		  *    }
		  *     catch(예외클래스 변수명 e)
		  *    {
		  *     위의 실행문에서 에러가 발생했을 경우 실행할 문장을 서술
		  *    }
		  *   
		  * }
		  * 
		  * 
		  * 
		  * 
		  * 
		  * 
		  * 
		  * 
		  * 
		  * 
		  * */
		 
	 }
}
