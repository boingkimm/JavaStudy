package exam06_2;   //생성자에 집중

// Cat is a Pet ==> 상속관계
public class Cat extends Pet{  

	//Pet에 있는 공통속성, 공통기능 삭제 -> Pet의 코드 재사용, 코드 깔끔
	
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


	
	
	//생성자
	public Cat() {
		System.out.println("Cat 생성자");
	}
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

}

