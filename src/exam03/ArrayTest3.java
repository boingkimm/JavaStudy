package exam03;

public class ArrayTest3 {

	public static void main(String[] args) {

		// 2. 1차원 배열 - literal 이용 (많이 사용됨)
		
		// 기본형 배열
		int [] n = {10,20};

		System.out.println(n.length);
		
		//값 변경
		n[0]=100;
		System.out.println(n[0]);
		System.out.println(n[1]);
		
		// 참조형 배열
		String [] n2 = {"홍길동", "이순신"};
		System.out.println(n2.length);
		System.out.println(n2[0]);
		System.out.println(n2[1]);
		

	}

}
