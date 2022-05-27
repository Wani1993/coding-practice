public class StaticVariableAndConst2 {
	public static void printTest(int param) {
		param++;
		System.out.println(param);
	}
	
	
	
	
	public static void main(String[] args) {
		int inner = 10;
		// System.out.println(TEST_SCOPE);
		final int TEST_SCOPE = 20;
		printTest(TEST_SCOPE);
		System.out.println("메인에서의 상수값: " + TEST_SCOPE);
		
		
		
		
		
		
		
		// int inner = 10;
		// final int TEST_SCOPE = 20;
		
		// {
			// System.out.println(inner);
			// System.out.println(TEST_SCOPE);
			
			// // final int TEST_SCOPE;
			// final int BLOCK = 100; //지역 변수로써 중괄호 안에서만 작용한다.
		// }
		// System.out.println(BLOCK);
	}
}