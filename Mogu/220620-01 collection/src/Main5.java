import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main5 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
		System.out.println(list);
		
		
//		list<Integer> test = Arrays.asList(10, 20, 30, 40, 50);  asList는 원소 추가나 변경할수가없다
//		test.add(60);
		
		list.addAll(Arrays.asList(60, 70 ,80));  // 안에 원소 다 추가하기
		System.out.println(list);
		
		list.removeAll(Arrays.asList(30, 40, 50)); // 안에 원소 다 빼기
		System.out.println(list);
		
		System.out.println(list.containsAll(Arrays.asList(10, 20)));  // containsAll 은 안에 원소가 다 있는지 확인하는것
		
		List<Integer> sub = list.subList(0, 3);
		System.out.println(sub);
		System.out.println(list);
	}
}
