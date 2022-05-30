class Point {
	private int x, y;
	// 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Circle {
	private int radius = 0;
	private Point center;  // Point 참조 변수가 필드로 선언되어있다. has-a 관계
	
	// 생성자
	public Circle(Point p, int r) {
		center = p;
		radius = r;
	}
	//중심점 getter
	public Point getPoint() {
	    return center;
	}
	//중심점 setter
	public void setPoint(Point p) {
		center = p;
	}
}

public class CircleTest {
	public static void main(String[] args) {
		Point p = new Point(25, 78);
		Circle c = new Circle(p, 10);
	}
}