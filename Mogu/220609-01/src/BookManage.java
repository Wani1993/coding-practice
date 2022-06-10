import java.util.Arrays;
import java.util.Scanner;

public class BookManage {
	private BookInpo book1;
	private BookInpo book2;
	private BookInpo book3;
	private BookInpo book4;
	private BookInpo book5;
	
	
	public BookManage() {
		
	}

	public BookManage(BookInpo book1, BookInpo book2, BookInpo book3, BookInpo book4, BookInpo book5) {
		super();
		this.book1 = book1;
		this.book2 = book2;
		this.book3 = book3;
		this.book4 = book4;
		this.book5 = book5;
	}
	
	public void start() {
	 	Scanner scan = new Scanner(System.in);
		// 목록 만들기

		while (true) {
			System.out.println("--------도서 관리 프로그램--------");
			System.out.println("1.가격순으로(1.오름차순 2.내림차순)");
			System.out.println("2.이름으로 찾기");
			System.out.println("3.장르별로 찾기");		
			System.out.println("4.상세보기");
			System.out.println("5.프로그램종료");
			
			int menu = scan.nextInt();
			// 가격순으로 정렬 (같을때는 이름순)
			if (menu == 1) {
				System.out.println("1.오름차순 2.내림차순");
				while (true) {					
					int updown = scan.nextInt();
					if (updown == 1) {
						System.out.println("오름차순");
						System.out.printf("1.%s\n2.%s\n3.%s\n4.%s\n5.%s\n", book4.getName() + " : " + book4.getPrice(), book1.getName() + " : " + book1.getPrice(), book2.getName() + " : " + book2.getPrice(), book5.getName() + " : " + book5.getPrice(), book3.getName() + " : " + book3.getPrice());
					} else if (updown == 2) {
						System.out.println("내림차순");
						System.out.printf("1.%s\n2.%s\n3.%s\n4.%s\n5.%s\n", book3.getName() + " : " + book3.getPrice(), book5.getName() + " : " + book5.getPrice(), book2.getName() + " : " + book2.getPrice(), book1.getName() + " : " + book1.getPrice(), book4.getName() + " : " + book4.getPrice());
					} else {
						break;
					}
				}
			}
			if (menu == 2) {
				System.out.println("제목을 입력하세요");
				while (true) {			
					Scanner sc = new Scanner(System.in);
					String a = sc.nextLine();
					if (a.equals(book1.getName())) {
						book1.getBookinpo();
					} else if (a.equals(book2.getName())) {
						book2.getBookinpo();
					} else if (a.equals(book3.getName())) {
						book3.getBookinpo();
					} else if (a.equals(book4.getName())) {
						book4.getBookinpo();
					} else if (a.equals(book5.getName())) {
						book5.getBookinpo();
					} else {
						System.out.println("잘못입력했습니다.");
						break;
					}
				}
			}
			if (menu == 3) {
				while (true) {
					System.out.println("장르를 입력하세요");
					Scanner sn = new Scanner(System.in);
					String b = sn.nextLine();
					if (b.equals(book1.getGenre())) {
						book1.getBookinpo();
						book2.getBookinpo();
					} else if (b.equals(book3.getGenre())) {
						book3.getBookinpo();
					} else if (b.equals(book4.getGenre())) {
						book4.getBookinpo();
					} else if (b.equals(book5.getGenre())) {
						book5.getBookinpo();
					} else {
						System.out.println("잘못입력했습니다.");
						break;
					}
				}				
			}
			if (menu == 4) {
				printNames();
			}
			if (menu == 5) {
				System.out.println("프로그램 종료.");
				break;
			}
		}
	}
	

	
	public void printNames() {
		book1.getBookinpo();
		book2.getBookinpo();
		book3.getBookinpo();
		book4.getBookinpo();
		book5.getBookinpo();
	}
	
		
	public void printNames(BookInpo a) {
		System.out.printf("%s %s %s %s %d\n", a.getName(), a.getWriter(), a.getCom(), a.getGenre(), a.getPrice());
	}
	
	private BookInpo upDown(BookInpo left, BookInpo right) {
		if (left.getPrice() >= right.getPrice()) {
			return left;
		} else {
			return right;
		}
	}
	
	public BookInpo getTop() {
	    return upDown(upDown(upDown(upDown(book1, book2), book3), book4), book5); 
	}

	public BookInpo getBook1() {
		return book1;
	}

	public void setBook1(BookInpo book1) {
		this.book1 = book1;
	}

	public BookInpo getBook2() {
		return book2;
	}

	public void setBook2(BookInpo book2) {
		this.book2 = book2;
	}

	public BookInpo getBook3() {
		return book3;
	}

	public void setBook3(BookInpo book3) {
		this.book3 = book3;
	}

	public BookInpo getBook4() {
		return book4;
	}

	public void setBook4(BookInpo book4) {
		this.book4 = book4;
	}

	public BookInpo getBook5() {
		return book5;
	}

	public void setBook5(BookInpo book5) {
		this.book5 = book5;
	}
	
	
	
	
}
