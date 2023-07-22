package exam06_4;

public class TestPet {

	public static void main(String[] args) {

		Cat c1 = new Cat();   //1.호출 
		
		/* 
		 * Pet 생성자
		 * Cat 생성자
		 * => 자식만 호출했는데 부모가 먼저 생성됨
		 */
		
		Cat c2 = new Cat("야옹이", 2);   //4. 호출 - pet 생성자가 출력됨
		
	}

}
