public class CarTest {
	public static void main(String[] args) {
		Car c = new Car("green", 10, 1);
		Car c2 = new Car("yellow");
		Car c3 = new Car("red", 2, 1);
		
		// c.color = "빨강";
		// System.out.println(c.color);
		// c.print();
		// c2.print();
		// c3.print();
		
		// c.setColor("빨강");
		// System.out.println(c.getColor());
		
		
		c.setColor("빨강");
		System.out.println(c.getColor());
		
		c.setSpeed(100);
		System.out.println(c.getSpeed());
		
		c.setGear(3);
		System.out.println(c.getGear());
		
	}
}