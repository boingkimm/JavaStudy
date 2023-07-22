package exam07;

public class TestPet {

	public static void main(String[] args) {

		//1. 일반 객체 생성
		Cat c1 = new Cat("야옹이",2);
		Dog d1 = new Dog("망치",1,"수컷");
		Bird b1 = new Bird("까치", 1, "블랙");
		
		System.out.printf("Cat이름: %s, Cat나이: %d\n", c1.getName(), c1.getAge());
		System.out.printf("Dog이름: %s, Dog나이: %d, Dog성별: %s\n", d1.getName(), d1.getAge(), d1.getSex());
		System.out.printf("Bird이름: %s, Bird나이: %d, Bird색상: %s\n", b1.getName(), b1.getAge(), b1.getColor());
		
		
		//2. 다형성 생성  : 하나의 부모타입으로 서로 다른
		Pet p = new Cat("야옹이",2);
		System.out.printf("Cat이름: %s, Cat나이: %d\n", p.getName(), p.getAge());
		
			p = new Dog("망치",1,"수컷");
		System.out.printf("Dog이름: %s, Dog나이: %d \n", p.getName(), p.getAge()); //, p.getSex() 에러 - Pet에 없는 속성
	
			p = new Bird("까치", 1, "블랙");
		System.out.printf("Bird이름: %s, Bird나이: %d \n", p.getName(), p.getAge());  //, p.getColor() 에러
		
		
//		Pet p, p, p : p하나로 셋 다 관리
//		Pet p1, Pet p2, Pet p3 : 이렇게 해도는 됨
//		Pet p, Pet p, Pet p : 는 안됨
	}

}
