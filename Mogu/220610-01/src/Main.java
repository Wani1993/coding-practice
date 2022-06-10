import java.util.Arrays;

public class Main {
	public static void insertionSort(int[] arr) {
		for (int index = 1; index < arr.length; index++) {

			int temp = arr[index];
			int aux = index - 1;

			while ((aux >= 0) && (arr[aux] > temp)) {

				arr[aux + 1] = arr[aux];
				aux--;
			}
			arr[aux + 1] = temp;
		}
	}

	public static void main(String[] args) {
//		Book[] books = new Book[3];
//		books[1] = new Book( "작별인사", "김영하", "복복서가", "장편소설", 12600 );
//		books[1] = new Book( "작별인사", "김영하", "복복서가", "장편소설", 12600 );
//		books[1] = new Book( "작별인사", "김영하", "복복서가", "장편소설", 12600 );
//		
//		Arrays.sort(books); // 정렬 기준을 모르기 때문에 컴파일 에러는 안나지만 실행 에러가 나는 것이다.
		
		int[] arr = { 50, 30, 20, 60, 10 };

		Arrays.sort(arr); // 순서대로 정리해주는 메소드
		insertionSort(arr);
		int index = Arrays.binarySearch(arr, 20); // 중복되는 인덱스가 있으면 안된
		System.out.println("20의 인덱스: " + index);
		
		System.out.println(Arrays.toString(arr));
	
	}
}
