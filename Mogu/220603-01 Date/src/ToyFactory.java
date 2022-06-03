
public class ToyFactory {
	private String location;
	
	public Toy makeToy() {
		return new Toy("처키인형" , 10000);
	}
}
