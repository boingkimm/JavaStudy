package exam06_1_extends;

// Cat is a Pet ==> 상속관계
public class Cat extends Pet{  

	//Pet에 있는 공통속성, 공통기능 삭제 -> Pet의 코드 재사용, 코드 깔끔
	
	public void run() {;
		System.out.println("Cat.run");
	}
	
	//메서드 재정의 ( overriding ) 
	@Override   //@으로 시작하는 코드를 어노테이션(annotation)이라고 부른다.
	public void eat() {
		System.out.println("Cat.eat");
	}
	
	@Override
	public void sleep() {
		System.out.println("Cat.sleep");
	}

	/*
	 * 1. 직접 타이핑
	 * 2. source - override/implement method
	 */
	
	
	
	
	public Cat() {
	}
	
	public Cat(String name, int age) {   //Cat클래스에 없는 인자지만 에러 안남, 상속받음
		this.name = name;
		this.age = age;
	}

}

