package NUM1000;

public class p142_글자검색기 {

	public static void main(String[] args) {
		String s="no news is good news";
		int n=0;
		


		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!='o')
			{
				continue;
			}
			
			n++;
			
		}
		System.out.println("문장에서 발견된 n의 개수"+n);
		System.out.println(s.length());//문장 s의 길이 
	}

}
