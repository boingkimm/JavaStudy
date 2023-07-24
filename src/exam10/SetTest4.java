package exam10;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest4 {

	public static void main(String[] args) {
		
		//Set계열 : 순서가 없고 중복 불가한 자료구조
		//정수만 저장 ==> Wrapper클래스(Integer)로 사용해야 된다. (기본형(int) 사용 불가)
		
		HashSet<Integer> set = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<>();
		
		set.add(10);  //오토박싱
		set.add(20);  //오토박싱
//		set.add("hello");  //에러
		
		for (int i : set) {  //오토 언박싱
			System.out.println(i);
		}
		
		Iterator<Integer> ite = set.iterator();
		while (ite.hasNext()) {
			int num = ite.next();
			System.out.println("###" + num);
		}
		
	}

}
