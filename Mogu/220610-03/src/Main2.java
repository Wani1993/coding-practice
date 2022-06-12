class Can {
	private String name;
	
		
	public Can(String name) {
		this.name = name;
	}
	
	

	public Can() {
	
	}



	public String toString() {
		return name;
	}
	
	public Can Can(int name) {
		if (name == 1) {
			System.out.println("COLA");
			return new Can("COLA");
		} else if (name == 2) {
			System.out.println("SPRITE");
			return new Can("SPRITE");
		} else if (name == 3) {
			System.out.println("FANTA");
			return new Can("FANTA");
		} else {
			System.out.println("HOTSIX");
			return new Can("HOTSIX");
		}
	}
	
	public Can Can(String name) {
		if (name.equals("COLA")) {
			System.out.println("콜라");
			return new Can("COLA");
		} else if (name.equals("SPRITE")) {
			System.out.println("사이다");
			return new Can("SPRITE");
		} else if (name.equals("FANTA")) {
			System.out.println("환타");
			return new Can("FANTA");
		} else {
			System.out.println("핫식스");
			return new Can("HOTSIX");
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
		Can can = new Can();
		can.Can("SPRITE");
		
		
		
	}
}