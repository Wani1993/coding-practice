
public class Employee {
	public String name;
	String address;
	protected int salary;
	private int RRN;
	
	public Employee() {
		
	}
	
	
	public Employee(String name, String address
			, int salary, int RRN) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.RRN = RRN;
	}

	


	public int getRRN() {
		return RRN;
	}




	public String toString() {
		return name + ", " + address + ", " + RRN + ", " + salary;
	}
}
	