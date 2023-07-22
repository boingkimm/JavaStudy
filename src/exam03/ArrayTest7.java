package exam03;

public class ArrayTest7 {

	public static void main(String[] args) {

		// 1. 2차원 배열 - new 이용 - 비정방형
		
		int [][] n = new int[2][];   // 행크기만 지정
		
		n[0] = new int[1];
		n[1] = new int[2];

		System.out.println(n[0][0]);
		System.out.println(n[1][0]);
		System.out.println(n[1][1]);
		
		System.out.println("행의 길이:" + n.length);
		System.out.println("2행의 열의 길이:" + n[1].length);
		
		// 명시적 초기화
		n[0][0]=1;
		n[1][0]=2;
		n[1][1]=3;
				
		// 반복문
		for(int i=0; i<n.length; i++) {         //행
			for(int j=0; j<n[i].length; j++) {  //열
			 System.out.println(">>"+ n[i][j]);
			}
		}
		
		//foreach문
		for (int[]x : n) {   //2차원배열n에서 꺼내옴 - 1차원으로
			for(int x2 : x) {  // 1차원x에서 x2로 값 가져오기  (2차원-1차원-값)
				System.out.println("$$" + x2);
				// x: 2차원 배열n에서 꺼낸 1차원 배열.
				// x2: foreach문 돌면서 꺼낸 1차원 배열의 값.
			}
		}
	}

}
