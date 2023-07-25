package exam10_2;

import java.util.Date;

//제네릭스로 만들기
class Box2<T>{   //Object -> T(미정type)
	T obj;

	public void setValue(T obj) {
		this.obj = obj;
	}	
	public T getValue() {
		return obj;
	}
}


public class GenericsTest2 {

	public static void main(String[] args) {

		//문자열만 저장
		Box2<String> b1 = new Box2<>();
		Box2<String> x = new Box2<String>();
		
		b1.setValue("홍길동");
//		b1.setValue(10);	//장점1: 잘못된 데이터 저장했음을 컴파일시에 안다.
		String str = b1.getValue();	 //장점2: 형변환이 필요없다.
		System.out.println("문자열 길이:" + str.length());
		
		//날자만 저장
		Box2<Date> b2 = new Box2<>();
		b2.setValue(new Date());
//		b2.setValue(20);	//장점1: 잘못된 데이터 저장했음을 컴파일시에 안다.
		Date d = (Date)b2.getValue();	 //장점2: 형변환이 필요없다.
		System.out.println("날짜:" + d.getYear());
		
	}

}
