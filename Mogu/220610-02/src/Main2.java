import java.util.Arrays;
// 2차원 배열 선언 및 출력하기
public class Main2 {
	public static void main(String[] args) {
		// 2 ~ 5 의 제곱수들을 각 원소로 가지는 2차원 배열 선언 초기화 후에 모든 원소 출력해보기
		// 2 4 8 16 32..
		// 3 9 27 81 243...
		// 4 16 64 256..
		// 5 25 125 625 3125...
//		int[] arr1 = { 2, 4, 8, 16, 32 };
//		int[] arr2 = { 3, 9, 27, 81, 243 };
//		int[] arr3 = { 4, 16, 64, 256, 1024 };
//		int[] arr4 = { 5, 25, 125, 625, 3125 };
		
		int[][] arrr = new int[4][5];
//		arrr[0] = arr1;
//		arrr[1] = arr2;
//		arrr[2] = arr3;
//		arrr[3] = arr4;
		
		for (int i = 0; i < arrr.length; i++) {
			int n = 1;
			for (int j = 0; j < arrr[i].length; j++) {
				n *= i + 2;
				arrr[i][j] = n;
			}
		}
		
	//	System.out.println(Arrays.toString(arrr[][]));
		System.out.println(Arrays.deepToString(arrr)); // 중복 배열일때는 이거로 모든 원소 출력
		
//		for (int j = 0; j < arrr.length; j++) {
//			for(int i = 0; i < arrr[j].length; i++) {
//				System.out.print(arrr[j][i] + " ");
//			}
//			System.out.println();
//		}
		
	}
}
