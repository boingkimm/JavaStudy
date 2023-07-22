package exam08_1;

public class StringTest {

	public static void main(String[] args) {

		// 1. String클래스 이용한 문자열 생성
		
		// 가. literal (일반적 방법)  => 동일한 문자열이면 재사용 (새로 생성x), 같은 주소값.
		String s = "hello";
		String s2 = "hello";
		
		// 나. new  => 동일한 문자열이라도 매번 생성됨 (heap메모리에), 다른 주소값.
		String x = new String("hello");
		String x2 = new String("hello");
				
		
		System.out.println(s);
		System.out.println(x);
		System.out.println(s==s2);  //주소값이 같냐  true
		System.out.println(x==x2);  //주소값이 같냐 false
		// 문자열 비교는 절대로 == 하면 안됨. 같은 문자열인데 false나옴 주소값 달라서
		// 문자열 비교는 equals메서드 사용!
		System.out.println(s.equals(s2));  //true
		System.out.println(x.equals(x2));  //true
	}

}
