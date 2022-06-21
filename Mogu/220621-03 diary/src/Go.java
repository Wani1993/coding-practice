import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// 일기 (날짜, 제목, 날씨, 내용 등등)

// 일기등록
// 같을 일자에는 일기 중복 안됨

// 일기 목록도 볼 수 있음
// 날짜 순
// 내용 길이 순

// 날짜를 선택해서 해당 일기 내용을 수정 가능

// 삭제 - 가장 오래된 일기가 삭제됨.
public class Go {


	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("----------일기 관리 프로그램----------");
		System.out.println("1.일기 목록	2.날짜순 목록");
		System.out.println("3.내용길이순 목록	4.일기 내용 수정");
		System.out.println("5.일기 삭제	6.종료.");		    
	}
	
	public Mydiary listIn() {
		Scanner sc = new Scanner(System.in);
		System.out.print("날짜를 입력하세요: ");
		double d = sc.nextDouble();
		System.out.print("제목을 입력하세요: ");
		Scanner ss = new Scanner(System.in);
		String s = ss.nextLine();
		System.out.print("날씨를 입력하세요: ");
		String w = ss.nextLine();
		System.out.print("내용을 입력하세요: ");
		String t = ss.nextLine();
		
		Mydiary input = new Mydiary(d, s, w, t);
		return input;
	}
	
	public String allList(Mydiary o) {
		return o.getTitle();
	}
	
		
	
}

