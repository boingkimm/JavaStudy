package exam03;

public class ArrayTest2 {

	public static void main(String[] args) {

		// 1. 1차원 배열 - new 이용
		
		// 가. 배열 선언		
		String [] n2; //n2: 변수, 참조형변수, 로컬변수, String타입의 배열변수

		// 나. 배열 생성
		n2 = new String[3];    // heap 메모리
		
		System.out.println(n2[0]);    // 참조형의 초기값 null
		System.out.println(n2[1]);
		System.out.println(n2[2]);
		
		// 다. 배열 초기화
		n2[0]="홍길동";
		n2[1]="이순신";
		n2[2]="유관순";

	}

}
