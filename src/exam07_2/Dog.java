package exam07_2;

public class Dog extends Pet {

	//속성,기능 작성 - 오버라이딩 - 생성자 - getter/setter
	
	String sex;

	@Override
	public void eat() {
		super.eat();
	}

	@Override
	public void sleep() {
		super.sleep();
	}

	// 생성자
		public Dog() {
	}

	public Dog(String name, int age) {
		super(name, age);
	}

//	public Dog(String sex) {
//		this.sex = sex;
//	}

	public Dog(String name, int age, String sex) {  //Pet(String, int) 선택
		super(name, age);
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	

	//
	@Override
	public String toString() {
		return String.format("Dog 이름: %s, Dog나이: %d, Dog성별: %s\n", name, age, sex);
	}

}


