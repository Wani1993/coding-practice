public class Car {
	//184p
	// 필드 선언
	private int speed;  
	// 중복메소드: 정수버전
	public void setSpeed(int s) {
		speed = s;
		System.out.println("정수 버전 호출");
	}
	
	// 중복메소드: 실수버전
	public void setSpeed(double s) {
		speed = (int)s;
		System.out.println("실수 버전 호출");
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(100); // 정수 버전 메소드 호출
		myCar.setSpeed(79.2); // 실수 버전 메소드 호출
		
//		myCar.setSpeed(1000L); // double 안에 Long값이 들어갈수있으니까 double 타입으로 찾아간다
//		myCar.setSpeed('a'); // 문자가 숫자로 변환되서 int 타입으로 찾아간다
//		myCar.setSpeed("a"); // 문자열을 찾아갈 타입이 없어서 컴파일 에러가 난다.
	}
}