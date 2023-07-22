package exam07_6;

public class DBService {
	MySQLDAO dao;
	public void setDAO(MySQLDAO dao) {
		this.dao = dao;
	}
	public void connect() {
		dao.connect_mysql();
	}
	
	//OracleDAO에서 MySQLDAO로 변경시 출력 달라짐
}
