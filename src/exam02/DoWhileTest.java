package exam02;

public class DoWhileTest{

	public static void main(String[] args) {

		// d0~while문
		// 조건식이 처음부터 false라도 적어도 한번은 무조건 실행된다.
        
       int n = 1;
       do {
            System.out.println("hello");
            n++;
       } while (n < 6);
		
	}
}