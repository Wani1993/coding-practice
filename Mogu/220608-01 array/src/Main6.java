// for (int number : arr) 인덱스 확인없이 모든 숫자를 확인하기 좋다.
public class Main6 {
	public static void someMethod(double d, int... arr) { // ... 은 가변길이 파라미터라고 한다.(int[] 와 같다.) 파라미터 안에 여러개가있을경우에는 마지막에 있어야한다.
		for (int number : arr) { 
			System.out.println(number); 
		}
	}
	
	
	// 정수 2개를 전달 받아 합을 구해서 반환하는 메소드
	public static int sum(int... number) {
		int sum = 0;
		for (int i = 0; i < number.length; i++) {
			sum += number[i];
		}
		return sum;
	}
	
	
	
	
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		
		someMethod(40, 50, 60, 70, 80);
		
		int result = sum(10, 20, 30, 40, 50, 60, 70, 80);
		System.out.println(result);
		
//		someMethod(arr);
//		someMethod(new int[] { 20, 30, 40, 50, 60 });
//		System.out.println("---");
//		someMethod(new int[] { 4, 5, 6 });
//		System.out.println("종료");

		
		
		
		
//		
//		for (int number : arr) { // 콜론을 기준으로 오른쪽에는 여러개를 담을수 있는 객체가 온다. (배열)
//			System.out.println(number); // 값을 확인할때 사용하기 좋다. 순서나 값을 변경하기는 부적절하다.
//		}
	}

}
