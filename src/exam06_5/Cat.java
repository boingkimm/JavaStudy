package exam06_5;

// Cat is a Pet ==> 상속관계
public class Cat extends Pet{  

	
	public void run() {;
		System.out.println("Cat.run");
	}
	
	//메서드 재정의 ( overriding ) 
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
		super (name, age); //super명시적 작성
		
	}

}

