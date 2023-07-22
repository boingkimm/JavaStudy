package exam06_3;   //super키워드


class Parent{
	int age = 20;    // 이렇게 변수명 age 같게 줄 이유 없지만 문법적으로는 가능 (일반적인 상황 아님, 쓸 일 없음..)
}


class Child extends Parent{
	int age = 10;
	public void info() {
		System.out.println(age);   //10 (this.age) - 중복선언시 자신의 값(가까운 값) 나옴
		System.out.println(super.age);  //20
	}
}

public class TestMain {

	public static void main(String[] args) {
		Child c = new Child();    //부모까지 생성됨
		c.info(); 
		
	}

}
