
public class ManagerTest {

	public static void main(String[] args) {
		Manager m = new Manager("완", "부산", 300, 930111, 100);
		m.printRRN();
		m.printSalary();
		System.out.println(m.toString());
	}
}
