package exam10;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest2 {

	public static void main(String[] args) {
		
		//Set계열 : 순서가 없고 중복 불가한 자료구조
		
		HashSet set = new HashSet();
		
		//가정: 이름만 저장할 것이다.
		set.add("홍길동1");
		set.add("홍길동2");
		set.add("홍길동3");
		set.add(20);      //잘못된 데이터 있어도 모름, 에러 안남 - for문실행시 에러.

		for (Object obj : set) {
			String str = (String)obj;  //이름만 저장 - String으로 형변환.
			System.out.println(">>" + str.concat(" 님"));
		}
		/*
		 * 제네릭스를 안쓰면
		 * 1) 잘못된 데이터를 저장한 것을 실행시점에 알 수 있다. (20 : String 에러)
		 * 2) 무조건 형변환이 필요하다.
		 */
	}

}
