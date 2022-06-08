import java.util.Scanner;

public class Main66 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] b = new int[6];
		while (true) {
			b[5] = scan.nextInt();
			if (b[5] <= 0) {
				break;
			}
			b[0] = b[1];
			b[1] = b[2];
			b[2] = b[3];
			b[3] = b[4];
			b[4] = b[5];
		}
		for (int i = 4; i >= 0; i--) {
			System.out.println(b[i]);
		}
	}

}
