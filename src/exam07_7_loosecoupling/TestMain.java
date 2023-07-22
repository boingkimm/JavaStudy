package exam07_7_loosecoupling; //DBDAO 인터페이스로 연결시

public class TestMain {
	
	public static void main(String[] args) {
		DBService service = new DBService();
//		service.setDAO(new OracleDAO());
		service.setDAO(new MySQLDAO());
		service.connect();
	}
}
//서비스 변경해도 다른 데 영향X