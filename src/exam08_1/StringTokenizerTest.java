package exam08_1;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {

		// 1. 기본형태
		String s = "aaa/bbb/ccc";
		
		StringTokenizer st = new StringTokenizer(s, "/");
		System.out.println("token 개수:" + st.countTokens());   //3
		while(st.hasMoreTokens()) {     //얻어올 것이 있는지 확인
			System.out.println(st.nextToken());  //있으면 얻어오기
		}
		
		// 2. mix형태
		String s2 = "A,ab,xx;E|XX/yy";
		StringTokenizer st2 = new StringTokenizer(s2, ",/;");  //구분자 여러개 가능
		System.out.println("token 개수:" + st2.countTokens());
		
		while(st2.hasMoreTokens()) { 
			System.out.println(st2.nextToken());
		}
		
	}

}
