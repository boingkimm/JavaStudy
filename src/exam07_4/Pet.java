package exam07_4;

//클래스도 추상클래스
public abstract class Pet {

	String name;
	int age;
	
	// 자식클래스에서 꼭 사용하고자하는 메서드를 추상메서드로 만듦.
	public abstract void eat();
	public abstract void sleep();
	
		
	/////////////////////////////////////
	
	
	
	
	
	public Pet() {}

	public Pet(String name, int age) {
		this.name = name;
		this.age = age;
	}

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
