package exam07_6; //TestMain - DBService - OracleDAO - Oracle (has a 관계)

public class TestMain {
	
	public static void main(String[] args) {
		DBService service = new DBService();
//		service.setDAO(new OracleDAO());
		service.setDAO(new MySQLDAO());  //변경
		service.connect();
	}
}
