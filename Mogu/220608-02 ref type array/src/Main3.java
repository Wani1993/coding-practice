import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10];
	    int n = 0;
		int k = 0;
		System.out.println("정수 10개를 입력하세요");
		while (k < 10){
			num[n] = scan.nextInt();
			if (num[n] <= 0 || num[n] >= 100) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			k++;
		}
		
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if((10 * i) + 1 <= num[j] && num[j] <= (i + 1) * 10) {
					a[i]++;
				}
			}
		}
		
		
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%02d - %02d : ", (10 * i) + 1, (i + 1) * 10); 
			for(int j = 0; j <= a[i]; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
//		10*0 +1      
//		10*1 + 1
//		10*2 + 1
//		10*3 + 1
//			 
//	    0+1 * 10
//	    1+1 * 10
//	    2+1 * 10
	    
		
		
	}

}
