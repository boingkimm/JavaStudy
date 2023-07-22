package exam01;

public class StringFormatTest {

	public static void main(String[] args) {
		// 포맷 출력
		
		//1. String.format ( String 형식문자 , Object ... 값들 ) ;   //Object는 모든 값 의미
		String result = String.format("이름:%s, 나이:%d, 키:%.2f, 성별:%c, 결혼:%b", "홍길동", 20, 167.235165, '남', true);
		System.out.println(result);
		
		// 형식문자 : "이름:%s, 나이:%d, 키:%f, 성별:%c, 결혼:%d"
		// 값들:  "홍길동", 20, 167.235165, '남', true

		
		//2. System.out.printf ( String 형식문자 , Object ... 값들 ) ;
		System.out.printf("이름:%s, 나이:%d, 키:%.2f, 성별:%c, 결혼:%b \n", "홍길동", 20, 167.235165, '남', true);
		System.out.printf("이름:%s, 나이:%d, 키:%.2f, 성별:%c, 결혼:%b", "홍길동", 20, 167.235165, '남', true);
		
		//printf 한줄 출력 -> 형식문자에 \n으로 줄바꿈
		
		
	}

}
