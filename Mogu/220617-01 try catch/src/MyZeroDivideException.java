import java.time.LocalTime;

public class MyZeroDivideException extends RuntimeException { // Runtime 예외로 만들면 try catch를 강요하지 않음
	public MyZeroDivideException(String message) {
		super(message + ", " + LocalTime.now() + "에 발생하였음");
	}
}
