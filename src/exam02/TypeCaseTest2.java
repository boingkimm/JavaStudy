package exam02;

public class TypeCaseTest2 {

	public static void main(String[] args) {

		// 1. 묵시적 형변환
		// upcasting, 작은 타입이 큰 타입으로
		
		// 가. byte > short > int > long > float > double , 큰 타입 = 작은 타입
		// 나. char -> int (아스키코드값)
		// 다. int보다 작은 데이터형의 연산은  int로 반환
		// 라. 큰 타입과 작은 타입의 연산은 큰 타입으로 반환

		// 2. 명시적 형변환: (데이터타입) <= 형변환 연산자,  작은타입=(작은타입)큰타입;
		// downcasting, 큰 타입이 작은 타입으로
		int n = 10;
		short n2 = (short)n;  //4바이트를 2바이트로 바꿔서 저장
		
	}

}
