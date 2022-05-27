// 1.                 
// *						
// **			 		
// ***					
// ****				   
// *****
import java.util.Scanner;
public class prc1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("몇줄의 별을 만들것임? ");
		int x = scan.nextInt();
		for (int i = 0; i < x; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
        
		System.out.print("----------------------------------------------------\n");
		
		
		for (int i = 0; i < x; i++) {
			for (int j = x; j > i; j--) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.print("----------------------------------------------------\n");
		

		for (int i = 0; i < x; i++) {    
			for (int j = x-1; j > i; j--) {
				System.out.print("　");
			} for (int j = 0; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
	    System.out.print("----------------------------------------------------\n");
	
	
		for (int i = 0; i < x; i++) {
			for (int j = x-1; j > i; j--) {
				System.out.print("　");
			} for (int j = 0; j <= i; j++) {
				System.out.print("★");
			} for (int j = 1; j <= i; j++) {
				System.out.print("☆");
			}
			System.out.println();
		}
		
	    System.out.print("----------------------------------------------------\n");		
		
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("　");
			}
			for (int j = x; j > i; j--) {
				System.out.print("★");
			} for (int j = x-1; j > i; j--) {
				System.out.print("☆");
			}
			System.out.println();
		}		
		
	}
}