
public class TestBook {

	public static void main(String[] args) {
		Book b = new Book("아프니까청춘이다", 240, "몰?루");
		
		Magazine m = new Magazine("내이름은코난", 100, "탐정이죠", "6/15");
		System.out.println(b.testPrint());
		System.out.println(m.testPrint());
	}

}
