package practicego;

import java.util.Scanner;

public class prc5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] grade = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };
		System.out.println("평균을 구할 반을 입력하세요.");
		int a = scan.nextInt();
		int b = scan.nextInt();
		double sum = grade[a-1] + grade[b-1];
		System.out.printf("%.1f", sum);
		
		
	}
}
