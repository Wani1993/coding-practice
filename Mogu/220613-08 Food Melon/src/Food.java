public class Food {
	private int cal;
	private int prise;
	private int kg;
	
	public Food(int cal, int prise, int kg) {
		this.cal = cal;
		this.prise = prise;
		this.kg = kg;
	}

	public int getCal() {
		return cal;
	}

	public void setCal(int cal) {
		this.cal = cal;
	}

	public int getPrise() {
		return prise;
	}

	public void setPrise(int prise) {
		this.prise = prise;
	}

	public int getKg() {
		return kg;
	}

	public void setKg(int kg) {
		this.kg = kg;
	}
	
	public void testPrint() {
		 System.out.printf("칼로리는 %d 가격은 %,d 중량은 %d\n", cal, prise, kg);
	}
	
	
}
