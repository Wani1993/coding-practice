public class Main2 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		
		int[] copy = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];  // 각각의 인스턴스를 따로 참조하기때문에 밑에서 arr 값을 변경해도 영향을 받지 않는다.
		}
		
		
		
		
		
//		int[] copy = arr;
//		
		arr[0] = 1000; // 참조형 변수를  두개의 배열 이 참조하고있기때문에 값도 같이 바뀐다.
//		
		for (int i = 0; i < copy.length; i++) {
			System.out.println(copy[i]);
		}
				
	}

}
