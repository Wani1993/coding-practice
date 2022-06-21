import java.util.List;
import java.util.Scanner;

public class ConsolePresenter {
	
	private DiaryManage manager;
	
	public ConsolePresenter() {
		manager = new DiaryManageImpl();
	}				
	
	public void start() {
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			menu();
			int number = scan.nextInt();
			
			switch(number) {
			case 1:
				add();
				break;
			case 2:
				list();
				break;
			case 3: 
				edit();
				break;
			case 4:
				delete();
				break;
			default : 
				break;
			}
		}	
	}
	
	public void menu() {
		System.out.println("메뉴");
		System.out.println("1번. 추가, 2번. 목록, 3번. 수정, 4번. 삭제(오래된것)");
	}
	
	public void add() {
		Scanner scan = new Scanner(System.in);
		System.out.println("날짜? yyyy-MM-dd 예)2022-06-21");
		Scanner sc = new Scanner(System.in);
		double date = scan.nextDouble();
		System.out.println("제목?");
		String title = sc.nextLine();
		System.out.println("날씨?");
		String weather = sc.nextLine();
		System.out.println("내용?");
		String text = sc.nextLine();
		
		manager.add(new Mydiary(date, title, weather, text));
	}
	
	public void list() {
		System.out.println("-일기 목록-");
		List<Mydiary> list = manager.list();
		for (Mydiary d : list) {
			System.out.println(d);
		}		
	}
	
	public void edit() {
		Scanner scan = new Scanner(System.in);
		System.out.println("수정할 날짜 ?");
		double date = scan.nextDouble();
		
		System.out.println("내용?");
		String text = scan.nextLine();
		
		manager.edit(date, text);
	}
	
	public void delete() {
		manager.deletFirst();
		System.out.println("삭제 되었습니다.");
	}
	
}
