import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("일", 1);
		map.put("이", 2);
		map.put("삼", 3);
		map.put("사", 4);
		
		System.out.println(map.size());
		
		System.out.println(map.get("이"));   // key 라는 객체를 전달 받는다.  key 값을 집어 넣으면 value 값을 돌려준다.
		System.out.println(map.get("삼"));
		System.out.println(map.get("오"));
		
		if(!map.containsKey("이")) {  // 없을때만 집어넣어라
			map.put("이", 2222);
		}
		System.out.println(map.get("이"));
		
	}
}
