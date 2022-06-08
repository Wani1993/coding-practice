import java.util.Scanner;

// 사용자에게 5번의 정수를 입력받아
// 최근 입력한 순(역순)으로 출력하기
// 예) 10 20 30 40 50 -> 50 40 30 20 10


public class Main5 {
		public static void main(String[] args) {
		
		int[] num = new int[5];
		
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.print("숫자를을 입력하시오: ");
			num[i] = scan.nextInt();
		}
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.println("역순은: " + num[i]);
		}
		
		
//		int[] num2 = new int[6];
//		while (true) {
//			
//			num2[] = scan.nextInt();
//			if(num2[] < 0) {
//				break;
//			}
//			num2[1] = num2[2];
//			num2[2] = num2[3];
//			num2[3] = num2[4];
//			num2[4] = num2[5];
//			num2[5] = num2[1];
//		
//		}
//		
		
		

	
	

		
			
		
		
		
		
	}

}
