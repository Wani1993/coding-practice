import java.util.Scanner;

public class ConsolePresenter {
	public void menu() {
		System.out.println("메뉴");
		System.out.println("1번. 추가, 2번. 목록, 3번. 수정, 4번. 삭제(오래된것)");
	}
	
	public void add() {
		Scanner scan = new Scanner(System.in);
		System.out.println("날짜? yyyy-MM-dd 예)2022-06-21");
		String date = scan.nextLine();
		System.out.println("제목?");
		String title = scan.nextLine();
		System.out.println("날씨?");
		String weather = scan.nextLine();
		System.out.println("내용?");
		String text = scan.nextLine();
		
	}
	
	public void list() {
		System.out.println("-일기 목록-");
		System.out.println("...");
	}
	
	public void edit() {
		System.out.println("수정할 날짜 ?");
	}
	
	public void delete() {
		System.out.println("삭제 되었습니다.");
	}
	
}
