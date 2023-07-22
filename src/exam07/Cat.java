package exam07;

public class Cat extends Pet {

	public void run() {
		System.out.println("Cat.run");
		
	}

	@Override
	public void eat() {
		System.out.println("Cat.eat");
		super.eat();
	}

	@Override
	public void sleep() {
		System.out.println("Cat.sleep");
		super.sleep();
	}

	
	public Cat() {
	}

	public Cat(String name, int age) {
		super(name, age);
	}


	
	
	
	
}
