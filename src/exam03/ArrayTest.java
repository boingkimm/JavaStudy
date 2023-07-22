package exam03;

public class ArrayTest {

	public static void main(String[] args) {

		// 1. 1차원 배열 - new 이용
		
		// 가. 배열 선언		
		int [] n; // n:변수, 참조형변수, 로컬변수, int타입의 배열변수

		// 나. 배열 생성
		n = new int[2];              // 크기가 2
		
		System.out.println(n[0]);    // 배열주소n[0], int의 초기값 0
		System.out.println(n[1]);
//		System.out.println(n[2]);    //예외발생. 에러도 클래스
		
		// 다. 배열 초기화
		n[0]=10;
		n[1]=20;
	}

}
