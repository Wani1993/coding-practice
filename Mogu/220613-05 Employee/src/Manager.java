
public class Manager extends Employee {
	private int bonus;
	
	public Manager() {
		super();
	}
	
	public Manager(String name, String address
			, int salary, int RRN, int bonus) {
		super(name, address, salary, RRN);
		this.bonus = bonus;
	}

	public void printSalary() {
		System.out.println(name + "(" + address + "):" + (salary + bonus));
	}
	
	public void printRRN() {
		System.out.println(getRRN()); // private 는 서브 클래스에서 접근하지 못한다.
	}
	
}


