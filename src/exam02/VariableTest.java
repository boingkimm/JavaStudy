package exam02;

public class VariableTest {

		int n2;  // 메서드 밖 - 인스턴스변수 , 0으로 자동초기화
 static int n3;  //메서드 밖 - 클래스변수 (static변수) , 0으로 자동초기화
	
	// main 메서드
	public static void main(String[] args) {
		int n;   // 매서드 안 - 로컬변수 , 자동초기화 안됨, 반드시 사용전에 초기화해야 된다.
	  //System.out.println(n);  //초기화 안해서 에러남
		n=0; //초기화
		System.out.println(n);
	
	}

}