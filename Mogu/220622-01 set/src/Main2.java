import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();  // 중복 제거에 특화되었다.
		set.add("banana");
		set.add("carrot");
		set.add("apple");
		set.add("banana");
		
		System.out.println(set.toString());
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		set.contains("banana");
		set.contains("donut");
		
	}
}
