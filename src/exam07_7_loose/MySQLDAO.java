package exam07_7_loose;

public class MySQLDAO implements DBDAO{
	
	//MySQLDAO 연동하는 메서드
	@Override
	public void connect() {
		System.out.println("MySQLDAO.connect_mysql");
	}
}
