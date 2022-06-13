public class Phone {
	private String maker;
	private int prise;
	private String gg;
	
	public Phone(String maker, int prise, String gg) {
		this.maker = maker;
		this.prise = prise;
		this.gg = gg;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPrise() {
		return prise;
	}

	public void setPrise(int prise) {
		this.prise = prise;
	}

	public String getGg() {
		return gg;
	}

	public void setGg(String gg) {
		this.gg = gg;
	}
	
	public void testPrint() {
		System.out.printf("제조사는 %s 가격은 %,d 통신타입은 %s\n", maker, prise, gg);
		//return "제조사는 " + maker + " " + "가격은 " + prise + " " + "통신타입은 " + gg; 
	}
	
}
