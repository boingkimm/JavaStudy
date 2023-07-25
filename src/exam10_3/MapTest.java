package exam10_3;  //컬렉션API - Map

import java.util.HashMap;
import java.util.Set;

public class MapTest {
//Map은 순서가 없음, 중복불가(덮어씀)
//key중복, key없음 => 에러X

	public static void main(String[] args) {

		HashMap<String, String> map2 = new HashMap<String, String>();
		HashMap<String, String> map = new HashMap<>();
		
		map.put("p1", "홍길동");
		map.put("p2", "이순신");
		map.put("p3", "유관순");
		map.put("p3", "강감찬");  //key중복시 덮어쓴다.
		
		//출력방법1 - toString
		System.out.println(map);  //{p1=홍길동, p2=이순신, p3=유관순}
		
		//출력방법2 - get(key)
		System.out.println(map.get("p1")); //홍길동
		System.out.println(map.get("p2")); //이순신
		System.out.println(map.get("x"));  //key가 없으면 null
		
		//출력방법3 - keySet() ==> key값을 반환 (key가 많을 때 주로 사용, 많이 쓰는 방법)
		Set<String> keys = map.keySet();
		System.out.println(keys);  //[p1, p2, p3]
		for (String key : keys) {
			System.out.println(key+"\t"+map.get(key));
			//p1	홍길동
			//p2	이순신
			//p3	강감찬
		}
	}

}
