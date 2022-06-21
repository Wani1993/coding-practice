import java.util.LinkedList;
import java.util.Queue;

public class Main3 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList(); // linkedlist 를 큐 라는 동작으로 사용하겠다 라는말
		
		queue.add("원소1");
		queue.offer("원소2");   // offer 는 Queue 의 추상 메소드. offer에서만 사용 가능.
		
		System.out.println(queue);
		
		String elem1 = queue.poll();  // 원소가 없으면 null , 첫번째꺼 빼오는것
		String elem2 = queue.remove(); // 원소가 없으면 예외를 발생 , 첫번째꺼 빼오는것
		
		System.out.println(elem1);
		System.out.println(elem2);
		
		System.out.println(queue);
	}
}
