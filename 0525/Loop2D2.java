// (1, 1) (1, 2) (1, 3) (1, 4)
// (2, 1) (2, 2) (2, 3) (2, 4)
// (3, 1) (3, 2) (3, 3) (3, 4)
// (4, 1) (4, 2) (4, 3) (4, 4)

public class Loop2D2 {
	public static void main(String[] args) {
	    for (int i = 1; i < 5; i++) {
		   	for (int j = 1; j < 5; j++) {
				System.out.printf("(%d, %d) ",i , j);
			}
			System.out.println();
		}
	}
}