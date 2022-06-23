import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Book {
	private String title;
	private int price;
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Book))
			return false;
		Book other = (Book) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
	
	
}


public class Main8 {
	public static void main(String[] args) {
		Book b1 = new Book("책1", 5000);
		Book b4 = new Book("책3", 4000);
		Book b2 = new Book("책1", 5000);
		Book b3 = new Book("책2", 7000);
		
		Comparator<Book> com = new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				return o1.getPrice() - o2.getPrice();
			}
			
		};
		
	
		Set<Book> treeByprice = new TreeSet<>(com);  // set은 순서를 안따진다. 
		treeByprice.add(b1);
		treeByprice.add(b2);
		treeByprice.add(b3);
		treeByprice.add(b4);
		
		System.out.println(treeByprice);
		
		
		
		
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b3));
		
		Set<Book> set = new HashSet<>(); // 각 객체마다 가지고 있는 고유한 숫자값을 Hash라고한다.
		set.add(b1);					 // 1차적으로 Hash 값을 비교하고 같으면 equals로 비교를 한다.
		set.add(b2);
		set.add(b3);
		
		System.out.println(set.size());
		System.out.println(set);
		
		
	}
}
