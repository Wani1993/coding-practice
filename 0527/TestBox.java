public class TestBox {
	public static void main(String[] args) {
		// Box none = null; // null 은 지금 참조하고 있는게 없다 라는 뜻.
		// none.width = 10;  // 컴파일 에러는 안나지만 실행도중 에러가 발생한다.
		
		
		Box box1;
		box1 = new Box();
		
		box1.width = 3;
		box1.length = 3;
		box1.height = 3;
		
		// System.out.println(box1.color);
		
		Box box2 = new Box();
		
		box2.width = 10;
		box2.length = 10;
		box2.height = 10;
		
		//System.out.println("부피 : " + box1.volume);
		System.out.println(box1.getVolume());
		System.out.println(box2.getVolume());
		
		box1.printAllState();
		box2.printAllState();
		
		
		
		// System.out.println(box1.width);
		// System.out.println(box2.width);
		
		// box1.width = 5;
		// System.out.println(box1.width);
	}
}