package date610;

import java.util.Random;

public class random1 
{
  public static void main(String[] args)
  {
	  Random rd=new Random();
	  
	  boolean r1=rd.nextBoolean();
	  System.out.println(r1);
	  
	  double r2=rd.nextDouble();
	  System.out.println(r2);
	  
	  int r3=rd.nextInt();
	  System.out.println(r3);
	  
	  int r4=rd.nextInt(5); //2���� ���� ������ ���� ���
	  System.out.println(r4);
	  
	  int lot=rd.nextInt(45)+1;// 45�� �Է��ϸ� (0~44) �׷��� 1�� ���ϴ� ��
	  System.out.println(lot);
	  int lot2;
	  int n=0;
	  for(;;)//�ݓ���
	  {
	
	  lot2=rd.nextInt(79)+1+1020;// ��������-���۰�  / ���۰� 
	  if(lot==1079)
		  break;  //lot�� 1079�� ������ �޼ҵ带 break���ش�.(����)
	              //break �����ɹ� ��� ����
	           
	  n++;
	  }
	  System.out.println(lot2+" "+n);
	  
	  //���� �ݺ� 
	  
	  //for�� while���� ������ �ʴ°�
	  //for(int i=0;i=0;i<0;)
	  //for(;;)���ѹݺ�
	  //{
	  //  �ݺ���; 
	  //}
	  //
	  //while(true)
	  //{
	  //
	  //}
  }
}

