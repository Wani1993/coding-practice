//100 개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다가 
//0 이 입력되면 0 을 제외하고 그 때까지 입력된 정수를 가장 나중에 입력된 정수부터 차례대로 출력하는 프로그램을 작성하시오.

package practicego;

import java.util.Scanner;

public class prc4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[100];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
			if(a[i] == 0) {
				for (int j = 1; j <= 5; j++) { // 역순으로 출력시 a의 인덱스값이 씩 줄어야하니까 i값에 j값을 빼준다.
					System.out.println(a[i-j]);
				}
				break;
			}
		}
		
		
	}

}
