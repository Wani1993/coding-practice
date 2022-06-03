import java.util.Scanner;

public class StudentManage {
	private ClassRoom room;
	
	public Student inputStudent() {
		Scanner scan = new Scanner(System.in);
		System.out.println("학생의 정보. 이름, 국영수 순으로 입력해주세요.");
		String name = scan.nextLine();
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		return new Student(name, kor, eng, math);
	}
	
	public void start() {
		Student stu1 = inputStudent();
		Student stu2 = inputStudent();
		Student stu3 = inputStudent();
		
		room = new ClassRoom(stu1, stu2, stu3);
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴");
		System.out.println("1.학생 이름 보기");
		System.out.println("2.총 평균");
		System.out.println("3.일등 정보");
		System.out.println("4.시스템 종료");
		while(true) {
			int number = scan.nextInt();
			if(number == 1) {
				room.printNames();
			} else if (number == 2) {
				System.out.println("총 평균: " + room.getTotalAvg());
			} else if (number == 3) {
				Student top = room.getTop();
				System.out.println("1등 이름은 : " + top.getName());
				System.out.println("1등 평균 점수는 : " + top.getAverage());
				System.out.printf("1등 점수는 : %d 점 %d 점 %d 점",top.getKor(), top.getEng(), top.getMath());
			} else if (number == 4) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
		}
	}
}
