import java.util.Arrays;
import java.util.Scanner;
/*
 * 도서 관리 프로그램
 * 
 * 목록 보기
 * 1. 가격순으로(오름차순, 내림차순 선택가능)
 * 2. 분야를 선택해서 해당 분야만 보기
 */

// 1. 작별인사                / 김영하 / 복복서가 / 장편소설 / 12,600원
// 2. 불편한 편의점                / 김호연 / 나무옆의자 / 장편소설 / 12,600원
// 3. 지금 알고 있는 걸 그때도 알았더라면    / 류시화 / 열림원 / 시집 / 8,100원
// 4. 코스모스                  / 칼 세이건 / 사이언스북스 / 과학 공학 / 16,650원
// 5. 여행의 이유               / 김영하 / 문학동네 / 에세이 / 12,150원
public class Main {
	public static int upDown(int left, int right) {
		if (left >= right) {
			return left;
		} else {
			return right;
		}
	}

	public static void main(String[] args) {
		String[] book1 = { "작별인사", "김영하", "복복서가", "장편소설", "12,600원" };
		String[] book2 = { "불편한 편의점", "김호연", "나무옆의자", "장편소설", "12,600원" };
		String[] book3 = { "지금 알고 있는 걸 그때도 알았더라면", "류시화", "열림원", "시집", "8,100원" };
		String[] book4 = { "코스모스", "칼 세이건", "사이언스북스", "과학 공학", "16,650원" };
		String[] book5 = { "여행의 이유", "김영하", "문학동네", "에세이", "12,150원" };

		int price1 = 12600;
		int price2 = 12600;
		int price3 = 8100;
		int price4 = 16650;
		int price5 = 12150;

		int result = upDown(upDown(upDown(upDown(price1, price2), price3), price4), price5);

		
		Scanner scan = new Scanner(System.in);
		// 목록 만들기

		while (true) {
			System.out.println("--------도서 관리 프로그램--------");
			System.out.println("1.가격순으로(1.오름차순 2.내림차순)");
			System.out.println("2.이름으로 찾기");
			System.out.println("3.장르별로 찾기");		
			
			int menu = scan.nextInt();
			// 가격순으로 정렬 (같을때는 이름순)
			if (menu == 1) {
				System.out.println("1.오름차순 2.내림차순");
				while (true) {					
					int updown = scan.nextInt();
					if (updown == 1) {
						System.out.println("오름차순");
						System.out.printf("1.%s\n2.%s\n3.%s\n4.%s\n5.%s\n", book4[0] + " : " + book4[4], book1[0] + " : " + book1[4], book2[0] + " : " + book2[4], book5[0] + " : " + book5[4], book3[0] + " : " + book3[4]);
					} else if (updown == 2) {
						System.out.println("내림차순");
						System.out.printf("1.%s\n2.%s\n3.%s\n4.%s\n5.%s\n", book3[0] + " : " + book3[4], book5[0] + " : " + book5[4], book2[0] + " : " + book2[4], book1[0] + " : " + book1[4], book4[0] + " : " + book4[4]);
					} else {
						break;
					}
				}
			}
			//제목으로 책 정보 찾기
			if (menu == 2) {
				System.out.println("제목을 입력하세요");
				while (true) {			
					scan.nextLine();
					String a = scan.nextLine();
					if (a.equals("작별인사")) {
						System.out.println(Arrays.toString(book1));
					} else if (a.equals("불편한 편의점")) {
						System.out.println(Arrays.toString(book2));
					} else if (a.equals("지금 알고 있는 걸 그때도 알았더라면")) {
						System.out.println(Arrays.toString(book3));
					} else if (a.equals("코스모스")) {
						System.out.println(Arrays.toString(book4));
					} else if (a.equals("여행의 이유")) {
						System.out.println(Arrays.toString(book5));
					} else {
						System.out.println("잘못입력했습니다.");
						break;
					}
				}
			}
			// 분야를선택해서 해당 장르만
			if (menu == 3) {
				while (true) {
					System.out.println("장르를 입력하세요");
					scan.nextLine();
					String b = scan.nextLine();
					if (b.equals("장편소설")) {
						System.out.println(Arrays.toString(book1));
						System.out.println(Arrays.toString(book2));
					} else if (b.equals("시집")) {
						System.out.println(Arrays.toString(book3));
					} else if (b.equals("과학공학")) {
						System.out.println(Arrays.toString(book4));
					} else if (b.equals("에세이")) {
						System.out.println(Arrays.toString(book5));
					} else {
						System.out.println("잘못입력했습니다.");
						break;
					}
				}				
			}
		}


		

		
	}
}
