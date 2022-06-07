import java.util.Scanner;

// 사용자에게 5번의 정수를 입력받아
// 최근 입력한 순(역순)으로 출력하기
// 예) 10 20 30 40 50 -> 50 40 30 20 10

// 사용자가 0이하의 정수를 입력할때까지 반복하여 입력
// 최근 5개를 출력

// 10 20 30 40 50 60 70 80 90 100 -1 -> 100 90 80 70 60

public class Main5 {
		public static void main(String[] args) {
		
		int[] num = new int[5];
		
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i <= 4; i++) {
			System.out.print("숫자를을 입력하시오: ");
			num[i] = scan.nextInt();
		}
		for (int i = 4; i >= 0; i--) {
			System.out.println("역순은: " + num[i]);
		}
		
		

	
	

		
			
		
		
		
		
	}

}
