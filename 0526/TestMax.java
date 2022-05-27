public class TestMax {
	public static int max(int left, int right) {
		return left > right ? left : right;
		
		// if (left > right) {
			// return left;
		// } else {
			// return right;
		// }
	}
	public static void main(String[] args) {
		// // 3개 정수 중 가장 큰 값 구하기
		// int a = 3;
		// int b = 4;
		// int c = 5;
		// // 4개
		// int d = 6;
		// // 5개
		// int e = 7;
		
		int x = 10;
		int y = 50;
		int z = 75;
		
		int result = max(x, y);
		int finalresult = max(result, z);
		
		System.out.println(finalresult);
		
		// System.out.println(max(e, max(d, max(c, max(a, b)))));
	}
}