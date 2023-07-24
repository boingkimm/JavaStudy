package exam10_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest4 {

	public static void main(String[] args) {

		// List계열 : 순서가 있고 중복이 가능
		
		List<String> list = new ArrayList<>(); //다형성 (매우 중요!)
		
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		list.add("홍길동");

		//삭제
		list.remove("홍길동");  //첫번째 일치하는 홍길동만 삭제
		list.removeAll(Arrays.asList("홍길동"));  //모든 홍길동 삭제
		
		
		System.out.println(list);
		
	}
}
