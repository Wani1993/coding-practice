import java.util.Set;
import java.util.TreeSet;

public class Main7 {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();  // TreeSet 들어있는 원소들의 중복의 제거와 동시에 순서대로 배열해준다
		set.add(50);
		set.add(17);
		set.add(2);
		set.add(50);
		set.add(22);
		set.add(17);
		set.add(30);
		
		for (int i : set) {
			System.out.println(i);
		}
		
	}
}
