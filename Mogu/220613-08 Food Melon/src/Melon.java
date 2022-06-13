public class Melon extends Food {
	private String origin;

	public Melon(int cal, int prise, int kg, String origin) {
		super(cal, prise, kg);
		this.origin = origin;
	}
	
	public void testPrint() {
		System.out.printf("칼로리는 %d 가격은 %,d 중량은 %d, 원산지는 %s\n", getCal(), getPrise(), getKg(), origin);
	}
	
	
}
