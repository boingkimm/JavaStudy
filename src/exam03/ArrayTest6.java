package exam03;

public class ArrayTest6 {

	public static void main(String[] args) {

		// 2. 2차원 배열 - new 이용 - 정방형
		
		// 가. 배열 선언		
		int [][] n;

		// 나. 배열 생성
		n = new int[3][2];        // 행크기 3, 열크기 2
		
		System.out.println("행의 길이:" + n.length);
		System.out.println("1행의 열의 길이:" + n[0].length);

		// 0으로 자동 초기화
		System.out.println(n[0][0]);
		System.out.println(n[0][1]);
		
		// 반복문
		for(int i=0; i<n.length; i++) {         //행
			for(int j=0; j<n[i].length; j++) {  //열
			 System.out.println(">>"+ n[i][j]);
			}
		}  // 값 출력함
		
		// 명시적 초기화
		n[0][0]=1;
		n[0][1]=2;
		n[1][0]=3;
		n[1][1]=4;
		n[2][0]=5;
		n[2][1]=6;
		
		//foreach문
		/*
		 *     for(변수:배열명){ // JS의 for-of 동일
		 *     
		 *     }
		 */
		for (int[]x : n) {   //2차원배열n에서 꺼내옴 - 1차원으로
			for(int x2 : x) {  // 1차원x에서 x2로 값 가져오기  (2차원-1차원-값)
				System.out.println("$$" + x2);
				// x: 2차원 배열n에서 꺼낸 1차원 배열.
				// x2: foreach문 돌면서 꺼낸 1차원 배열의 값.
			}
		}
	}

}
