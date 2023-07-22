package exam04_2;

public class TestPet {

	public static void main(String[] args) {
		Cat c = new Cat();
		Cat c2 = new Cat("야옹이",2);
		Cat c3 = new Cat("망치",1,"수컷");
		
		/*
		 * 오버로딩 생성자 지원 이유
		 * - 다양한 방법으로 생성하도록 지원함
		 * 
		 * 기본생성자 - 생성자를 명시적으로 만들지 않은 경우에만 자동생성됨
		 * 따라서 기본생성자를 명시적으로 지정해야 됨
		 */
	}

}