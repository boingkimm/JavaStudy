package exam09;  //명시적 예외발생 - throw
// 실제적용: DB에서 원하는 값을 못찾을 때.

import java.util.Random;

class MyRandom{
	
	public void rand() throws RuntimeException{
		
		Random r = new Random();
		int n = r.nextInt(3); // 0~2 랜덤 정수 반환
		
		// 가정: 0이 나오면 시스템에 불량이 생길 수 있다. (0: 자연스러운 상황 - 예외발생X)
		if(n==0)throw new RuntimeException("랜덤값이 0 출력. 예외발생");   //예외클래스를 객체생성해서 throw
		System.out.println(n);
	}
}


public class ExceptionTest8 {

	public static void main(String[] args) {

		MyRandom x = new MyRandom();
		try {
			x.rand();
		}catch (RuntimeException e) {
			System.out.println("error 발생 " + e.getMessage());
		}catch (Exception e) {
			System.out.println("error 발생");
		}
		System.out.println("End");
	}
}

