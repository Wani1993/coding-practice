public class Main {
	public static void someMethod(int param) {
		
	}
	
	// 메소드는 이름이 같아도 파라미터의 타입과 순서, 갯수를 확인해서 다르면 다른 메소드로 분류한다
	public static void sum(int a, int b) {
		System.out.println(a + b);
	}
			
	public static void sum(double a, double b) {
		System.out.println(a + b);
	}
	
	public static void main(String[] args) {
//		someMethod(3873.03767);
//		someMethod(453);
		
		
		// Method Overloading  => 다양한 타입에서도 동작하게 만들기 위해 만드는 메소드들
		System.out.println(123123);
		System.out.println(123.123);
		System.out.println("123.123");
		
		sum(4, 5);
		sum(4.0, 5.0);
		
	}

}