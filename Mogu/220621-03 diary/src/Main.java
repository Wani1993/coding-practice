import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// 일기 관리 프로그램
// 일기 (날짜, 제목, 날씨, 내용 등등)

// 일기등록
// 같을 일자에는 일기 중복 안됨

// 일기 목록도 볼 수 있음
// 날짜 순
// 내용 길이 순

// 날짜를 선택해서 해당 일기 내용을 수정 가능

// 삭제 - 가장 오래된 일기가 삭제됨.
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		Mydiary d1 = new Mydiary(6.29, "리스트", "맑음", "리스트를 배웠다 왕왕왕");
//		Mydiary d2 = new Mydiary(6.22, "집으로", "맑음", "집에 가고싶다");
//		Mydiary d3 = new Mydiary(6.23, "여행", "흐림", "해외로 튀고싶다");
		
		List<Mydiary> list = new LinkedList<Mydiary>();
//		list.add(d1);
//		list.add(d2);
//		list.add(d3);
		
		Go g = new Go();
		
		while (true) {
			g.input();
			list.add(g.input());
		}
	
	
		
//		System.out.println(list.get(0).getDate());
//		System.out.println(list.get(1).getDate());
//		System.out.println(list.get(2).getDate());
//		
//		Collections.sort(list);
//		System.out.println(list.get(0).getDate() + " " +list.get(0).getTitle());
//		System.out.println(list.get(1).getDate() + " " + list.get(1).getTitle());
//		System.out.println(list.get(2).getDate() + " " + list.get(2).getTitle());
		
		Comparator<Mydiary> comparator = new Comparator<Mydiary>() {  // 익명 클래스 생성 , 비교대상을 오버라이드 해서 새로운 비교기준을 만듬
			@Override
			public int compare(Mydiary o1, Mydiary o2) {
				return o1.getText().length() - o2.getText().length();
			}
		};
//		
//		Collections.sort(list, comparator);
//		System.out.println(list.get(0).getTitle());
//		System.out.println(list.get(1).getTitle());
//		System.out.println(list.get(2).getTitle());
//		
//		
//		while(true) {
//			
//			System.out.println("----------일기 관리 프로그램----------");
//			System.out.println("1.일기 목록	2.날짜순 목록");
//			System.out.println("3.내용길이순 목록	4.일기 내용 수정");
//			System.out.println("5.일기 삭제	6.종료.");	
//			int num = scan.nextInt();
//			
//			if (num == 1) {
//				System.out.println(list.get(i).getTitle());
//			}
//			
//			
//		}
		
	}
}
