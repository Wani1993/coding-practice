import java.util.Scanner;

// p237 1번
// p237 2번
// 기존에 작성하였던 학생관리 프로그램을 배열을 활용할 수 있는 방법으로 수정
public class Main2 {
	public static void print(int[] num) {
		String s = "";
		for (int i = 0; i < num.length; i++) {
			s += num[i] + " ";
		}
		 System.out.println(s);
	}
	
	public static void main(String[] args) {
		int[] cc = new int[10];
		cc[5] = 1;
		cc[6] = 1;
		cc[7] = 1;
				
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("좌석을 예약하시겠습니까? (0 또는 1)");
			int re = scan.nextInt();
			if (re == 0) {
				System.out.println("프로그램 종료");
				break;
			} else if(re == 1) {
				System.out.println("현재의 예약상태는 다음과 같습니다.");
				System.out.println("-------------------------");
				System.out.println("1 2 3 4 5 6 7 8 9 10");
				System.out.println("-------------------------");
				print(cc);
			} else {
				System.out.println("잘못된 입력입니다.");
			}
			System.out.println("좌석을 선택해주세요.");
			int end = scan.nextInt();
			cc[end-1] = 1;
			print(cc);
			System.out.println("예약되었습니다.");
	
		}
	
	}

}
