import java.util.*;
public class Main2 {
	public static void main(String[] args) {
		String s = null;
		try {
			String local = "지역변수";
			
			int[] arr = new int[0];
			arr[1] = 10;
			
			int div = 10 / 0;
			
			s.equals("asdf");
			
			System.out.println("실행되나 ?");
		} catch(NullPointerException e) {
//			System.out.println(local); local 은 지역변수라서 밖에서는 쓸수없다
			System.out.println("널 포인트 익셉션 처리");
		} catch(ArithmeticException e) {
			System.out.println("수 익셉션 처리");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 예외 처리");
		} catch(Exception e) {
			System.out.println("모든 예외가 여기서 잡혀버림"); // 위에다 설정해놓으면 순서대로 하기때문에 밑에있는애들은 예외처리를 못하기때문에 컴파일에러가 난다
		}
		
//		System.out.println(local); local 은 지역변수라서 밖에서는 쓸수없다
		System.out.println("정상 종료");

	}
}
