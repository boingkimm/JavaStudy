package exam07_4;

public class Bird extends Pet {   //에러 선택 - 첫번째 클릭 - 맨 밑줄에 오버라이딩 생성됨
	

	String color;
	
	public void fly() {
		System.out.println("Bird.fly");
	}

	//오버라이딩은 강제성이 없다

	@Override
	public void eat() {
		System.out.println("Bird.eat");
	}
	
	@Override
	public void sleep() {
		System.out.println("Bird.sleep");
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public Bird() {
	}

	public Bird(String name, int age) {
		super(name, age);
	}

	public Bird(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//
	@Override
	public String toString() {
		return String.format("Bird 이름: %s, Bird나이: %d, Bird색상: %s\n", name, age, color);
	}
	
	
}
