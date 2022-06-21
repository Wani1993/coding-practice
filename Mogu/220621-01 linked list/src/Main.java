import java.util.Iterator;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("문자열1");
		list.add("문자열2");
		list.add("문자열3");
		list.add("문자열4");
		
		list.get(0);
		list.get(1);
		list.get(2);
		list.get(3);
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
		for (String s : list) {
			System.out.print(s);
		}
		System.out.println();
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.print(str);
		}
		
	}
} 
