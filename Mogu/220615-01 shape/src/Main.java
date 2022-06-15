// 삼각형
// 중심점(x, y)

public class Main {
	public static void main(String[] args) {
//		Shape s1 = new Shape();  // 추상메소드는 인스턴스가 불가하다
//	Shape s2 = new Shape(10,20); 
		
		Shape r = new Rectangle(0, 0, 10, 10);
		System.out.println(r.getArea());
		
		Shape c = new Circle(0, 0, 5);
		System.out.println(c.getArea());
		
		Triangle t = new Triangle(0, 0, 5, 5);
		System.out.println(t.getArea());
	}

}
