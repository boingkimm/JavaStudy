package exam07_2;

public class TestPet {

	public static void main(String[] args) {

		//객체 생성
		Cat c1 = new Cat("야옹이",2);
		Dog d1 = new Dog("망치",1,"수컷");
		Bird b1 = new Bird("까치", 1, "블랙");
		
		//Object의 toString오버라이딩 시 (각 객체 파일에서)
		//참조변수만 출력해도- 아래와 동일 결과 : 더 간단!
		System.out.println(c1);  //자동으로 c1.toString()이 호출됨.
		System.out.println(d1);
		System.out.println(b1);
		
		
		//출력 복잡
//		System.out.printf("Cat이름: %s, Cat나이: %d\n", c1.getName(), c1.getAge());
//		System.out.printf("Dog이름: %s, Dog나이: %d, Dog성별: %s\n", d1.getName(), d1.getAge(), d1.getSex());
//		System.out.printf("Bird이름: %s, Bird나이: %d, Bird색상: %s\n", b1.getName(), b1.getAge(), b1.getColor());
//		
		

	}

}
