import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main10 {
		public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("사과", "포도", "오렌지", "배", "수박"));
		
		// 콘솔 입출력
		Scanner scan = new Scanner(System.in);
		
		
		try {
			what : while(true) {
				System.out.println("1. 과일목록 보여주기");
				System.out.println("2. 고객에게 와일주기");
				System.out.println("3. 재고과일 추가하기");
				int a = scan.nextInt();
				
				if(a == 1) { // 과일 목록 보여주기
					System.out.println(list);
				} else if(a == 2) {  // 고객에게 과일 주기(제일 앞에거부터 줌)
					if(list.size() > 0) {
						System.out.println(list.get(0) + " " + "드릴게용!");
						list.remove(0);
						System.out.println("남은과일 : " + list);
					} else {
						System.out.println("매진이용");
					}
				} else if(a == 3) {  	// 재고 과일 추가하기(제일 마지막에 추가)
					if (list.size() < 10) {
						System.out.println("무슨과일을 추가할거?");
						Scanner sc = new Scanner(System.in);
						String pp = sc.nextLine();
						list.add(pp);
						System.out.println("현재 진열된 과일 수: " + list.size());
					} else {
						System.out.println("진열대가 꽉찼습니다.");
						continue what;
					}
				} else if(a == 0) {
					System.out.println("시스템 종료");
					break;
				} else {
					System.out.println("잘못된 입력");
				}
			}
		} catch(Exception e) {
			System.out.println("시스템 종료");
		}
		
		
		
		
		
		
		
	
		
		
	}
}