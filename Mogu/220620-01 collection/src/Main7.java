import java.awt.Container;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main7 {
	public static void main(String[] args) {
		// 2의 배수를 5개 가지는 정수형 리스트 생성 및 초기화해보기
		List<Integer> list1 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
		System.out.println(list1);
		
		// 7의 배수를 5개 가지는 정수형 리스트 생성 및 초기화해보기
		List<Integer> list2 = new ArrayList<>(Arrays.asList(7, 14, 21, 28, 35));
		System.out.println(list2);
		
		// 3번. 위의 리스트의 원소들을 모두 다 가지는 리스트 
		List<Integer> list3 = new ArrayList<>();
		list3.addAll(list1);
		list3.addAll(list2);
		System.out.println(list3);
		
		// 3번의 리스트를 오름차순으로 정렬된 원소를 가지는 복사본 생성
		List<Integer> copy = new ArrayList<>(list3);
				
		Collections.sort(copy);
		System.out.println(copy);
		
		// (Random 객체를 사용하여) 0 ~ 10 사이의 난수(정수형)를 6개 가지는 리스트 (각 숫자값은 중복되지 않아야함)
		Random r = new Random();
		List<Integer> ran = new ArrayList<>();
		while (ran.size() != 6) {  // 리스트의 사이즈가 6이 아니면 반복하게
			int a = r.nextInt(11);  // a안에 랜덤 값을 저장
			if (!ran.contains(a)) { // 리스트 안에 동일한 랜덤값이 없으면 값을 추가하게 만들기
				ran.add(a);
			}
		}
			
		System.out.println(ran);
		
		
	}
}
