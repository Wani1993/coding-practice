import java.util.Arrays;

public class Main4 {
	// 두 개의 정수 배열을 전달받아 결합시켜 반환하는 메소드
	// 예) [1, 2, 3] [10, 11, 12, 13, 14]
	// [1, 2, 3, 10, 11, 12, 13, 14]
	public static int[] concatArray(int[] left, int[] right) {
		int[] newArray = copy(left, right.length);

		for (int i = left.length; i < newArray.length; i++) {
			newArray[i] = right[i - left.length];
		}
		return newArray;
	}

	public static int[] copy(int[] arr, int newLength) {
		int[] larger = new int[arr.length + newLength];
		for (int i = 0; i < arr.length; i++) {
			larger[i] = arr[i];
		}
		return larger;
	}

	public static void main(String[] args) {
		// 두 개의 정수 배열을 전달받아 결합시켜 반환하는 메소드
		// 예) [1, 2, 3] [10, 11, 12, 13, 14]
		// [1, 2, 3, 10, 11, 12, 13, 14]
		int[] aa = { 1, 2, 3 };
		int[] bb = { 10, 11, 12, 13, 14 };
		int[] cc = new int[aa.length + 5];
		for (int i = 0; i < aa.length; i++) {
			cc[i] = aa[i];
		}

		cc[3] = bb[0];
		cc[4] = bb[1];
		cc[5] = bb[2];
		cc[6] = bb[3];
		cc[7] = bb[4];

		System.out.println(Arrays.toString(cc));

		// 두 갱 정수 배열의 합을 가지는 배열의 반환하는 메소드
		// 예) [1, 2, 3] [10, 11, 12, 13, 14]
		// [11, 13, 15, 13, 14]
		int[] aaa = { 1, 2, 3 };
		int[] bbb = { 10, 11, 12, 13, 14 };
		int[] ccc = new int[aaa.length + 2];
		for (int i = 0; i < aaa.length; i++) {
			ccc[i] = aaa[i] + bbb[i];
		}
		ccc[3] = bbb[3];
		ccc[4] = bbb[4];

		System.out.println(Arrays.toString(ccc));

//		
//		int[] arr = { 10 , 20, 30 };
//		
//		int[] larger = new int[arr.length + 2]; // 원래 있던 배열에 추가로 만든 후에 복사본을 만들어서 출력한다.
//		for (int i = 0; i < arr.length; i++) {
//			larger[i] = arr[i];
//		}
//		
//		System.out.println(Arrays.toString(larger));

	}

}
