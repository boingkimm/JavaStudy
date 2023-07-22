package exam06_5;

// Cat, Dog, Bird의 부모클래스 Pet

public class Pet {

	String name;
	int age;
	
	public void eat() {                    //Cat파일에서 오버라이딩
		System.out.println("Pet.eat");
	}
	public void sleep() {
		System.out.println("Pet.sleep");
	}
	
	
	
	
	//생성자 - 상속X
	public Pet() {
	}
	public Pet(String name, int age) {
		this.name = name;
		this.age = age;
	} //생성자
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
}
