
public abstract class Shape { // 추상 클래스
	private int x;
	private int y;
	
	

	
	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	

	public int getX() {
		return x;
	}





	public void setX(int x) {
		this.x = x;
	}





	public int getY() {
		return y;
	}





	public void setY(int y) {
		this.y = y;
	}


 


	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + "]";
	}

	// 추상 메소드 - 동작에 대한 구체적인것이 없다.
	public abstract int getArea(); // 메소드 Head만 존재
	
	



}
