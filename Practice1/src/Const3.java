
public class Const3 
{
   int kor; //�Ķ��� ��������
   int eng;
   int mat;
  /* public void chul() //�����ڿ� �޼ҵ�� ���� ��
   {
	  //int kor=88;   //��������,�������� =>�ڱ� �ڽſ��� ����� ������ ã��
	   
	   System.out.println(kor);      //���� chul �޼ҵ��� kor��
	   System.out.println(this.kor); //�ʱ��� �� ȣ�� �ʱ��� kor ��
   }
   */
   //������
   Const3(int kor,int eng,int mat)
   {
	   this.kor=kor; // this-> �ʱ��� kor �� �ҷ����� this�� ���� Ŭ������ ���� ����Ų��.
	   this.eng=eng;
	   this.mat=mat;
   }
   
   public void chul()
   {
	   System.out.println(kor);
	   System.out.println(eng);
	   System.out.println(mat);
   }
   //�޼ҵ�
   public void input(int kor,int eng,int mat)
   {
	   this.kor=kor;
	   this.eng=eng;
	   this.mat=mat;
   }
}
