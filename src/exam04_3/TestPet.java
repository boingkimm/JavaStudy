package exam04_3;

public class TestPet {   //핸들링클래스

	public static void main(String[] args) {

		Cat c = new Cat("야옹이",2,"암컷");
		
		//출력1 - 인스턴스변수 직접 접근  (권장 안함)
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(c.sex);
		System.out.println("---");
		
		//출력2 - getter메서드 이용하여 접근
		String name = c.getName();
		int age= c.getAge();
		
		System.out.println(name);
		System.out.println(age);
		
		System.out.println(c.getSex());
		
		System.out.println("---");

		//수정1 - 인스턴스변수 직접 접근 (권장 안함)
		c.age = 3;
		System.out.println(c.getAge());
		
		//수정2 - setter메서드 이용하여 수정
		c.setAge(3);
		c.setName("망치");
		c.setSex("수컷");
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println(c.getSex());

	}

}
