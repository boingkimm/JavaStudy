package exam10;  //컬렉션API - Set

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		
		//Set계열 : 순서가 없고 중복 불가한 자료구조
		
		HashSet set = new HashSet();  //저장소(바구니)가 만들어짐
		
		set.add("홍길동");
		set.add(20);	//기본형 - 자동으로 auto boxing
		set.add(3.14);  //기본형 - 자동으로 auto boxing
		set.add('A');	//기본형 - 자동으로 auto boxing
		set.add(true);  //기본형 - 자동으로 auto boxing
		
		set.add("홍길동");
		set.add(20);
		set.add(3.14);
		set.add('A');
		set.add(true);

		//출력방법1 - toString()
		System.out.println(set);  //문자열[A, 홍길동, 20, 3.14, true] : 중복X, 순서X
		
		//출력방법2 - foreach문
		for (Object obj : set) {  //Object로 받음. 다형성
			System.out.println(">>"+obj);
		}
		
		//출력방법3 - iterator문 ==> 컬렉션에 저장된 데이터를 반복적으로 가져오는 방법
		Iterator ite = set.iterator();
		while (ite.hasNext()) {
			System.out.println("###" + ite.next());
		}
	}

}
