import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Main4 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("apple");
		list.add("banana");
		list.add("carrot");
		list.add("donut");
		
		Iterator<String> iterator = list.iterator(); // 원소 하나 하나를 볼수있도록 도와주는 객체
		while (iterator.hasNext()) {  // 해당 값이 리스트 안에있는지 확인하고 가져오는 객체 (이것을 안쓰면 예외가 발생한다)
			String str = iterator.next();
			if(str.length() == 5) {
				iterator.remove();
			}
		}
		
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
		
		
		
		
		
//		System.out.println(list.contains(new String("banana")));
//		list.remove("banana");  // 동등한 원소 하나를 찾아서 지우기
//		
//		System.out.println(list);
		
		// 위의 리스트에서 5글자 문자열만 찾아서 지우기
//		for (String s : list) {  // 포이치 문은 변경하는데 적합하지 않음
//			if(s.length() == 5) {
//				list.remove(s);
//			}
//		}
		System.out.println(list);
		
			
	}
}
