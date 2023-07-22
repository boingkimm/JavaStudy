package exam07_3;

public class Cat extends Pet {

	public void run() {
		System.out.println("Cat.run");
		
	}

	@Override
	public void eat() {
		System.out.println("Cat.eat");
	}

	@Override
	public void sleep() {
		System.out.println("Cat.sleep");
	}

	
	public Cat() {
	}

	public Cat(String name, int age) {
		super(name, age);
	}


	// toString 오버라이딩 ( source - Generate toString )
	@Override
	public String toString() {
		return String.format("Cat이름: %s, Cat나이: %d\n", name, age);
	}
	//String.format 형식으로 안해도 됨.
	


	
	
	
	
}
