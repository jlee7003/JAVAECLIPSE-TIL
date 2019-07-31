package CH6;

public class Q2 {

	public static void main(String[] args) {
		boolean[] isNotSelfNumber = new boolean[10001];

		for (int i = 1; i < 10000; ++i) { // for문의 후위증가 -> i의 값을 먼저 리턴하고 , 그후에 i의 값을 1 증가시킴
			int dn = getDn(i); // i의 값이 10000까지 증가
			if (dn <= 10000) { // dn이 10000보다 작다면 배열에 true 값을 전달
				isNotSelfNumber[dn] = true;
			}

		}
		
		for(int i=1; i< isNotSelfNumber.length;++i) {//notselfnumber의 길이만큼 반복
			if(!isNotSelfNumber[i]) {
				System.out.println(i);
			}
		}

	}

	private static int getDn(int n) {
		int dn = n;//24=24  2=2
		while (n > 0) {//24>0  2>0
			dn += n % 10;//dn= dn+n %10 과 같음 28=24+24%10(이 과정에서 4(1의 자리)를 더함)   4=2+2%10
			n /= 10; //n=n+10 과 같음 n=2 n=0 //10의 자리수
		}
		return dn;
	}
}