
public class Rectangle extends Shape {
	private int length;
	private int height;
	
	public Rectangle(int x, int y, int length, int heigth) {
		super(x, y);
		this.length = length;
		this.height = height;
	}
	
	

	@Override
	public int getArea() {
		return length * height;
	}



	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeigth() {
		return height;
	}

	public void setHeigth(int heigth) {
		this.height = heigth;
	}
	
	
	
	
}
