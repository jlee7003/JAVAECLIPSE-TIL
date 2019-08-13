
public class instance_main {

	public static void main(String[] args) {
		//________Instance_Nested_______
//		Instance_Nested in=new Instance_Nested();
//		in.kor=99;
//		in.chul();
//		Instance_Nested.inner ini=in.new inner(); //내부클래스 객체 생성
//		ini.num=77;
//		ini.chul();
		//______outter_____
//		outter ot=new outter();
//		outter.inner2 oti=ot.new inner2();
//		ot.kor=99;
//		oti.eng=88;
//		oti.hap();
//		ot.chul();
		//______outter2______
//		outter2.inner3 oti=new outter2.inner3();
//		oti.kor=77;
//		oti.chul();
		//outter2.inner3.output(); //스태틱클래스의 스태틱 메소드는 이런식으로 접근해도 가능함,
		// outter2에 static class inner3으 객체 생성 없이도 가져올수 있음 스태틱이므로
		//___________nested_method___________
//		nested_method ni=new nested_method();
//		ni.output();
		//______interface_nested________
//		Inter_imple ii=new Inter_imple();
//		ii.test();
		//______________
		multiclass mc=new multiclass();
		mc.chul();
		multiclass.AAA mca= mc.new AAA();	multiclass 안에 들어가있는 aaa 초기화하기
		mca.chul();
		multiclass.AAA.BBB mcab= mca.new BBB(); //class aaa에 들어있는 bbb 초기화하기
		mcab.chul();
	}

}
