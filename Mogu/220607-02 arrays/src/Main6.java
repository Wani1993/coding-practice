import java.util.Scanner;

// 사용자가 0이하의 정수를 입력할때까지 반복하여 입력
// 최근 5개를 출력

// 10 20 30 40 50 60 70 80 90 100 -1 -> 100 90 80 70 60

public class Main6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] box = new int[5];
		int i = 0;
		
		while (true) {
			int n = scan.nextInt();
			if (n <= 0) {
				break;
			}
			box[i] = n;
			i++;
			
			if (i == box.length) {
				i = 0;
			}
		}
		scan.close();
		for (i = 4; i >= 0; i--) {
			System.out.println(box[i]);
		}
		
	}
}
