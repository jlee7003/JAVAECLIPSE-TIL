import java.io.*;
import java.util.*;

public class buffer_StringTokenizer {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringTokenizer st = new StringTokenizer( br.readLine() );
		
		int T = Integer.parseInt( br.readLine() );
		int N = Integer.parseInt( st.nextToken() );
		
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
		bw.write( "Hello World!!\n" );
		bw.write(T+"=");
		System.out.println(T+"eqeq");
		bw.write(N+";");
		bw.flush();
		bw.close();
	
	}
}
