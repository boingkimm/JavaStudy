package exam04;

// Cat과 같은 main없는 재사용클래스 관리 목적 (Cat.java)
public class TestPet {

	public static void main(String[] args) { //핸들링클래스

		// 객체 생성
		// 클래스명 변수명 = new 클래스명 ( );
		
		// 고양이: 야옹이 2 암컷
		Cat c = new Cat();   //Cat클래스가 메모리에 로딩됨
		
		// 멤버 접근  : c.멤버  (권장안함, 04_1방법 권장)
		c.name="야옹이";
		c.age=2;
		c.sex="암컷";
		System.out.println(c.name);  //멤버접근 (권장 안함)
		System.out.println(c.age);
		System.out.println(c.sex);
	
		// 고양이: 망치 1 수컷
		Cat c2 = new Cat();   //c와 다른 주소
		c2.name="망치";
		c2.age=1;
		c2.sex="수컷";
		System.out.println(c2.name);  //멤버접근 (권장 안함)
		System.out.println(c2.age);
		System.out.println(c2.sex);
	}

}
