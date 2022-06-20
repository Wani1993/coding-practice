import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main9 {
	public static boolean isNumberChar(char c) {  // 문자가 0 에서 9 사이에 있는 숫자인지 확인하는 메소드
		return c >= '0' && c <= '9';
	}
	
	public static boolean isNumberStr(String s) {  // 문자열을 하나하나 쪼개서 숫자인지 비교하는 메소드
		for (int i = 0; i < s.length(); i++) {
			if(!isNumberChar(s.charAt(i))) {
				return false;
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "carrot", "donut", "egg"));
		List<String> copy = new ArrayList<>(list);
		// 위 리스트에서
		// 문자열 길이가 4글자인 문자열만을 원소로 가지는 리스트 생성
		Iterator<String> inter1 = copy.iterator(); // 원소 하나 하나를 볼수있도록 도와주는 객체
		while (inter1.hasNext()) {  // 해당 값이 리스트 안에있는지 확인하고 가져오는 객체 (이것을 안쓰면 예외가 발생한다)
			String str = inter1.next();
			if(str.length() == 3 || str.length() == 6) {
				inter1.remove();
			}
		}
		System.out.println(copy);
				
		// 문자열 중에 'e'문자를 포함하는 문자열만을 원소로 가지는 리스트 생성
		List<String> list2 = new ArrayList<>();
//		Iterator<String> inter2 = list.iterator();
//		while (inter2.hasNext()) {  
//			String str = inter2.next();
//			if(str.contains("e")) {
//				list2.add(str);
//			}			
//		}
//		System.out.println(list2);
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			if (str.contains("e")) {
				list2.add(str);
			}
		}
		System.out.println(list2);
		
		// 위의 2번 리스트에서 '숫자 형태의 값'을 가지는 문자열을 찾아
		// 해당 원소를 가지는 정수형 리스트 생성
		List<String> list3 = new ArrayList<>(Arrays.asList("가", "1", "@", "3", "나", "1000"));
//		char c = "3".charAt(0);
//		System.out.println(c >= '0' && c <= '9');
		List<Integer> listInteger = new ArrayList<>();
		
//		for (int i = 0; i < list3.size(); i++) {
//			String str = list3.get(i);
//			try {
//				Integer value = Integer.valueOf(str);
//				listInteger.add(value);
//			} catch (NumberFormatException e) { // 예외처리 함으로써 정상흐름으로 돌아가 원하는 문자열만 반환
//				
//			}
//		}
		
	//-----------------------------------------------------------------------------------
		
		for (int i = 0; i < list3.size(); i++) {
			String str = list3.get(i);
			
			if(isNumberStr(str)) {
				listInteger.add(Integer.valueOf(str));
			}
		}
		
		System.out.println(listInteger);
		
		
		
		
	}
}
