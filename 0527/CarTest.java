class Car {
	//필드 정의
	String color; //색상
	int speed;    //현재 속도
	int gear;     //현재 기어
	void print() {
		System.out.println("(" + color + ", " + speed + ", " + gear + ")");
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car();  // 객체 생성
		myCar.color = "red";
		myCar.speed = 0;        // 객체 필드 변경
		myCar.gear = 1;
		        // 객체의 메소드 호출
		
		// 색상 : blue 속도 : 60 기어 :3
		
	    myCar.color = "blue";
		myCar.speed = 60;        // 객체 필드 변경
		myCar.gear = 3;
	    myCar.print();  
		
		Car yourCar = new Car();
		yourCar.color = "blue";
		yourCar.speed = 60;
		yourCar.gear = 3;
		yourCar.print();
	}
}