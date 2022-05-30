public class Chair2 {
	String production;
	String date;
	int price;
	String model;
	
	public Chair(String p, String d, int p, String m) {
		production = p;
		date = d;
		price = p;
		model = m;
	}
	
	public static void main(String[] args) {
		Chair c = new Chair("시디즈", "2016-09-05", 365000, "T50");
	
	}
}