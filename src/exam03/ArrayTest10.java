package exam03;

import java.util.Arrays;

public class ArrayTest10 {
	//메인에서 만든 데이터를 메인 밖의 pdt, rdt에 전달하기
		
	// 기본형 인자
	public static void pdt(int n) {   //21행의 n과 다른 n임
		System.out.println("pdt:"+n);
		n=20;
	}
	
	// 참조형 인자
	public static void rdt(int[] x) {
//		System.out.println("rdt:"+ x); //주소값
		System.out.println("rdt:"+ Arrays.toString(x)); // 배열
		x[0]=100;
	}
	
	
	public static void main(String[] args) {  //메인에서 만든 데이터를 위 pdt, rdt에 전달

		// 기본형 데이터  ( call by value로 전달. 값이 복사되므로 원본값 변경 안됨)
		int n= 10;
		System.out.println("호출전 n값:"+n);  //10
		pdt(n);
		System.out.println("호출후 n값:"+n);  //10 (중간에 n값 바뀌었지만 원본 n값은 변경안됨!)
		
		// 참조형 데이터
		int [] n2 = {10,20,30};
		System.out.println("호출전 n2값:" + Arrays.toString(n2));  //[10, 20, 30]
		rdt(n2);
		System.out.println("호출후 n2값:" + Arrays.toString(n2));  //원본변경됨! [100, 20, 30]

	}

}
