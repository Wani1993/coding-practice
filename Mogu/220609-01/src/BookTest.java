import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		BookInpo a = new BookInpo("작별인사", "김영하", "복복서가", "장편소설", 12600);
		BookInpo b = new BookInpo("불편한 편의점", "김호연", "나무옆의자", "장편소설", 12600);
		BookInpo c = new BookInpo("지금 알고 있는 걸 그때도 알았더라면", "류시화", "열림원", "시집", 8100);
		BookInpo d = new BookInpo("코스모스", "칼 세이건", "사이언스북스", "과학 공학", 16650);
		BookInpo e = new BookInpo("여행의 이유", "김영하", "문학동네", "에세이", 12150);

		BookManage wow = new BookManage(a, b, c, d, e);
	//	end.printNames();

	//	a.getBookinpo();1
	//	System.out.println(end.getTop().getName());
		wow.start();
		
		System.out.println();
		
		

	}

}
