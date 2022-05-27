// 2 ~ 100 사이의 모든 소수 출력하기
public class prc6 {
	public static void main(String[] args) {
		
		for (int i = 2; i <= 100; i++) {
			
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
					System.out.println(i);
			} 
		}
		
		
		
		// int count = 0;
		// System.out.println("2");
		// System.out.println("3");
		// System.out.println("5");
		// System.out.println("7");
		// for (int i = 2; i <= 100; i++) {
			// if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
				// count++;
			// } else {
				// System.out.println(i);
			// }
		// }
		// System.out.println("소수가 아닌수의 갯수: " + count);
	}
}