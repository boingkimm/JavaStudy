package exam04_1;

public class Cat {

	String name;
	int age;
	String sex;
	
	//생성자 - 한 클래스 내에 여러개 작성 가능, 인자리스트 다르게
	//==>오버로딩(overloading)생성자
	public Cat(){}   //기본생성자(default constructor)
	public Cat(String n){}
	public Cat(int a){}
	public Cat(String n, int a){}
	public Cat(int a, String n){}

	public Cat(String name, int age, String sex){
		this.name = name;   //cat클래스 안에서 접근시 this.
		this.age = age;    //this. 생략가능
		this.sex = sex;
	}
	
}