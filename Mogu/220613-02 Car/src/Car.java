
public class Car {
	// 3개의 필드 선언
	int speed;
	int gear;
	public String color;
	
	public void speedUp(int increment) { // 속도 증가 메소드
		speed += increment;
	}
	
	public void speedDown(int decrement) {
		speed -= decrement;
	}
}
