class Can {
	private String name;
	
		
	public Can(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	public Can(int name) {
		if (name == 1) {
			this.name = "콜라";
		} else if (name == 2) {
			this.name = "스프라이트";
		} else if (name == 3) {
			this.name = "환타";
		} else {
			this.name = "핫식스";
		}
	}
	
	
}


public class Main2 {
	public final int COLA = 1;
	public final int SPRITE = 2;
	public final int FANTA = 3;
	
	// 자판기 메소드
	// 정수형 1 -> Can 객체 : 콜라
	
	// 문자열 COLA -> Can 객체 : 콜라
	
	public static void main(String[] args) {
		Can can = new Can(1);
		
		System.out.println(can);
	}
}
