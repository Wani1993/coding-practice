import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("가", "나", "다", "다", "다", "가", "라"));
		
		Set<String> set = new HashSet<>(list);
		
//		for (int i = 0; i < list.size(); i++) { // 반복문을 통해서 리스트에 있는 원소들을 Set으로 넣어준면 자동으로 중복을 제거해준다.
//			set.add(list.get(i));
//		}
		
		System.out.println(set);
	}
}
