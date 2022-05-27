//2번
// 날짜 클래스
// 필드 : 연도, 월, 일
// 메소드 : "2022-05-27"
//        "05/27/22"
import java.util.Scanner;
class Date {
	Scanner scan = new Scanner(System.in);
	String year;
	String month;
	String day;
	void print() {
		System.out.print("1번과 2번중 어떤타입: ");
		int type = scan.nextInt();
		if (type == 1) {
		System.out.println(20 + year + "-" + month + "-" + day);
		} else if (type == 2) {
			System.out.println(month + "/" + day + "/" + year);
		} else {
			System.out.println("잘못된 입력입니다.");
		}
	}
}
	
public class DateTest {
	public static void main(String[] args) {
		Date b = new Date();
		b.year = "22";
		b.month = "05";
		b.day = "27";
		b.print();
	}
}