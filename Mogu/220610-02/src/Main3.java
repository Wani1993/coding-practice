import java.util.Arrays;
import java.util.Random;

public class Main3 {
	
	public static void print2D(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(Arrays.toString(array[i]));
			System.out.println(sum(array[i]));
		}
		
		for (int i = 0; i < array[0].length; i++) {
			System.out.print(sum(col(array, i)) + " ");
		}
		System.out.println("7의 개수: " + count(array, 7));
		
	}
	
	
	public static int[][] randomArray() {
		Random random = new Random();
		int[][] array = new int[5][5];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(10);
			}
		}
		return array;
	}
	
	
	public static int sum(int[] array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	
	public static int[] col(int[][] array, int col) {
		int[] columnArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			columnArray[i] = array[i][col];
		}
		return columnArray;
	}
	
	public static int count(int[][] array, int target) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(array[i][j] == target) {
					count++;
				}
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		int[][] randomArray = randomArray();
		
		print2D(randomArray);
//		System.out.println(Arrays.deepToString(randomArray));
//		
//		int sum = 0;
//		int sum2 = 0;
//		for (int j = 0; j < randomArray.length; j++) {
//			for (int i = 0; i < randomArray.length; i++) {
//				sum += randomArray[i][j];
//			}
//			System.out.print(sum + " ");
//			sum = 0;
//		}
//		
//		System.out.println();
//		
//		for (int j = 0; j <randomArray.length; j++) {
//			for (int i = 0; i < randomArray.length; i++) {
//				sum2 += randomArray[j][i];
//			}
//			System.out.print(sum2 + " ");
//			sum2 = 0;
//		}
		
		// 내가 만든거
		
		
		
	
	}
}
