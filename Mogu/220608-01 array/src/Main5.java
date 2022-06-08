import java.util.Arrays;

public class Main5 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30 };
		int[] temp = { 40, 50, 60 };
		int[] copy = Arrays.copyOf(arr, arr.length);  // 배열의 길이 늘이거나 줄일때 사용하는거
		int[] arr2 = arr;
		
		System.out.println(Arrays.toString(copy));
		System.out.println(Arrays.equals(arr, copy)); // 두 원소의 길이가 같은지 비교해서 같으면 true 다르면 false
		System.out.println(Arrays.equals(arr, arr2)); 
	}
}
