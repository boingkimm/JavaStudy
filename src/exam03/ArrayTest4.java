package exam03;

public class ArrayTest4 {

	public static void main(String[] args) {

		// 3. 1차원 배열 - new + literal 이용
		
		// 기본형 배열
		int [] n = new int[] {10,20};
		
		System.out.println(n.length);
		System.out.println(n[0]);
		System.out.println(n[1]);
		
		// 참조형 배열
		String [] n2 = new String[] {"A","B","C"};
		
		System.out.println(n2.length);
		System.out.println(n2[0]);
		System.out.println(n2[1]);
		System.out.println(n2[2]);
	}

}
