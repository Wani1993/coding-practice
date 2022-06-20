import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main8 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(3, 23, 35, 11, 23, 57, 79));
		// 합, 평균
		Iterator<Integer> iterator = list.iterator(); // 원소 하나 하나를 볼수있도록 도와주는 객체
		int result = 0;
		while (iterator.hasNext()) {  // 해당 값이 리스트 안에있는지 확인하고 가져오는 객체 (이것을 안쓰면 예외가 발생한다)
			int num = iterator.next();
			result += num;							
		}
		System.out.println("합: " + result);
		System.out.println("평균: " + result / list.size());
		
		// 정수 57이 리스트에 있는지 ? 있으면 몇 번째 index에 위치하는지 ?
		if (list.contains(57)) {
			System.out.println("리스트 안에있음");
			System.out.println("index 번호는 : " + list.indexOf(57));
		}
		
		// 정수 23의 개수
		int result2 = 0;
		for (int i : list) {   // for each 문은 보는용도로만 쓰기 적합하다
			if (i == 23) {
				result2++;
			}
		}
		System.out.print("정수 23의 갯수는 : ");
		System.out.println(result2 + "개");
		
		// 중복되는 원소 23을 '하나' 삭제하기
		Iterator<Integer> iter = list.iterator();
		while (iter.hasNext()) {  // 해당 값이 리스트 안에있는지 확인하고 가져오는 객체 (이것을 안쓰면 예외가 발생한다)
			int num = iter.next();
			if (num == 23) {
				iter.remove();
				break;
			}
		}
		System.out.println(list);
		
		// 다른방법
		// int index = list.lastIndexOf(23);  // 마지막 부터 앞으로 찾는다 
		// list.remove(index);
		// System.out.println(list);
		
		// 또또 다른방법
		// list.remove(Integer.valueOf(23));
		// System.out.println(list);
		
	}
}