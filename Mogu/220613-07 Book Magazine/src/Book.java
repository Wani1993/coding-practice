
public class Book {
	private String name;
	private int page;
	private String author;
	
	public Book(String name, int page, String author) {
		this.name = name;
		this.page = page;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String testPrint() {
		return "책제목: " + name + " " + "페이지수: " + page + " " + "저자: " + author;
	}
	
	
}
