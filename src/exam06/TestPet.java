package exam06;

public class TestPet {

	public static void main(String[] args) {

		Cat c1 = new Cat("야옹이", 2);
		
		Dog d1 = new Dog("망치", 1, "암컷");
		
		Bird b1 = new Bird("까치", 2, "블랙");
		
		System.out.printf("Cat이름: %s, Cat나이: %d\n", c1.getName(), c1.getAge());
		System.out.printf("Dog이름: %s, Dog나이: %d, Dog성별: %s\n", d1.getName(), d1.getAge(), d1.getSex());
		System.out.printf("Bird이름: %s, Bird나이: %d, Bird색상: %s\n", b1.getName(), b1.getAge(), b1.getColor());
		
		
		//기능적인 추가 메서드
		c1.eat();
		c1.sleep();
		c1.run();
		
		d1.eat();
		d1.sleep();
		
		b1.eat();
		b1.sleep();
		b1.fly();
	}

}
