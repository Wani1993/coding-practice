
public class Box {
	int length;
	int width;
	int height;
	
	public Box() {
		width = 5;
		length = 5;
		height = 5;
	}
	
	
	public int boxSize() {
		return length * width * height;
	}
}
