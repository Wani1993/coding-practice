public class Chair2 {
	String production;
	String date;
	int price;
	String model;
	
	public Chair2(String p, String d, int pr, String m) {
		production = p;
		date = d;
		price = pr;
		model = m;
	}
	
	void print() {
		System.out.println(production);
		System.out.println(date);
		System.out.println(price);
		System.out.println(model);
	}
	
	public static void main(String[] args) {
		Chair2 c = new Chair2("시디즈", "2016-09-05", 365000, "T50");
		Chair2 c2 = new Chair2("허먼밀러", "2019-10-21", 2120000, "뉴 에어론");
		c.print();
		c2.print();
	}
}