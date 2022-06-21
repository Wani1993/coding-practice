import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D")); // 추가 및 삭제가 자주 일어날때 사용, 모든원소를 하나하나 확인할때는 ArrayList가 좋음.
		
		list.remove(0);
		
		list.remove("C");
		
		System.out.println(list);
		
		LinkedList<String> down = (LinkedList<String>) list;
		down.addFirst("asdf");
		down.removeFirst();
		down.getFirst();
		
		System.out.println(down);
		
	}
}
