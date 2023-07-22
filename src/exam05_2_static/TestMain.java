package exam05_2_static;   //static키워드

class Count{
	
	int n;    // 인스턴스변수 - 누적안됨. 객체 생성할 때마다 매번 생성
	static int m;  // static변수 - 누적됨. 프로그램 실행할 때 한 번 생성.
	               //공유가능. 이탤릭체. 자동초기화. 클래스명으로 접근
	
	public Count() {
		n++;
		m++;
	}
	
	public void n_print() {          //인스턴스 메서드
		System.out.println("n:" + n);  //인스턴스변수 접근 가능
		System.out.println("m:" + m);  //static변수 접근 가능
	}
	
	public static void m_print() {    //static 메서드 (3번)
//		System.out.println("n:" + n);  //인스턴스변수 접근 불가 (6번) 더 늦게 만들어지니까.
//		System.out.println(this);      //this도 인스턴스, 사용불가
		System.out.println("m:" + m);  //static변수 접근 가능
		
	}
	
}//end class


public class TestMain {

	public static void main(String[] args) {  //메인부터 실행
		
		
		//new와 무관. new전에 static 접근 가능
		System.out.println(Count.m);  //0 자동초기화
		Count.m_print();  // new하지 않고 메서드 사용 가능
		
		
		// Count객체 생성을 몇번 했는지? (new 개수) 누군가 세고 있음 - 불러오기
		Count c = new Count();
		c.n_print();               //1
		Count c2 = new Count();
		c2.n_print();              //1
		
	}

}
