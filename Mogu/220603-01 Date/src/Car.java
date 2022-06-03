
public class Car {
	private String color;
	private int speed;
	private int gear;
	// 자동차의 시리얼 번호
	private int id;
	// 실체화된 Car 객체의 개수를 위한 정적 변수
	private static int numberOfCars = 0;
	// 객체 외부에 존재하는 다른값 , 왼만하면 프라이빗으로 만드는게 나중에 대비하기 좋다.(변경되면 어디서 바뀌는지 찾기 힘들기 때문에)
	
	public Car(String c, int s, int g) {
		this.color = c;
		this.speed = s;
		this.gear = g;
		// 자동차의 개수를 증가하고 id 번호를 할당한다.
		numberOfCars++;
	    id = numberOfCars;
	}
	
	// 정적 메소드는 항상 존재하기에 필드를 사용하는 행동은 말이안된다. (생성을해야 필드가 생기기때문)
//	public static void printColor() {
//		System.out.println(color);
//	}
	
	public void printStaticNumber() {
		System.out.println(numberOfCars);
	}
	
	// 정적 메소드
	public static int getNumberOfCars() {
		return  numberOfCars; // OK!!
	}
}
