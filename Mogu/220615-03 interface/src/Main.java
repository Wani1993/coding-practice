public class Main {
	public static void main(String[] args) {
		Eagle e = new Eagle();
		Bird b = e;
		Animal a = e;
		Flyable f = e;
		
		f.fly();
		
//		Eagle downCasting = ();
		
		Flyable p = new Plane();
		Flyable fish = new FlyingFish();
		
		p.fly();
		fish.fly();
	}

}
