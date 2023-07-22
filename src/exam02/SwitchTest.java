package exam02;

import java.util.Scanner;   //Scanner의 위치(java.util)를 알려줌

public class SwitchTest{

	public static void main(String[] args) {

		// switch문
		//  byte , short , int , char , String , enum -6개만 가능
		// long X, 실수X

		System.out.println("1");
		int num = 10;   // long num : X

		switch(num){
		case 5: System.out.println("5"); break;
		case 10: System.out.println("10"); break;
		case 15: System.out.println("15"); break;
		default: System.out.println("default");
		}

		char c = 'A';  // char
		switch(c){
		case 'A':System.out.println("A"); break;
		case 'B':System.out.println("B"); break;
		default: System.out.println("default");
		}

		String c2 = "A";  // string
		switch(c){
		case 'A':System.out.println("A"); break;
		case 'B':System.out.println("B"); break;
		default: System.out.println("default");
		}

		System.out.println("end");
	}
}