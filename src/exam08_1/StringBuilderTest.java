package exam08_1;

import org.omg.CosNaming._BindingIteratorImplBase;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		// StringBuilder 클래스 이용한 문자열 생성  ==> 버퍼로 동작되므로 자신의 문자열이 변경됨
		StringBuilder sb = new StringBuilder("HeLLo");
		StringBuffer sb2 = new StringBuffer("HeLLo");
		//빌더, 버퍼 똑같음! 빌더를 권장.
		
		System.out.println(sb);
		
		//메서드
		
		System.out.println("1. 추가:" + sb.append("hello"));
		System.out.println("1. 추가:" + sb.append(10));
		System.out.println("1. 추가:" + sb.append(3.14));

		System.out.println("2. 삽입:" + sb.insert(0, "홍길동"));
		System.out.println("2. 삽입:" + sb.insert(3, 100));
		
		System.out.println("3. 삭제:" + sb.delete(0, 6));  //0~5삭제
		
		System.out.println("4. 거꾸로:" + sb.reverse());
		
		// charAt, substring, indexOf, replace ...
	
		System.out.println(sb);
		
		//가장 마지막 작업은 String으로 저장해서 사용된다.
		//String s = sb;   //에러 - s는 String, sb는 stringBuilder
		String s = sb.toString();   //sb를 투스트링으로 저장!
		System.out.println("최종결과:" + s);

	}

}
