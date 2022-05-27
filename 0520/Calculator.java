import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요: ");
		int a = input.nextInt();
		
		System.out.println("사칙연산을 입력하세요: ");
		Scanner output = new Scanner(System.in);
		String wow = output.nextLine();
		
		System.out.println("정수를 입력하세요: ");
		int b = input.nextInt();
		
		if (wow.equals("+")) {
			System.out.println("답은 :" + (a + b));
		} else if (wow.equals("-")) {
			System.out.println("답은 :" + (a - b));
		} else if (wow.equals("*")) {
			System.out.println("답은 :" + (a * b));
		} else if (wow.equals("/")) {
			System.out.println("답은 :" + (a / b));
		} else {
			System.out.println("사칙연산 기호가 아닙니다.");
		}
		
	}
}