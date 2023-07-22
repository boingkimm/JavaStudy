package exam02;

import java.util.Scanner;   //Scanner의 위치(java.util)를 알려줌

public class IFTest{

	public static void main(String[] args) {

		//1. 단일 if문

		System.out.println("1");
		if(false) {
			System.out.println("2");  //한 문장만 지정하려면 중괄호 생략 가능
			System.out.println("3");
		}
		System.out.println("end");

		// 키보드 입력 처리 클래스: Scanner 클래스

		// 객체생성 문법: 클래스명 변수명 = new 클래스명([값]);
		Scanner scan = new Scanner(System.in);  //System.in은 키보드를 가리킴

		// 값 가져오기 : 문자열, 숫자 선택. next, nextInt, nextFloat ...
		System.out.println("정수1 입력하시오");
		int num = scan.nextInt();  //JS의 prompt 역할 (콘솔에 입력)

		// 정수를 입력받고 짝수이면 출력
		if(num%2==0) {
			System.out.println(num);
		}
		
		//
		System.out.println("정수2 입력하시오");
		int num2 = scan.nextInt();  //JS의 prompt 역할 (콘솔에 입력)
		
		System.out.println(num2);
	}
}