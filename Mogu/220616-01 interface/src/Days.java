
public interface Days {
	int NUM = 10; // static , 상수 이다. 원래 모습은 public static final int num = 10; 
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WENDSDAY = 3;
		
}

interface MyInterface {
	default void printHello() {  // 기본값으로 인터페이스에서도 동작을 할수있도록 만드는 명령어 >> default
		System.out.println("Hello");
	}
	
	public static void myStaticMethod() { // static 한 메소드도 만들수있다.
		
	}
	
	public static String hello() { // static 메소드는 추상메소드가 아니고 정적인 메소드이다.
		return "hello";
	}
	
	static int sum(int a, int b) { // private 한 메소드는 만들수 없다.
		return a + b;
	}
	
}


