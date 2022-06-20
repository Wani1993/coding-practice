import java.util.ArrayList;
import java.util.List;

public class Main3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		// 위 리스트에 10, 20, 30, 40
		for (int i = 1; i <= 4; i++) {
			list.add(i * 10);
		}
			
		// 모든 원소 출력해보기
		System.out.println(list.toString());
		// 리스트 원소의 값을 변경하기
		list.set(1, 15);
		System.out.println(list);
		
		System.out.println(list.contains(30));   // contains 메소드는 파라미터의 값이 리스트 안에 있는지 확인하는것.
		System.out.println(list.indexOf(30));  // indexOf 해당값이 몇번째 인덱스에 있는지 확인하는것.
		
		// 해당 인덱스를 제거하기
		list.remove(2);
		System.out.println(list);
		// 리스트에 원소 추가하기
		list.add(0, 0);
		System.out.println(list);
		
		//모든 원소를 다 지우고싶을때
		list.clear();  // 다 지우고 싶을때는 반복문보다는 clear 메소드를 쓰는게 좋다 (반복문을 이용하면 인덱스번호가 땡겨지면서 다 지워지지않음)
		System.out.println("지운 결과 : " + list);
		System.out.println(list.size() == 0);
		list.add(0, 15);
		System.out.println(list.isEmpty());
		System.out.println(list);
		
		
	}
}