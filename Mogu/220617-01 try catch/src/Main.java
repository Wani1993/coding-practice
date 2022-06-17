import java.util.Scanner;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner scan = new Scanner(System.in);
		
//		try {
//			// 프로그램 흐름 문장
//			// 정상적인 흐름일때는 catch를 거치지 않고 그냥 지나감
//		} catch (예외타입) {
//			// 예외를 처리하는 문장
//		}
		try {		
			
			System.out.println("왼쪽 입력");
			int left = scan.nextInt();
			System.out.println("오른쪽 입력");
			int right = scan.nextInt();
		
			int result = left / right;
			System.out.println(result);
			
			if(right != 0) {
				System.out.println("나눈 몫: " + (left / right));
			} else {
				System.out.println("분모에 0을 입력할수 없습니다.");
			}
		} catch(InputMismatchException e) {
			System.out.println("숫자를 입력해야합니다.");
			e.printStackTrace();  // 예외가 발생한 경로를 출력하라는 메소드
		}
		System.out.println("프로그램 정상종료");
		
	}
}
