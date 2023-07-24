package exam09;

class Test3{   //다중catch문, finally문

	public void a() {
		System.out.println("Test.a");
		//연산작업
		try {
			
			// ArithmeticException 발생 가능한 코드
			int num = 2;
			int result= 10/num;  
			System.out.println("결과값:" + result);
			
			// NullPointerException 발생 가능한 코드
			String n=null;
			System.out.println(n.length());	
			
		}catch (ArithmeticException e) {
			System.out.println("error: 0으로 나누어 발생");
		}catch (NullPointerException e) {
			System.out.println("error: 객체 생성 필요");
		}catch (Exception e) {   //가장 마지막에 사용 (관례적)
			System.out.println("error 발생");
			
		}finally {
			System.out.println("finally: 무조건 실행되는 문장");  //일반적으로 외부파일/DB의  close 작업수행
		}
	}
}



public class ExceptionTest4 {

	public static void main(String[] args) {

		//정상종료
		System.out.println("1");
		System.out.println("2");
		
		Test3 t = new Test3();
		t.a();
		
		System.out.println("end. 정상종료");
	}
}
