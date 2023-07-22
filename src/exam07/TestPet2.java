package exam07;

public class TestPet2 {

	public static void main(String[] args) {
		
		// 다형성 활용
		
		//1. 배열
		Pet [] pets = {new Cat("야옹이1", 2),
				       new Dog("망치1", 1, "수컷"),
				       new Dog("망치2", 2, "암컷"),
				       new Cat("야옹이2", 1),
				       new Bird("까치", 1, "블랙"),
				       new Cat("야옹이3", 4) };
			
		// 이름과 나이만 출력
		for(Pet p: pets) {
			System.out.printf("이름: %s, 나이: %d\n", p.getName(), p.getAge()); //누가 나올지 모르니까 그냥 이름, 나이
		}
		
		// 고양이만 출력 => 배열에서 꺼냈을 때 누군지 식별하는 방법 필요 ( 변수 instanceof 타입 연산자 )
		for(Pet p: pets) {
			if(p instanceof Cat)  // p가 Cat이냐. 고양이만 꺼내는 방법
				System.out.printf("Cat 이름: %s, Cat 나이: %d\n", p.getName(), p.getAge()); //무조건 고양이만 나오니까 Cat이름, Cat나이
		}

		// 강아지의 이름, 나이, 성별 출력
//FIXME		for(Pet p: pets) {
//			if (p instanceof Dog)
//				
//				// Pet타입 --> Dog타입으로 형변환
//				Dog d = (Dog)p;
//				//System.out.printf("Dog 이름: %s, Dog 나이: %d\n", p.getName(), p.getAge(), p.getSex());
//			
				//System.out.printf("Dog 이름: %s, Dog 나이: %d\n", p.getName(), p.getAge(), ((Dog) p).getSex());
				//p.getSex() 에러 - p타입이 Pet에는 sex속성 없음
	
	}
}