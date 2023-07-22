package exam08_1;

public class WrapperTest2 {

	public static void main(String[] args) {

		//1. 오토박싱 (auto boxing) : 기본형이 자동으로 참조형으로 변환
		int n = 10;
		Integer x = n;  // 기본형 -> 참조형
		
		//2. 오토언박싱 (auto unboxing) : 참조형이 자동으로 기본형으로 변환
		int n2 = x;  // 참조형 -> 기본형
		
		// 다형성
		Object [] obj = {10, 3.15, "hello"};
		//클래스만 저장되어야 하는데 기본형도 저장된 이유(?) : 오토박싱
		
		
	}

}
