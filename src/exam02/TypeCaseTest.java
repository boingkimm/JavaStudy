package exam02;

public class TypeCaseTest {

	public static void main(String[] args) {

		// 1. 묵시적 형변환
		
		// 가. byte > short > int > long > float > double
		// 큰 타입 = 작은 타입
		byte b = 10;
		short b2 = b; //1byte -> 2byte 변경
		int b3 = b2;  //2byte -> 4byte 변경
		long b4 = b3;
		float f = b4;
		double f2 = f;
		double f3 = b;
		
		// 작은 타입 = 큰 타입 : error (해결: 강제적 형변환 시킨다.)
		float x = 3.14F;
//		int x2 = x;
		
		
		// 나. char -> int (아스키코드값)
		char c = 'A';  // A:65
		char c2 = 'a'; // a:97
		int n = c;
		int n2 = c2;
		System.out.println(n+" "+n2);  //65 97
		System.out.println('A'+1);  //66, 문자를 연산 가능!
		
		// 다. int보다 작은 데이터형의 연산은  int로 반환
		short s = 10;
		short s2 = 10;
//		short s3 = s + s2;  // short(2byte)끼리 더하면 int(4byte)형식으로 처리됨
		
		// 라. 큰 타입과 작은 타입의 연산은 큰 타입으로 반환
		float ff = 3.14F;
		int mm = 10;
		float ff2 = ff + mm;
		
	}

}
