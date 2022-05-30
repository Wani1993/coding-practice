public class Car {
	// private 는 외부에서 변경할수없도록 접근 자체를 금지시킨다.
	private int speed;
	private int gear;
	private String color;
	
	// 첫 번째 생성자
	public Car(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
	}
	
	public Car(String c) {
		this(c, 0, 1);  // 첫 번째 생성자를 호출한다. (자기 자신의 생성자를 호출)
		System.out.println("초기화 과정중!");
	}
	
	//접근(색상)
	public String getColor() {
		return color;
	}
	
	//설정(색상)
	public boolean setColor(String c) {
	    if (c != null) {
			color = c;
			return true;
		} 
		return false;
	}
	// getter <<
	public int getSpeed() {
		return speed;
	}
	// setter <<
	public void setSpeed(int s) {
		speed = s;
	}
	
	public int getGear() {
		return gear;
	}
	
	public void setGear(int g) {
		gear = g;
	}
	
}