package exam07_5;

//인터페이스

interface Y1{
	// 인터페이스 내에 올 수 있는 것
	// 1. 상수
	final int NUM = 10; //상수(접근지정자 원래 default), 자동으로 public static final지정된다.
	int SIZE = 20; //변수같아보이지만 이탤릭체 - 상수! 자동으로 public static final지정된다.
	// final 있어도 없어도 대문자 이탤릭체 상수임. 
	public static final int COUNT = 30;  //권장. 헷갈리니까
	
	// 2.추상메서드  : 인터페이스를 사용하는 가장 큰 목적!
	public abstract void a();  //권장
	public void a2();   //자동으로 public abstract 지정된다.
	void a3();   //default 접근지정자로 보이지만 public
	
	// 3.default 메서드
	public default void b() {
		System.out.println("default 메서드");
	}
	
	// 4.static 메서드
	public static void c() {
		System.out.println("static 메서드");
	}
}
	
////////////////////////////////////////////

interface Y2 {
	public abstract void x();
}

interface Y3 {
	public abstract void x2();
}

//에러뜨면 클릭해서 Add unimplemented methods로 구현해서 해결 (재정의!)
class K implements Y2{  //구현

	@Override
	public void x() {
	}
	
}

class K2 implements Y2, Y3{  //다중구현

	@Override
	public void x2() {
	}

	@Override
	public void x() {
	}

}

//인터페이스 간 상속 ( 다중상속 가능 )
interface Y4 extends Y2, Y3{
	
}


//상속 및 구현
class K3 extends Object implements Y2, Y3{

	@Override
	public void x2() {
	}

	@Override
	public void x() {
	}
	
}

class Z implements Y1{

	@Override
	public void a() {
		System.out.println("a");
	}

	@Override
	public void a2() {
		System.out.println("a2");
	}

	@Override
	public void a3() {
		System.out.println("a3");
	}
	
}



public class InterfaceTest {

	public static void main(String[] args) {

//		Y2 y = new Y2(); // new불가
		
		K k = new K();
		k.x();		
		//모든 k가 x를 가질 수 밖에 없음
		
		//다형성 ( 매우 중요, 자주 씀 )
		Y2 k2 = new K();
		k2.x();
		
		//
		Z z = new Z();
		z.a();
		z.a2();
		z.a3();
		System.out.println(Y1.NUM);
		System.out.println(Y1.SIZE);
		System.out.println(Y1.COUNT);
		z.b(); //default메서드는 일반클래스의 concrete메서드처럼 사용
		Y1.c(); //static메서드
	}

}
