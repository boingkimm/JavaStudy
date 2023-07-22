package exam04_2;

// 생성자를 자동생성하는 방법
public class Cat {

	String name;
	int age;
	String sex;
	
	// Alt + Shift + S
	// 우클릭-source -Generate constructors from superclass - omit체크
	public Cat() {   //기본생성자
	}

	// 우클릭-source -Generate constructors using Fields - 원하는 필드 선택 - omit체크
	public Cat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}