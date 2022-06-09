
public class BookInpo {
	private String name;
	private String writer;
	private String com;
	private String genre;
	private int price;
	
	
	
	public BookInpo() {
		this.name = null;
		this.writer = null;
		this.com = null;
		this.genre = null;
		this.price = 0;
	
	}



	public BookInpo(String name, String writer, String com, String genre, int price) {
		this.name = name;
		this.writer = writer;
		this.com = com;
		this.genre = genre;
		this.price = price;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getWriter() {
		return writer;
	}



	public void setWriter(String writer) {
		this.writer = writer;
	}



	public String getCom() {
		return com;
	}



	public void setCom(String com) {
		this.com = com;
	}



	public String getGenre() {
		return genre;
	}



	public void setGenre(String genre) {
		this.genre = genre;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}
	
	public void getBookinpo() {
		System.out.printf("%s, %s, %s, %s, %d원\n", name, writer, com, genre, price);
	}
	
	
	
	

	
	
}
