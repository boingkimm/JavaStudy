package exam04_1;

public class TestPet {

	public static void main(String[] args) {

		//고양이: 야옹이 2 암컷
		
		// 생성자 이용하여 값 초기화
		Cat c = new Cat("야옹이",2,"암컷");  //Cat파일에 public Cat(String n, int a, String s){} 있어야 함
		
		System.out.println(c.name);  //멤버접근 (권장 안함)
		System.out.println(c.age);
		System.out.println(c.sex);
		
	}

}
