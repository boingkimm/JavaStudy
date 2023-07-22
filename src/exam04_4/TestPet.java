package exam04_4;

public class TestPet {

	public static void main(String[] args) {

		Cat c = new Cat("야옹이",2,"암컷");
		
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println(c.getSex());
		
		// 수정1 - 개별적으로 하나씩 수정
		c.setName("망치");
		c.setAge(3);
		
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println(c.getSex());
		
		// 수정2 - 한꺼번에 수정
		c.setCat(4, "수컷");   //나이 성별 - 파라미터 같은 메서드 있어야 호출됨
		
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println(c.getSex());
		
		//getCat 호출
		String result = c.getCat("나비", 2, "암컷");
		System.out.println(result);
		
		/////////////////////////////////
		c.xxx();     //xxx1 xxx2 xxx3 end => return시 xxx1 end
		
		System.out.println("end");
		
		/////////////////////////////////
		c.yyy(10);
	}

}
