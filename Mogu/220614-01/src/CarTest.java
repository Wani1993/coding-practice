public class CarTest {
	public static void main(String[] args) {
		Car firstCar = new Car("BMW520d");
		Car secondCar = new Car("BMW520d");
		
		if (firstCar.equals(secondCar)) {
			System.out.println("동일한 종류의 자동차입니다.");
		} else {
			System.out.println("동일한 종류의 자동차가 아닙니다.");
		}
		
		
	}
}
