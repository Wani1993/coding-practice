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
}
	
class VendingMachine {

	
	public static final int COLA = 1;
	public static final int SPRITE = 2;
	public static final int FANTA = 3;
	
	
	public Can makeCan(int choice) {
		if (choice == COLA) {
			return new Can("COLA");
		} else if (choice == SPRITE) {
			return new Can("SPRITE");
		} else if (choice == FANTA) {
			return new Can("FANTA");
		} else {
			return new Can("HOTSIX");
		}
	}
	
	public Can makeCan(String name) {
		if (name.equals("COLA")) {
			return new Can("COLA");
		} else if (name.equals("SPRITE")) {
			return new Can("SPRITE");
		} else if (name.equals("FANTA")) {
			return new Can("FANTA");
		} else {
			return new Can("HOTSIX");
		}
	}
	
}
	
	



public class Main2 {

	
	// 자판기 메소드
	// 정수형 1 -> Can 객체 : 콜라
	// 문자열 COLA -> Can 객체 : 콜라
	
	public static void main(String[] args) {
		VendingMachine m = new VendingMachine();

		Can can1 = m.makeCan(VendingMachine.COLA);
		
		Can can2 = m.makeCan("COLA");
		
		System.out.println(can1);
		System.out.println(can2.toString());
		
		
		
		
		
		
	}
}