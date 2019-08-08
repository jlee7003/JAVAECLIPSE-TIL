
public class Init_class 
{
 int kor;
 int eng;
	
	Init_class()
	{
		kor= 100;
		eng=99;
		System.out.println(kor+eng);
	}
}

class Init_class1
{
	int kor;
	int eng;
	{ //초기화 블럭을 통한 값을 할당 보기 편하라고 나누어 놓은것
		kor=90;
		eng=88;
	}
	Init_class1(){
		System.out.println(kor+eng);
	}
}
//매개값과 리턴값 

//기본형, 참조형
//기본형: 값 그 자체를 의미함
//참조형: 10000원이 들어있는 통장을 주는 방식
//      메모리에 있는 주소를 주는 방식