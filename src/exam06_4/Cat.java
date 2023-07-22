package exam06_4;   //생성자에 집중

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
		// 자식클래스의 생성자의 첫 라인에서 super([값,,,]); 사용가능
		super();  //(작성안하면) 자동삽입, 명시적으로 작성 안해도 됨  //2.Pet 생성자 출력
		System.out.println("Cat 생성자");  //3.출력
	}
	
	public Cat(String name, int age) {
		//부모에서 선언된 변수를 부모가 초기화함 - 명시적 작성해야 하는 경우임.
		super(name, age);
		System.out.println("Cat 생성자2");  //4. 첫 라인에 super 자동으로 있는 상태, 5. pet 생성자 다음 출력
		
		
		//부모에서 선언된 변수를 자식이 초기화함.
//		this.name = name;
		this.age = age;
	}

	// => super 첫 라인에 쓰거나 안쓰거나.
}

