package exam04_3;

public class Cat {

	//인스턴스 변수
	String name;
	int age;
	String sex;

	//생성자
	public Cat() {
	}
	public Cat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	//메서드
	//getter메서드
	// 이름 얻기 : 파라미터X, 리턴O
	public String getName() {
		return name;
	}
	// 나이 얻기
	public int getAge() {
		return age;
	}
	// 성별 얻기
	public String getSex() {
		return sex;
	}
	
	//setter메서드
	// 이름 수정
	public void setName(String name) {
		this.name = name;
	}
	// 나이 수정
	public void setAge(int age) {
		this.age = age;
	}
	// 성별 수정
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	
	
}
