
public class date513_main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		date513_9 aa=new date513_9();
		// 3���� ������ ���� ����� ���Ͻÿ�
		aa.input(); //ù��° input ���� hap1���� ����
		int hap1=aa.stand();
		
		aa.input();//�ι�° input ���� hap1���� ����
		int hap2=aa.stand();
		
		aa.input();//����° input ���� hap1���� ����
		int hap3=aa.stand();
		
		
		int hap=hap1+hap2+hap3;
		System.out.print(hap/3);
		
		
	}

}
