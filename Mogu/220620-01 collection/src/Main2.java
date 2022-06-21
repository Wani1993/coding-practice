import java.util.ArrayList;

public class Main2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
//		list.add("asdf");  // Integer 타입으로 선언되어서 스트링 타입은 들어갈수가 없다.
		
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println(sum);
		
	}

}
