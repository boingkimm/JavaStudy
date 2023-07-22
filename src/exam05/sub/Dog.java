package exam05.sub;  //패키지명.패키지명2; : 계층구조, 하위패키지, Navigator에서 확인가능

public class Dog {
	
	String name;
	int age;
	
	public Dog() {
	}

	public Dog(String name, int age) {
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
