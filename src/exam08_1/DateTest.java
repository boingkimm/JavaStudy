package exam08_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;   //java.sql 아님

public class DateTest {

	public static void main(String[] args) throws Exception {

		// 날짜 데이터
		
		Date d = new Date();

		System.out.println(d);  // =d.toString() 재정의됨
		
		
		// java.text.SimpleDateFormat 클래스와 병행해서 사용해야 한다
		
		// 가. Date ---> String
		//Fri Jul 21 15:20:04 KST 2023 ---> 특정 포맷을 가진 문자열로 변경
		/*
		 *   날짜 포맷
		 *   년도 : yyyy
		 *   월:   MM
		 *   일:   dd
		 *   시간: HH
		 *   분:   mm
		 *   초:   ss
		 */		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String result = sdf.format(d);  //문자열타입으로 저장
		System.out.println(result);
		
		// 나. String ---> Date
		String s = "2023년05월13일";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년MM월dd일"); //형식 일치해야 바꿔줌
		Date d2 = sdf2.parse(s);
		System.out.println(d2);
		
		//Date -> Calender 변환
		Calendar cal = Calendar.getInstance();
		cal.setTime(d2);
	}

}
