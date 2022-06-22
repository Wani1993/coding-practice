import java.util.HashSet;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		HashSet set = new HashSet();  // 인스턴스 생성 , HashSet은 중복되는 원소는 집어넣지않는다
		boolean b1 = set.add("qwer");
		boolean b2 = set.add(Integer.valueOf(10));
		boolean b3 = set.add("qwer");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);  // 중복된값은 넣지 않아서 false
		
		System.out.println(set.size());
		
		System.out.println(set.toString());
		
		System.out.println("--------------------");
		//set.get(0); // 인덱스 번호를 가지지 않기 때문에 get이라는 메소드 자체가 존재하지 않는다
		// 때문에 안에 원소들을 다 보기 위해서는 for each 문을 사용해야한다.
		for (Object o : set) {
			System.out.println(o);
		}
		
		System.out.println("--------------------");
		
		Iterator<Object> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
	}
}
