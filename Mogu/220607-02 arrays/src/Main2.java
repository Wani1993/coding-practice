public class Main2 {
	public static void main(String[] args) {
		// 길이가 5인 정수(int)형  배열을 선언 초기화 하고
		// 모든 원소(element)의 값을 100으로 설정해보세요.
		int[] bBox = new int[5];
					
		for (int i = 0; i < bBox.length; i++) {
			bBox[i] = 100;
		}
			
//		int idx = 0;
//		bBox[idx] = 100;
//		idx++;
//		bBox[idx] = 100;
//		idx++;
//		bBox[idx] = 100;
//		idx++;
//		bBox[idx] = 100;
//		idx++;
//		bBox[idx] = 100;
//		idx++;
//      반복문을 이용해서 코드를 줄일수 있다.
		
		for (int i = 0; i < bBox.length; i++) {
			System.out.println(i + "번째 index의 원소값 : " + bBox[i]);
		}
		
//		bBox[5] = 100;
		
		System.out.println("프로그램 정상 종료");
	}

}
