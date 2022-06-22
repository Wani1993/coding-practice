import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main4 {
	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));
		
		Set<Integer> setUnion = new HashSet<>(); // 새로운 Set을 생성해서 두 값을 다 더한다
		
		setUnion.addAll(setA);
		setUnion.addAll(setB);
				
		System.out.println(setUnion);
		
		Set<Integer> setDuplicate = new HashSet<>();
		setDuplicate.addAll(setA);
		setDuplicate.retainAll(setB);  // 중복된 애들만 남기는것.
		System.out.println(setDuplicate);
		
		Set<Integer> setLeftOuter = new HashSet<>();
		setLeftOuter.addAll(setA);
		setLeftOuter.removeAll(setB);  // 차집합을 구할때 (중복된 애들을 빼고 남은 원소만 보여준다)
		System.out.println(setLeftOuter);
		
		Set<Integer> setSame = new HashSet<>(Arrays.asList(7, 6, 5, 4, 3, 2, 1));
		System.out.println(setSame.equals(setUnion));  // set에서의 equals는 원소의 순서와 상관없이 내부에 원소들값만 다 같다면 true다.
		
	}
}
