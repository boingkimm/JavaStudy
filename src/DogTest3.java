import java.sql.Date;
//import java.util.Date;
//같은 클래스명(Date) 다른 패키지라도(sql, util) import 안됨

public class DogTest3 {

	public static void main(String[] args) {

		// 다른 패키지의 같은 클래스명 접근하는 방법
		
		Date d = new Date(25);   //java.sql패키지
		
		java.util.Date d2 = new java.util.Date(25);   //java.util패키지
	}

}
