package exam05_1;

public class Cat {        // 클래스는 public 권장
	// Cat 클래스의 데이터 보호
	private String name;  // 인스턴스변수는 pivate 권장
	private int age;
	private String sex;

	public Cat() {
	}

	public Cat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void setName(String name) {
		this.name = name;

		info();
	}
	
	//info메서드는 외부에서 전혀 사용하지 않음
	//Cat클래스의 setName메서드에서만 사용함
	// => private : 다른 클래스에서 안보임
	// 외부에는 hide시킴 (외부입장에서는 복잡성 감소효과)
	
	/*
	 * 은닉화(캡슐화, encapsulation)
	 * 	 *   1. 데이터 보호
	 *   2. 복잡성 감소효과
	 */
	private void info() {
		System.out.println("info");
	}
	
}
