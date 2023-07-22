package exam07_1; //Object 클래스

public class Cat extends Pet{  

	public void run() {;
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
		super(); 
		System.out.println("Cat 생성자");
	}
	
	public Cat(String name, int age) {
		super(name, age);
		System.out.println("Cat 생성자2"); 
		
		this.age = age;
	}

	////Object에 있는 toString을 재정의  (source - Generate toString)
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}

}

