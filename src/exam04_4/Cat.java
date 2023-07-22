package exam04_4;

public class Cat {

	String name;
	int age;
	String sex;
	
	// Alt + Shift + s 자동작성
	
	public Cat() {

	}

	public Cat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	/////////////////////////////////////
	// 필요시 메서드 추가 가능
	// 이름과 나이 한꺼번에 수정하는 메서드
	public void setCat(String name, int age) {  //setNameAge
		this.name = name;
		this.age = age;
	}

	// 나이와 성별 한꺼번에 수정하는 메서드
	public void setCat(int age, String sex) {  //setAgeSex
		this.age = age;
		this.sex = sex;
	}
	
	// 이름 나이 성별 한꺼번에 수정하는 메서드
	public void setCat(String name, int age, String sex) {  //setNameAgeSex
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	// 메서드명 너무 길어짐, 메서드 수 많아짐 => 하나로 통일하기
	// 오버로딩메서드 (메서드명 같고 파라미터가 다름)
	// setCat
	
	//////////////////////////////////////////
	//getter + setter 기능 모두 포함하는 메서드
	public String getCat(String name, int age, String sex) {
		return name+" "+age+" "+sex;   // 리턴값은 반드시 하나만 가능
	}                                  // 다른 타입은 문자열로 묶음
	
	// 두 개의 정수(10, 20)를 한꺼번에 반환하는 방법
	public int [] getInt() {
		return new int[] {10,20};  // 리턴값은 배열 하나, 배열 안에 값이 2개
	}
	
	///////////////////////////////////////////
	// 리턴타입은 void인데 return 키워드 사용하는 경우
	// : 끝나는 블럭 만나기 전에 빠져나오기
	public void xxx() {
		System.out.println("xxx1");
		if(true)return;  // 중간에 xxx 메서드를 중지하고 반환됨
		System.out.println("xxx2");
		System.out.println("xxx3");
	}
	
	// 자동 형변환 : byte>short>int>long>float>double
	public void yyy(long n) {  //10 : int, long, float, double 모두 가능
		xxx();  // this.xxx(); 자신이 자신 안의 다른 메서드 호출 가능
	}
	
} 
