import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main6 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(7, 3, 2, 8, 9, 1));
		
		Collections.sort(list);
		System.out.println(list);
		
		int index = Collections.binarySearch(list, 8); // Collections.binarySearch(객체, 원하는 원소) 입력한 원소의 인덱스를 구하는 것
		System.out.println("8의 인덱스: " + index);
		
		Collections.reverse(list);  // 원소의 순서를 역순으로 바꿔주는 것
		System.out.println(list);
		
		Collections.shuffle(list);  // 원소를 임의의 순서로 섞어주는 것
		System.out.println(list);
		
		System.out.println(Collections.max(list));  // 최대값
		System.out.println(Collections.min(list));  // 최소값
		
		Collections.fill(list, 33);  // 리스트의 길이값은 유지한채 안의 원소값들을 전부 입력값으로 변경
		System.out.println(list);
		
		Collections.replaceAll(list, 33, 77);  // Collections.replaceAll(객체, 바꾸고자하는값, 바꾸고싶은값)  바꾸고자 하는 값을 찾아서 원하는 값으로 변경할수있다.
		System.out.println(list);
		
		List<Integer> target = new ArrayList<>(Arrays.asList(90, 80, 70)); 
		Collections.copy(list, target);  // Collections.copy(복사하고자 하는 객체, 복사해서 집어넣고자 하는 객체);
		
		System.out.println(list);
	}
}
