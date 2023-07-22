package exam02;

public class OperatorTest {

	public static void main(String[] args) {

		//1. 산술연산자
		int n = 10;
		int n2 = 3;
		
		System.out.println(n+n2);
		System.out.println(n-n2);
		System.out.println(n*n2);
		System.out.println(n/n2);  // 3 몫만 반환
		System.out.println(n/3.0);  // 연산을 실수값으로 해야 소수점까지 나옴
		
		float f = n/n2;
		System.out.println(f);  //3.0 
		
		System.out.println(n%n2);
		
		// + : 연결연산자로서 사용가능  (=JS)
		String k = 10 + 20 + 30 + "hello";
		String k2 ="hello" + 10 + 20 + 30;  // 처음부터 문자열
		System.out.println(k);
		System.out.println(k2);
	}

}
