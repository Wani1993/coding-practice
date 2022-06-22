import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("둘리", 100);
		map.put("고길동", 90);
		map.put("도우너", 150);
		
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(1, "둘리");
		map2.put(4, "고길동");
		map2.put(3, "도우너");
		
		System.out.println(map.toString());
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> e : entrySet) {
			System.out.println(e.getKey() + " = " + e.getValue());
		}
		
		
		
		
		
		
		
		Set<String> keySet = map.keySet();  // set은 순환할수있도록 만들수있으니 key 값을 set리스트에 담은뒤
//		Iterator<String> iter = keySet.iterator();  // Iterator 를 이용해서 값을 하나하나 집어넣어 확인한다.
//		while (iter.hasNext()) {
//			String key = iter.next();
//			Integer value = map.get(key);
//			
//			System.out.println(key + " = " + value);
//		}
		
		for(String key : keySet) {
			System.out.println(key + " = " + map.get(key));
		}
		
	}
}
