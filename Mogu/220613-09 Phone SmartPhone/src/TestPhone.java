
public class TestPhone {
	public static void main(String[] args) {
		Phone p = new Phone("삼성", 1000000, "4G");
		p.testPrint();
		
		SmartPhone s = new SmartPhone("아이폰", 1500000, "5G", "IOS", "8.8", "256G", "유", "유");
		s.testPrint();
	}
}
