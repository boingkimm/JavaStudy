package exam03;

import java.util.Arrays;  //배열있는 곳?

public class ArrayTest5 {

	public static void main(String[] args) {

		// 4. 1차원 배열 출력
		
		int [] n = new int[] {10,20,30,40};
		
		// 1) 개별적으로 idx 이용
		System.out.println(n[0]);
		System.out.println(n[1]);
	
		// 2) 일반 for문
		for(int i=0; i < n.length; i++) {
			System.out.println(">>"+n[i]);
		}
		
		// 3) foreach문
		/*
		 * for(변수:배열명){    // js의 for-of
		 * 
		 * }
		 */
		for(int k:n) {   // n이 참조하는 배열에서 값을 가져와서 k에.
			System.out.println("$$"+k);
		}
		
		// 4) 배열을 한번에 문자열로 출력 (java.util.Arrays 클래스 이용)
		//import를 자동으로 : Arrays.toString(배열명)
		System.out.println(Arrays.toString(n));  // "[10, 20, 30, 40]" 문자열
		
	}

}
