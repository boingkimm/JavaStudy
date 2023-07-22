package exam07_1; //Object 클래스

public class Pet {

	String name;
	int age;
	
	public void eat() {
		System.out.println("Pet.eat");
	}
	public void sleep() {
		System.out.println("Pet.sleep");
	}
	
	
	
	
	//생성자
	public Pet() {
		System.out.println("Pet 생성자");
	}
	
	public Pet(String name, int age) {  //초기화 하기 위해서 자식이 명시적 작성
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
