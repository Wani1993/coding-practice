import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("문자열 객체");
		list.add(new Object());
		list.add(Integer.valueOf(100));
		list.add(Double.valueOf(55.55));
		
		list.add(500); // auto-boxing 이 일어나면서 Integer500 으로 변환된다. 500이라는 인트형이 들어간것이 아니라 500이라는 인트형이 들어간 인스턴스를 참조하는것.
		list.add(123.123); // 마찬가지
		
//		int size = list.size();
//		System.out.println(size);
//		
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(3));
		
//		for (int i = 0; i < list.size(); i++) {  // 순서대로 표시하기
//			System.out.println(list.get(i)); 
//		}
//		
//		for (int i = list.size() - 1; i >= 0; i--) {  // 역순으로 표시하기
//			System.out.println(list.get(i));
//		}
		
		for (Object o : list) {   // for each 문을 이용한 모든 원소 표시하기
			System.out.println(o);
		}
		
	}
}
