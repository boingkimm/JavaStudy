package exam09;

class Test2{   //try-catch
	public void a() {
		System.out.println("Test.a");
		//연산작업
		try {
			int num = 0;
			int result = 10/num;    //예외발생
			System.out.println("결과값:" + result);
		}catch (ArithmeticException e) {	//예외처리 ==> 정상종료	//적합한 클래스, 다형성 적용 가능, 디테일한 클래스 사용 권장
			System.out.println("error: 0으로 나누어 발생");
			System.out.println("error:" + e.getMessage());	// / by zero
			e.printStackTrace();   // 예외발생시 개발자가 디버깅용으로 사용함. 메시지+히스토리 보여줌
		}
	}
}



public class ExceptionTest3 {

	public static void main(String[] args) {

		//정상종료
		System.out.println("1");
		System.out.println("2");
		
		Test2 t = new Test2();
		t.a();
		
		System.out.println("end. 정상종료");
	}
}

