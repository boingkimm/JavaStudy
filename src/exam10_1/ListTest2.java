package exam10_1;  //List의 메서드

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {

		// List계열 : 순서가 있고 중복이 가능
		
		ArrayList<String> list2 = new ArrayList<>();
		
		List<String> list = new ArrayList<>(); //다형성 (매우 중요!)
		
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		list.add("홍길동");
	
		
		//메서드 정리
		System.out.println("크기:" + list.size());
		
		//수정
		list.set(1, "원균");   //set에는 없는 기능들
		
		//삽입
		list.add(0, "강감찬");
		
		//삭제
		list.remove(1);
		list.remove("원균");		//첫번째 하나만 삭제
//		list.removeAll(Collection);  //모든 원균 삭제
		
		//부분리스트
		List<String> subList = list.subList(0, 2);  //다형성. List. 0~1
		System.out.println(subList);
		
		
		
		//출력방법1 - toString()
		System.out.println(list);
		

	}

}
