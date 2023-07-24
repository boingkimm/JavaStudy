package exam09;  //메서드 재정의

import java.io.IOException;

class Parent{
	public void a() throws RuntimeException{}
	public void b() throws RuntimeException{}
	public void c() throws RuntimeException{}
}

class Child extends Parent{
	
	//재정의 : 같거나 축소(하위계층), 같은 계열만 사용
	public void a() {}
	public void b() throws ArithmeticException {}
//	public void c() throws IOException {}   //에러
	
}

public class ExceptionTest7 {

	public static void main(String[] args) {

	}
}

