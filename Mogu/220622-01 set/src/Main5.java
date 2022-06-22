import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Main5 {
	public static void main(String[] args) {
		// 중복되지 않는 1 ~ 45 사이의 정수 6개를 가지는 집합
		
		Set<Integer> loto = new HashSet<>();
		Random ran = new Random();
			
		while (loto.size() < 6) {
			loto.add(ran.nextInt(45) + 1);
		}
			
		System.out.println(loto);
		
//		Collections.sort(loto);  // 인덱스 번호가 없기 때문에 정렬할수없다.
		
		List<Integer> list = new ArrayList<>(loto); // 때문에 리스트를 하나 생성해서 넣은후 재정렬을 한다.
		
		Collections.sort(list);
		System.out.println(list);
		
		
	}
}
