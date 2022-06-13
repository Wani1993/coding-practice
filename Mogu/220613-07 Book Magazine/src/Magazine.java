public class Magazine extends Book {
	private String date;

	public Magazine(String name, int page, String author, String date) {
		super(name, page, author);
		this.date = date;
	}
	
	public String testPrint() {
		return super.testPrint() + " " + "발매일: " + date;
	}
	
}
