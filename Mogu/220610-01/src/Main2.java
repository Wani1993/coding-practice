public class Main2 {
	public static void main(String[] args) {
		int number = 22;
		// wrapper class
//		Byte b; // 참조형 변수가 선언된것
//		Short 
//		Integer // int의 wrapper class 형
//		Long
//		Float
//		Double
//		Character // char의 wrapper class 형
//		Boolean
		
		Integer i = new Integer(10); // 숫자 10 이라는 필드를 가진 객체가 생성됨
		Integer i2 = Integer.valueOf(500); // boxing 이라고 칭함
		int primitiveInt = i2.intValue(); // unboxing 이라고 칭함
		
		//System.out.println(primitiveInt);
		Integer auto = 100; // auto-boxing 이라고 칭함 (자동으로 박싱을 해줌)
		int un = auto;
		
		Integer value = Integer.valueOf("5959");
		int result = Integer.valueOf("1234");
		
		Integer.parseInt("90");
	}  
}
