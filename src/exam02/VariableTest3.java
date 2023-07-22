package exam02;

public class VariableTest3 {
	public static void main(String[] args) {

	// 변수 특징
	// 1. 중복 불가 (식별이 불가능)
	int num = 10;
//	int num = 20;
	
	// 2. 블록scope - 블럭 안에서 선언된 변수는 블럭밖에서는 안됨
	{
		int num2 = 100;
		System.out.println(num2);
	}
	//System.out.println(num2);
	
	// 3. 로컬변수 사용시 반드시 초기화해야 된다.
	int num3;
	//System.out.println(num3);
	
	// 4. 변수 종류
	/* 	교안 p.82 참조
	 * 가. 로컬변수
	 * 나. 인스턴스변수
	 * 다. 클래스변수(static변수)
	 */
	
	}
}
