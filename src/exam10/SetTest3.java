package exam10;  //Generic<> - 저장할 타입을 한정

import java.util.HashSet;
import java.util.Iterator;

public class SetTest3 {

	public static void main(String[] args) {
		
		//Set계열 : 순서가 없고 중복 불가한 자료구조
		
		HashSet<String> set = new HashSet<String>();
		HashSet<String> set2 = new HashSet<>();
		
		//가정: 이름만 저장할 것이다.
		set.add("홍길동1");
		set.add("홍길동2");
		set.add("홍길동3");
//		set.add(20);      //잘못된 데이터 - 컴파일시 에러.

		//출력방법1 - toString()
		System.out.println(set);
		
		//출력방법2 - foreach문
		for (String obj : set) {  //String으로 바로 받기 가능. 형변환 불필요
//			String str = (String)obj;
			System.out.println(">>" + obj.concat(" 님"));
		}
		
		//출력방법3 - Iterator문
		Iterator<String> ite = set.iterator();
		while (ite.hasNext()) {
			String str = ite.next();  //형변환이 필요없다.
			System.out.println("%%" + str);
		}
		
		/*
		 * 제네릭스를 쓰면
		 * 1) 잘못된 데이터를 저장한 것을 컴파일 시점에 알 수 있다.
		 * 2) 형변환이 필요 없다.
		 */
	}

}
