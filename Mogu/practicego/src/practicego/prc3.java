package practicego;

public class prc3 {
	public static void main(String[] args) {
		String[] a = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] == "A" || a[i] == "D" || a[i] == "G") {
				System.out.print(a[i] + " ");
			}
		}
	}
}
