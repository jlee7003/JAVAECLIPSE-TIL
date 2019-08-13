
public class parent_main {

	public static void main(String[] args) {
//		parent p=new parent();
//		p.cal();
//		son s=new son(1,39);
//		s.total();
		son2 s2= new son2(22, 44);
		s2.cal(); //parent에 있는 메소드를 son2에서 사용할수 있게 됨
		s2.total();
	}
}
