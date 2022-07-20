public class TestBookservice {
	public static void main(String[] args) {
		BookService service = new BookService(new BookDaoParamConn());
		service.insertAndUpdate("중복", 1000);
//		service.insertAndUpdate("중복이름", 660);
	}
}
