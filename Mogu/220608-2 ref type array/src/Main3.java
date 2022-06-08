import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10];
	
		
		System.out.println("정수 10개를 입력하세요");
		for (int i = 0; i < num.length; i++) {
			int a = scan.nextInt();
			num[i] = a;
		}
		int[] count = new int[10];
		for (int i = 0; i < num.length; i++) {
			if(num[i] > 0 && num[i] < 11) {
				count[1] = i + 1;
			} else if (num[i] > 10 && num[i] < 21) {
				count[2] = i + 1;
			} else if (num[i] > 20 && num[i] < 31) {
				count[3] = i + 1;
			} else if (num[i] > 30 && num[i] < 41) {
				count[4] = i + 1;
			}
		}
		
		System.out.println("1-10: " + count[1]);
		System.out.println("11-20: " + count[2]);
		System.out.println("21-30: " + count[3]);
		System.out.println("31-40: " + count[4]);
		
		
	}

}
