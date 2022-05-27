//1번
// 책 클래서 (class Book)
// 필드(상태) : 제목, 저자
// 메소드(기능) : 제목과 저자를 콘솔에 출력가능

class Book {
	// String title;
	// String author;
	
	void print(String a, String b) {
		String title;
	    String author;
		title = a;
		author = b;
		System.out.println("제목 : " + a + "  " + "저자 : " + b);
	}
}


public class BookTest {
	public static void main(String[] args) {
		Book a = new Book();
		// a.title = "My";
		// a.author = "Book";
		a.print("나는아직", "배고프다");
	}
}