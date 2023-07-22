package exam01;

public class HelloTest {

	public static void main(String[] args) {
		// println 메서드는 값을 새로운 줄에 출력한다.
		System.out.println("Hello World");
		System.out.println("홍길동");
		System.out.println();  //빈줄
		
		// print 메서드는 값을 새로운 줄에 출력한다.
		System.out.print("Hello World");
		System.out.print("홍길동");
		
		// + 사용해서 여러 값을 연결해서 출력 가능
		System.out.println("홍길동"+20);
	}

	// 클래스 3개 : HelloTest, String, System
	// API 2개 (사용자 지정) : HelloTest, String
	
	/*
	 * 단축키
	 * 1. 한줄 복사 : ctrl + alt + 방향키
	 * 2. 줄 이동 : alt + 방향키
	 * 3. 한줄 삭제 : ctrl + d
	 * 4. 실행시킨 명령어 취소: ctrl + z
	 * 5. sysout 입력후 ctrl + spacebar 
	 */
}
